package com.ntuc.advintek.Generatefiles.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntuc.advintek.Generatefiles.config.SOAPConnector;
import com.pb.engageone.ws.common.AuthContext;
import com.pb.engageone.ws.common.AuthContext.UsernameToken;
import com.pb.engageone.ws.common.AuthContext.UsernameToken.Domain;
import com.pb.engageone.ws.common.IntegerIdOrName;
import com.pb.engageone.ws.common.StringIdOrName;
import com.pb.engageone.ws.delivery.DeliverDocument;
import com.pb.engageone.ws.delivery.DeliverDocument.DeliveryOption;
import com.pb.engageone.ws.delivery.DeliverDocument.Template;
import com.pb.engageone.ws.delivery.DeliverDocumentResponse;
import com.pb.engageone.ws.delivery.DeliveryFault;
import com.pb.engageone.ws.model.DeliveryItem;
import com.pb.engageone.ws.model.DeliveryRequest.DeliveryItems;
import com.pb.engageone.ws.model.DeliveryStatus;
import com.pb.engageone.ws.model.ReportFile;
import com.pb.engageone.ws.model.TemplateFileType;

@Service
public class GenerateFilesService {

    @Autowired
    SOAPConnector soapConnector;

    public String generatePDF(String xmlData, String folderPath, String deliveryOption,String dopname) throws Exception {
    	
//    	Path path = Path.of("D:\\Zeron\\test2.txt");
//    	Files.writeString(path,xmlData);

        String result = null;
        try {
            // Initialize the request object
            DeliverDocument request = new DeliverDocument();
            AuthContext authContext = generateAuthContext();
            request.setAuthContext(authContext);
            request.setCommunity("EngageOne_Comm");

            // Generate the template from the XML data
            Template template = genearteTemplate(xmlData,dopname);
            request.setTemplate(template);

            // Generate the delivery option based on logic (SINGLE_ONLINE or DOUBLE_ONLINE)
            DeliveryOption option = generateDeliveryOption(xmlData, deliveryOption);
            request.setDeliveryOption(option);

            Object object = soapConnector.callWebService("http://buaccmv7.uat.income.org.sg:18080/EngageOneWS/DeliveryService", request);

            if (object instanceof DeliverDocumentResponse) {
                DeliverDocumentResponse response = (DeliverDocumentResponse) object;
                if (response != null && response.getDeliveryRequest() != null && 
                    response.getDeliveryRequest().getStatus().equals(DeliveryStatus.DELIVERED)) {

                    DeliveryItems deliveryItems = response.getDeliveryRequest().getDeliveryItems();
                    List<DeliveryItem> list = deliveryItems.getDeliveryItem();
                    for (DeliveryItem deliveryItem : list) {
                    	 
                    	String subfolder = option.getIdent().getName().equals("SINGLE_ONLINE") ? "SINGLE_ONLINE" : "DOUBLE_ONLINE";
                                            	 
                    	String outputFilePath = "";
                    	if(deliveryItem.getDeliveryChannel().getDevice().getType().name().contains("AFP")) {
                    		outputFilePath = Paths.get(folderPath, subfolder, UUID.randomUUID() + ".afp").toString();
                    	}else if(deliveryItem.getDeliveryChannel().getDevice().getType().name().contains("PDF")) {
                    		outputFilePath = Paths.get(folderPath, subfolder, UUID.randomUUID() + ".pdf").toString();
                    	}
                    	
                        // Get the PDF document from the response
                        InputStream inputStream = deliveryItem.getDocument().getData().getDataSource().getInputStream();
                       
                        // Write the output PDF to the corresponding folder (SINGLE_ONLINE or DOUBLE_ONLINE)
                       
                        Files.createDirectories(Paths.get(folderPath, subfolder)); // Create the folder if it doesn't exist
                        //Files.write(Paths.get(outputFilePath), b, StandardOpenOption.CREATE_NEW);
                        Files.copy(inputStream, Paths.get(outputFilePath), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Generated PDF: " + outputFilePath);

                        // Process additional report files if available
                        List<ReportFile> reportFiles = deliveryItem.getReportFiles().getReportFile();
                        for (ReportFile reportFile : reportFiles) {
                            InputStream inputStream2 = reportFile.getData().getInputStream();
                            
                            String reportFilePath = Paths.get(folderPath, subfolder, UUID.randomUUID() + ".txt").toString();
                            //Files.write(Paths.get(reportFilePath), b2, StandardOpenOption.CREATE_NEW);
                            Files.copy(inputStream2, Paths.get(reportFilePath), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Generated report file: " + reportFilePath);
                        }
                    }
                } else {
                    throw new Exception("Failed to generate the document");
                }
            } else {
                if (object instanceof DeliveryFault) {
                    System.out.println("Error: " + ((DeliveryFault) object).getMessage());
                } else {
                    System.out.println("Unknown error: " + object.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Exception during PDF generation: " + e.getMessage());
            throw e;
        }
        return result;
    }

    private DeliveryOption generateDeliveryOption(String xmlData, String deliveryOption) {
        DeliveryOption option = new DeliverDocument.DeliveryOption();
        IntegerIdOrName name = new IntegerIdOrName();
        // Logic to decide whether to use SINGLE_ONLINE or DOUBLE_ONLINE based on the XML data
            name.setName(deliveryOption);
        option.setIdent(name);
        return option;
    }

    private Template genearteTemplate(String str,String dopname) {
        Template template = new Template();
        IntegerIdOrName integerIdOrName = new IntegerIdOrName();
        integerIdOrName.setName(dopname); // Use your actual template name
        template.setIdent(integerIdOrName);

        Template.Files files = new Template.Files();
        Template.Files.File file = new Template.Files.File();
        file.setType(TemplateFileType.ANSWER);

        byte[] bytes = str.getBytes();
        DataHandler dataHandler = new DataHandler(new ByteArrayDataSource(bytes, "application/octet-stream"));
        file.setData(dataHandler);
        List<Template.Files.File> list = new ArrayList<>();
        list.add(file);
        files.getFile().addAll(list);

        template.setFiles(files);
        return template;
    }

    private AuthContext generateAuthContext() throws IOException {
        AuthContext authContext = new AuthContext();
        UsernameToken usernameToken = new UsernameToken();
        Domain domain = new Domain();
        StringIdOrName siv = new StringIdOrName();
        siv.setName("EngageOne_Comm");
        domain.setIdent(siv);
        usernameToken.setDomain(domain);
        usernameToken.setTransientSession(false);
        usernameToken.setUserId("ccmsvc");
        usernameToken.setPassword("ccm$VC1%");
        usernameToken.setOndemand(false);
        authContext.setUsernameToken(usernameToken);
        return authContext;
    }
}

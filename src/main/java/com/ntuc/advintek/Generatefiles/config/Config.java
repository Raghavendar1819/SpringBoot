package com.ntuc.advintek.Generatefiles.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
	
//	@Autowired
//	private CommonProperties commonProperties;
//	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setMtomEnabled(true);
		marshaller.setPackagesToScan("com.pb.engageone.ws");
		return marshaller;
	}

	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		//client.setDefaultUri(commonProperties.getEoiUrl());
		client.setDefaultUri("http://localhost.ntuc.local:18080/EngageOneWS/DeliveryService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		return client;
	}

}
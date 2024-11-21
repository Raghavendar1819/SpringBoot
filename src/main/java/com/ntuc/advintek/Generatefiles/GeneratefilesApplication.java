package com.ntuc.advintek.Generatefiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ntuc.advintek.Generatefiles.service.GenerateFilesService;


@SpringBootApplication
public class GeneratefilesApplication implements CommandLineRunner {

	@Autowired
	GenerateFilesService service;

	public static void main(String[] args) {
		SpringApplication.run(GeneratefilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Ensure that both folder paths are provided as command-line arguments
		if (args.length < 3) {
			System.out.println("Please provide both the source folder and the destination folder as command-line arguments.");
			return;
		}

		// Get the source and destination folder paths from the command-line arguments
		String sourceFolderPath = args[0];
		String destinationFolderPath = args[1];
		String configFile=args[2];

		System.out.println("Processing XML files from folder: " + sourceFolderPath);
		System.out.println("Output folders will be created in: " + destinationFolderPath);

		// Process the XML files and create folders in the destination path
		processXmlFiles(sourceFolderPath, destinationFolderPath,configFile);
	}

	// Method to process XML files and create folders in the destination path
	private void processXmlFiles(String sourceFolderPath, String destinationFolderPath,String configFile) {
		// Define the source folder
		File sourceFolder = new File(sourceFolderPath);

		// Check if the folder exists
		if (sourceFolder.exists() && sourceFolder.isDirectory()) {
			// Get all the XML files in the directory
			File[] files = sourceFolder.listFiles((dir, name) -> name.endsWith(".xml"));

			// Process each XML file
			if (files != null) {
				for (File file : files) {

					// Read the XML data from the file
					String xmlData = readXmlData(file);
					if (xmlData == null) {
						System.out.println("Skipping invalid XML file: " + file.getName());
						continue;
					}
					String deliveryon = deliveryOptionName(file.getName(),configFile);


					// Create a folder for the XML file (without extension)
					String folderName = file.getName().replace(".xml", "");
					File newFolder = new File(destinationFolderPath, folderName);

					// Create the folder if it doesn't exist
					createFolder(newFolder);

					// Create the subfolders: SINGLE_ONLINE and DOUBLE_ONLINE
					createSubfolder(newFolder, "SINGLE_ONLINE");
					createSubfolder(newFolder, "DOUBLE_ONLINE");

					// Now, pass the XML data to the service for PDF generation
					try {
						service.generatePDF(xmlData, newFolder.getAbsolutePath(), "SINGLE_ONLINE",deliveryon);
						service.generatePDF(xmlData, newFolder.getAbsolutePath(), "DOUBLE_ONLINE",deliveryon);
					} catch (Exception e) {
						System.out.println("Failed to generate PDF for file: " + file.getName());
						e.printStackTrace();
					}
				}
			} else {
				System.out.println("No XML files found in the folder.");
			}
		} else {
			System.out.println("Source folder does not exist or is not a directory.");
		}
	}

	// Helper method to read the XML data from a file
	private String readXmlData(File file) {
		try {
			// Read all bytes from the file and convert to String
			return new String(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			System.out.println("Error reading XML file: " + file.getName());
			e.printStackTrace();
			return null;
		}
	}

	// This method extracts the part of the filename you want, based on the pattern you described.
	private String deliveryOptionName(String filename,String configFile) {


		// Split the filename by '-' and return the second part (index 1)
		String[] parts = filename.split("-");
		Set<String> validNames = new HashSet<>();
		
		if (configFile.endsWith(".txt")) {
			Path path = Paths.get(configFile);
			try {
                List<String> lines = Files.readAllLines(path);
                validNames.addAll(lines);
            } catch (IOException e) {
                System.out.println("Error reading the config file: " + configFile);
                e.printStackTrace();
                return null;
            }

		}
		 // Check if any part of the filename is valid
        for (String part : parts) {
            if (validNames.contains(part)) {
                return part;
            }
        }
		
		System.out.println("No valid part found in the filename: " + filename);
		return null;

	}



	// Helper method to create a folder if it doesn't already exist
	private void createFolder(File folder) {
		if (!folder.exists()) {
			if (folder.mkdir()) {
				System.out.println("Created folder: " + folder.getAbsolutePath());
			} else {
				System.out.println("Failed to create folder: " + folder.getAbsolutePath());
			}
		} else {
			System.out.println("Folder already exists: " + folder.getAbsolutePath());
		}
	}

	// Helper method to create a subfolder if it doesn't already exist
	private void createSubfolder(File parentFolder, String subfolderName) {
		File subfolder = new File(parentFolder, subfolderName);

		if (!subfolder.exists()) {
			if (subfolder.mkdir()) {
				System.out.println("Created subfolder: " + subfolder.getAbsolutePath());
			} else {
				System.out.println("Failed to create subfolder: " + subfolder.getAbsolutePath());
			}
		} else {
			System.out.println("Subfolder already exists: " + subfolder.getAbsolutePath());
		}
	}
}

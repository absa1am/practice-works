package com.example.imageupload.services;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

@Service
public class FileStorageService {

    private final Path fileStorageLocation;

    public FileStorageService(Environment environment) {
        fileStorageLocation = Paths.get("env.file.upload-dir", "./storage/images")
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(fileStorageLocation);
        } catch (Exception e) {
            throw new RuntimeException("Could not create the directory for uploading files.");
        }
    }

    private String getFileExtension(String fileName) {
        if (fileName == null) {
            return null;
        }

        String[] fileNameParts = fileName.split("\\.");

        return fileNameParts[fileNameParts.length - 1];
    }

    private String storeFile(MultipartFile file) {
        String fileName = new Date().getTime() + "-file." + getFileExtension(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new RuntimeException("Sorry, filename contains invalid path sequence" + fileName);
            }

            Path targetLocation = fileStorageLocation.resolve(fileName);

            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (Exception e) {
            throw new RuntimeException("Could not store file " + fileName + ". Please, try again.");
        }
    }

}

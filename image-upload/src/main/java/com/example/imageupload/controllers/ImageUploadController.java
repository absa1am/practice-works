package com.example.imageupload.controllers;

import com.example.imageupload.models.Student;
import com.example.imageupload.services.FileStorageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class ImageUploadController {

    private FileStorageService fileStorageService;

    public ImageUploadController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/create")
    public String create(@RequestParam("file") MultipartFile file) {
        System.out.println(file.getOriginalFilename());

        String fileName = file.getOriginalFilename();

        try {
            file.transferTo(new File("/home/dsi/Workspace/image-upload/src/main/resources/static/", fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }

}

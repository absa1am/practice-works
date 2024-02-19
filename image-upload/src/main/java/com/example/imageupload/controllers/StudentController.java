package com.example.imageupload.controllers;

import com.example.imageupload.models.Student;
import com.example.imageupload.services.FileStorageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class StudentController {

    private FileStorageService fileStorageService;

    public StudentController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @GetMapping("student/create")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());

        return "createStudent";
    }

    @PostMapping("/student/create")
    public String createStudent(@ModelAttribute Student student, @RequestParam("image") MultipartFile image) {
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(image.getOriginalFilename());

        return "redirect:/";
    }

}

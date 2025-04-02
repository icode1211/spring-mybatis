package com.estsoft.springmybatis.controller;

import com.estsoft.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudent() {
        int result = studentService.countAll();
        System.out.println("result: " + result);
        return result;
    }
}

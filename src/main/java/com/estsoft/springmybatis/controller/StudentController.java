package com.estsoft.springmybatis.controller;

import com.estsoft.springmybatis.model.Students;
import com.estsoft.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    // 요청 방식: GET /students
    // 혹은 GET /students?id=1
    @GetMapping("/students")
    public List<Students> getStudentList(@RequestParam(required = false) Long id) {
        return studentService.selectStudents(id);
    }
}

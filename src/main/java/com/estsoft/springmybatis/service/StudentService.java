package com.estsoft.springmybatis.service;

import com.estsoft.springmybatis.repository.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int countAll() {
        return studentMapper.countStudents();
    }
}

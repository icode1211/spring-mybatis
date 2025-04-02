package com.estsoft.springmybatis.service;

import com.estsoft.springmybatis.model.Students;
import com.estsoft.springmybatis.repository.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int countAll() {
        return studentMapper.countStudents();
    }

    public List<Students> selectStudents(Long id) {
        return studentMapper.selectStudents(id);
    }
}

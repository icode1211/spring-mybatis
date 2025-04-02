package com.estsoft.springmybatis.repository;

import com.estsoft.springmybatis.model.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    // 각 쿼리의 id를 메소드로 만들기
    int countStudents();

    List<Students> selectStudents(Long id);
}

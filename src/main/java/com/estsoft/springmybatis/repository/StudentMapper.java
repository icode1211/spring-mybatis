package com.estsoft.springmybatis.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    // 각 쿼리의 id를 메소드로 만들기
    int countStudents();
}

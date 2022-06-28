package com.avi.springmvcminiproject.dao;

import com.avi.springmvcminiproject.entity.Student;

import java.util.List;

public interface StudentCustomRepository {
    List<Student> getStudentByName(String name);
}

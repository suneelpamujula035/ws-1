package com.avi.springmvcminiproject.service;

import com.avi.springmvcminiproject.entity.Marks;
import com.avi.springmvcminiproject.pojo.MarksPOJO;

import java.util.List;
import java.util.Optional;

public interface MarksService {
    void save(MarksPOJO marksPOJO);

    List<Marks> findAll();
    Optional<Marks> findById(int id);

    void deleteById(int id);
}

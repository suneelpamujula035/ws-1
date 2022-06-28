package com.avi.springmvcminiproject.serviceimplementation;

import com.avi.springmvcminiproject.dao.MarksRepository;
import com.avi.springmvcminiproject.entity.Marks;
import com.avi.springmvcminiproject.pojo.MarksPOJO;
import com.avi.springmvcminiproject.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarksServiceImpl implements MarksService {
    @Autowired
    private MarksRepository marksRepository;

    public void save(MarksPOJO marksPOJO) {

       Marks marks=new Marks(marksPOJO.getId(),marksPOJO.getMaths(),marksPOJO.getScience());

       marksRepository.save(marks);
    }

    @Override
    public List<Marks> findAll() {
       return marksRepository.findAll();
    }

    @Override
    public Optional<Marks> findById(int id) {
        return marksRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
         marksRepository.deleteById(id);
    }
}

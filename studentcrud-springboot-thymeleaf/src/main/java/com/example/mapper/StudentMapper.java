package com.example.mapper;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Student dtoToEntity(StudentDto studentDto)
    {
        return modelMapper.map(studentDto, Student.class);
    }

    public StudentDto entityToDto(Student student)
    {
        return modelMapper.map(student,StudentDto.class);
    }
}

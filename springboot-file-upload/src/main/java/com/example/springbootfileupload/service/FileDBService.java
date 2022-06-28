package com.example.springbootfileupload.service;

import com.example.springbootfileupload.entity.FileDB;
import com.example.springbootfileupload.repository.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileDBService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public FileDB saveFile(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        FileDB fileDB = new FileDB(UUID.randomUUID().toString(), originalFilename, file.getContentType(), file.getBytes());
        return fileDBRepository.save(fileDB);
    }

    public FileDB getFileById(String id)
    {
        Optional<FileDB> fileDBOptional = fileDBRepository.findById(id);
        if(fileDBOptional.isPresent())
        {
           return fileDBOptional.get();
        }
        else
        {
            return null;
        }
    }

    public List<FileDB> getAllFiles()
    {
        return fileDBRepository.findAll();
    }
}

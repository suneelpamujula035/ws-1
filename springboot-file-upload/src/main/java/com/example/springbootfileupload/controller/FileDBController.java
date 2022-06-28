package com.example.springbootfileupload.controller;

import com.example.springbootfileupload.entity.FileDB;
import com.example.springbootfileupload.service.FileDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileDBController {

    @Autowired
    private FileDBService fileDBService;

    @PostMapping
    public FileDB saveFile(@RequestParam("file") MultipartFile file) throws IOException {
        return fileDBService.saveFile(file);
    }

    @GetMapping("/{id}")
    public FileDB getFile(@PathVariable String id)
    {
        return fileDBService.getFileById(id);
    }

    @GetMapping("/list")
    public List<FileDB> getAllFiles()
    {
        return fileDBService.getAllFiles();
    }
}

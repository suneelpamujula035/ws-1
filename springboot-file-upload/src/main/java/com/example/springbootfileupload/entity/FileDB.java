package com.example.springbootfileupload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FileDB {

    @Id
    private String id;
    private String name;
    private String type;
    @Lob
    private byte[] data;
}

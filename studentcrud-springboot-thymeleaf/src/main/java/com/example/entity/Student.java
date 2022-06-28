package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @NotEmpty(message = "The Name of the Student can't be null or empty")
//    @Size(min = 5, message = "The name should have atleast 5 characters")
    private String name;
    private String email;
    private long phoneNumber;
    private Date dateOfBirth;
    private String hobbies[];
    private String profession;
    private boolean married;
    private String gender;
    private String notes;
}

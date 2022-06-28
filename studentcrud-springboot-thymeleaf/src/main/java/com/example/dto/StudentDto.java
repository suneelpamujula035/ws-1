package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Name is mandatory")
    @Size(min = 4, max = 20, message = "Name size should be between 4 to 20")
    //@Pattern(regexp = "[a-zA-Z ]{1,20}",message = "enter valid name")
    private String name;
    @Email(message = "Entered Email should be valid")
    private String email;
    private long phoneNumber;
    private Date dateOfBirth;
    private String hobbies[];
    private String profession;
    private boolean married;
    private String gender;
    private String notes;
}

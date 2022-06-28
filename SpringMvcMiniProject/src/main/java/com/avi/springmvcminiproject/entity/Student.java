package com.avi.springmvcminiproject.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "age")
    private String age;

    @Column(name = "city")
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    private Marks marks;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Assets> products;


    public Student(int id,String fullName, String age, String city,Marks marks) {
        this.id=id;
        this.fullName = fullName;
        this.age = age;
        this.city = city;
        this.marks=marks;
    }




}

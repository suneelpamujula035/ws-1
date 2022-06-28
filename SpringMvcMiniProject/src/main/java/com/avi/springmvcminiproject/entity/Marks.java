package com.avi.springmvcminiproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "maths")
    private String maths;

    @Column(name = "science")
    private String science;

    public Marks(String maths, String science) {
        this.maths = maths;
        this.science = science;
    }


}

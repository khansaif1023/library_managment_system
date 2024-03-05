package com.acciojob.library_managmenet_system.Entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student_info")
@Getter
@Setter
@NoArgsConstructor //This is like a default constructor
@AllArgsConstructor //This is like a constructor having all the arguments
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollId;

    @Column(nullable=false,unique = true)
    private String name;

    private String branch;

    private  double cgpa;

    private String emailId;

}

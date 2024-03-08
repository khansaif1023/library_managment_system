package com.acciojob.library_managmenet_system.Entities;

import com.acciojob.library_managmenet_system.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(unique = true)
    private String title;

     private Integer noOfPages;
     @Enumerated(value = EnumType.STRING)
     private Genre genre;

     private Integer price;

     @JoinColumn
     @ManyToOne
     private Author author;

}

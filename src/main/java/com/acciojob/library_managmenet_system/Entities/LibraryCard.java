package com.acciojob.library_managmenet_system.Entities;

import com.acciojob.library_managmenet_system.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="card_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    private int noOfBooksIssued;

    private Date validity;


    @JoinColumn
    @OneToOne
    private Student student;

}

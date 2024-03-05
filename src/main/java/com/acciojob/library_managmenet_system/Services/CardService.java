package com.acciojob.library_managmenet_system.Services;

import com.acciojob.library_managmenet_system.CardStatus;
import com.acciojob.library_managmenet_system.Entities.LibraryCard;
import com.acciojob.library_managmenet_system.Repositories.CardRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class CardService {
@Autowired
private CardRepository cardRepository;
    public String generateCard(){


        // I want to save some Cards to the DB

        LibraryCard card=new LibraryCard(); //this object goto the Db and save it
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued(0);

        Date expiryDate=new Date(2028,6,1);
        card.setValidity(expiryDate);

        card=cardRepository.save(card);

        return "The card has been generated with carId"+card.getCardNo();
    }
}

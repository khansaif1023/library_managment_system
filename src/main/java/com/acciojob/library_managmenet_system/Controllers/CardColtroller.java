package com.acciojob.library_managmenet_system.Controllers;

import com.acciojob.library_managmenet_system.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("card")
public class CardColtroller {
    @Autowired
    private CardService cardService;

    @PostMapping("/generateCard")
    public ResponseEntity addCard() {

        String result=cardService.generateCard();
        return new ResponseEntity(result, HttpStatus.OK);

    }

}


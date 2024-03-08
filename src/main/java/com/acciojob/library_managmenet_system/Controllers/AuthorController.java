package com.acciojob.library_managmenet_system.Controllers;

import com.acciojob.library_managmenet_system.Entities.Author;
import com.acciojob.library_managmenet_system.Entities.Book;
import com.acciojob.library_managmenet_system.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;
    @PostMapping("add")
    public String addAuthor(@RequestBody Author author){
    String result=authorService.addAuthor(author);
    return result;
    }
}

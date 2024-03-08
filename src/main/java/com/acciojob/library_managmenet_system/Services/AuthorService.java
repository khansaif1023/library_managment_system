package com.acciojob.library_managmenet_system.Services;

import com.acciojob.library_managmenet_system.Entities.Author;
import com.acciojob.library_managmenet_system.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

   @Autowired
   private AuthorRepository authorRepository;
    public String addAuthor(Author author){
        author.setNoOfBooks(0); //Setting default value as 0 and not be null;
        authorRepository.save(author);
        return "Author has been saved to the DB";

    }
}

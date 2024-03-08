package com.acciojob.library_managmenet_system.Controllers;

import com.acciojob.library_managmenet_system.Entities.Book;
import com.acciojob.library_managmenet_system.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping("add")
    public ResponseEntity addBook(@RequestBody Book book){

        try {

            String result=bookService.addBook(book);
            return new ResponseEntity(result, HttpStatus.OK);

        }catch (Exception e){

            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);

        }
    }

    @PutMapping("/associateBookAndAuthor")
    public String associateBookAndAuthor (@RequestParam("bookId") Integer bookId,
                                          @RequestParam("authorId") Integer authorId){

      String result=bookService.associateBookAndAuthor(bookId,authorId);
      return result;
    }
    @GetMapping("getBookByAuthor")
    public List<Book> getBookByAuthor(@RequestParam ("authorId") Integer authorId){
        List<Book> ansList=bookService.findBooksByAuthor(authorId);
        return  ansList;
    }
}

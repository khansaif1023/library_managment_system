package com.acciojob.library_managmenet_system.Repositories;

import com.acciojob.library_managmenet_system.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}

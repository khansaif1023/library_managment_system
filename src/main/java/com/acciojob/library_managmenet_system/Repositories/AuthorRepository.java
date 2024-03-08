package com.acciojob.library_managmenet_system.Repositories;

import com.acciojob.library_managmenet_system.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}

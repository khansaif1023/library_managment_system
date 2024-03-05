package com.acciojob.library_managmenet_system.Repositories;

import com.acciojob.library_managmenet_system.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {
}

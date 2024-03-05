package com.acciojob.library_managmenet_system.Repositories;

import com.acciojob.library_managmenet_system.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}

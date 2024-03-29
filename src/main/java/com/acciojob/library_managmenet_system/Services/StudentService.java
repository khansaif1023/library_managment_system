package com.acciojob.library_managmenet_system.Services;
import com.acciojob.library_managmenet_system.Services.StudentService;
import com.acciojob.library_managmenet_system.Entities.Student;
import com.acciojob.library_managmenet_system.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student) {

        studentRepository.save(student);
        return "Student has been Saved to the DB";
    }

}

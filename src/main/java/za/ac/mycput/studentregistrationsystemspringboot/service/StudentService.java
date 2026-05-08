package za.ac.mycput.studentregistrationsystemspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Student;
import za.ac.mycput.studentregistrationsystemspringboot.repository.StudentRepository;

import java.util.List;

/*
StudentService.java
Service class for managing Student objects.
Implements the Singleton pattern and provides CRUD operations.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student){
        if(student == null){
            return null;
        }
        return repository.save(student);
    }

    @Override
    public Student read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student update(Student student) {
        if (student == null){
            return null;
        }
        return repository.save(student);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}

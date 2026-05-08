package za.ac.mycput.studentregistrationsystemspringboot.service;

import za.ac.mycput.studentregistrationsystemspringboot.domain.Student;

import java.util.List;

/*
IStudentService.java
Interface defining CRUD operations for Student.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
public interface IStudentService {
    Student create(Student student);

    Student read(String id);

    List<Student> getAll();

    Student update(Student student);

    void delete(String id);
}

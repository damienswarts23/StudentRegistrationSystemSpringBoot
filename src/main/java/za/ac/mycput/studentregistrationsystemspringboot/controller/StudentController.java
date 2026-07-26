package za.ac.mycput.studentregistrationsystemspringboot.controller;

/*
StudentController.java
This controller class is made to manage the project and call functions of the Student Class.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/

import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Student;
import za.ac.mycput.studentregistrationsystemspringboot.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController {

    //Call this Constructor independincy
    private final StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }

    //Post mapping is used to create orders
    @PostMapping
    public Student create(@RequestBody Student student){
        return service.create(student);
    }

    //This allows us to get the object by its id
    @GetMapping("/{id}")
    public Student read(@PathVariable String id){
        return service.read(id);
    }

    //This allows us to get all students
    @GetMapping
    public List<Student> getAll(){
        return service.getAll();
    }

    //Putmapping allows us to update a record
    @PutMapping
    public Student update(@RequestBody Student student){
        return service.update(student);
    }

    //This allows us to delete a object
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

}

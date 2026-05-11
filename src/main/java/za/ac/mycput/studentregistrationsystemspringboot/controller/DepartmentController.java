package za.ac.mycput.studentregistrationsystemspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Department;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Student;
import za.ac.mycput.studentregistrationsystemspringboot.service.DepartmentService;
import za.ac.mycput.studentregistrationsystemspringboot.service.StudentService;

import java.util.List;

/*
DepartmentController.java
This controller class is made to manage the project and call functions of the Department Class.

Author: Damien Swarts (222868791)
Date: 11 May 2026
*/

@RestController
@RequestMapping("/Department")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department create(@RequestBody Department department){
        return service.create(department);
    }

    @GetMapping("/{id}")
    public Department read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping
    public List<Department> getAll(){
        return service.getAll();
    }

    @PutMapping
    public Department update(@RequestBody Department department){
        return service.update(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }


}

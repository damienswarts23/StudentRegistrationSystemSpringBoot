package za.ac.mycput.studentregistrationsystemspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Department;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Student;
import za.ac.mycput.studentregistrationsystemspringboot.repository.DepartmentRepository;

import java.util.List;

/*
DepartmentService.java
Service class for managing Department objects.
Implements the Singleton pattern and provides CRUD operations.

Author: Damien Swarts (222868791)
Date: 11 May 2026
*/
@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department create(Department department){
        if(department == null){
            return null;
        }
        return repository.save(department);
    }

    @Override
    public Department read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }

    @Override
    public Department update(Department department) {
        if(department == null){
            return null;
        }
        return repository.save(department);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}

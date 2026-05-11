package za.ac.mycput.studentregistrationsystemspringboot.service;

import za.ac.mycput.studentregistrationsystemspringboot.domain.Department;

import java.util.List;

/*
IDepartmentService.java
Interface defining CRUD operations for Department.

Author: Damien Swarts (222868791)
Date: 11 May 2026
*/
public interface IDepartmentService {

    Department create(Department department);

    Department read(String id);

    List<Department> getAll();

    Department update(Department department);

    void delete(String id);
}

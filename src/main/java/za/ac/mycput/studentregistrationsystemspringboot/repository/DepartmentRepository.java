package za.ac.mycput.studentregistrationsystemspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Department;

/*
DepartmentRepository.java
Interface refering to the mysql database.

Author: Damien Swarts (222868791)
Date: 11 May 2026
*/
public interface DepartmentRepository extends JpaRepository<Department, String> {
}

package za.ac.mycput.studentregistrationsystemspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.mycput.studentregistrationsystemspringboot.domain.Student;

/*
IStudentRepository.java
Interface refering to the mysql database.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
public interface StudentRepository extends JpaRepository<Student, String> {
}

package za.ac.mycput.studentregistrationsystemspringboot.factory;

import za.ac.mycput.studentregistrationsystemspringboot.domain.Department;

/*
DepartmentFactory.java
Factory class used to create Department objects.
Encapsulates object creation logic for Department entities.

Author: Damien Swarts (222868791)
Date: 11 May 2026
*/

public class DepartmentFactory {
    public static Department createDepartment(String departmentID,String departmentName){
        return new Department.Builder()
                .setDepartmentID(departmentID)
                .setDepartmentName(departmentName)
                .build();
    }
}

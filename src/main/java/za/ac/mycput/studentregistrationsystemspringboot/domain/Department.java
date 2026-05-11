package za.ac.mycput.studentregistrationsystemspringboot.domain;

/*
Department.java
Department class representing an academic department that contains courses.

Author: Damien Swarts (222868791)
Date: 11 May 2026
*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {

    @Id
    private String departmentID;

    private String departmentName;

    public Department() {
    }

    private Department(Builder builder) {
        this.departmentID = builder.departmentID;
        this.departmentName = builder.departmentName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public static class Builder{
        private String departmentID;
        private String departmentName;

        public Builder setDepartmentID(String departmentID) {
            this.departmentID = departmentID;
            return this;
        }

        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Department build(){
            return new Department(this);
        }
    }
}

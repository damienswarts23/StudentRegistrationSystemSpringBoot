package za.ac.mycput.studentregistrationsystemspringboot.factory;

/*
StudentFactory.java
Factory class used to create Student objects.
Utilizes the Builder Pattern for flexible and readable object creation.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
import za.ac.mycput.studentregistrationsystemspringboot.domain.*;

public class StudentFactory {
    public static Student createStudent(String studentID, String firstName, String lastName, Address address,
                                        ContactDetails contactDetails, Gender gender, Race race){
        return new Student.Builder()
                .setStudentID(studentID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setContactDetails(contactDetails)
                .setGender(gender)
                .setRace(race)
                .build();
    }
}

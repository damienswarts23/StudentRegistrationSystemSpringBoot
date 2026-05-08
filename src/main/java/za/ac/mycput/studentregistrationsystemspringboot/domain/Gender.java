package za.ac.mycput.studentregistrationsystemspringboot.domain;

import jakarta.persistence.Embeddable;

/*
Gender.java
Enumeration representing gender categories for a person.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
@Embeddable
public enum Gender {
    MALE,
    FEMALE,
    OTHER
}

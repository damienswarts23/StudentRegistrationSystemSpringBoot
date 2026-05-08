package za.ac.mycput.studentregistrationsystemspringboot.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;

/*
Person.java
Abstract base class representing a generic person.
Provides common attributes shared by Student and Lecturer entities.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
@MappedSuperclass
public abstract class Person {
    protected Address address;
    protected ContactDetails contactDetails;
    protected Gender gender;
    protected Race race;

    protected Person() {
    }

    public Person(Address address, ContactDetails contactDetails, Gender gender, Race race) {
        this.address = address;
        this.contactDetails = contactDetails;
        this.gender = gender;
        this.race = race;
    }

    @Embedded
    public Address getAddress() {
        return address;
    }

    @Embedded
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    @Embedded
    public Gender getGender() {
        return gender;
    }

    @Embedded
    public Race getRace() {
        return race;
    }
}

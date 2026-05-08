package za.ac.mycput.studentregistrationsystemspringboot.domain;

/*
Person.java
Abstract base class representing a generic person.
Provides common attributes shared by Student and Lecturer entities.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
public abstract class Person {
    protected Address address;
    protected ContactDetails contactDetails;
    protected Gender gender;
    protected Race race;

    public Person(Address address, ContactDetails contactDetails, Gender gender, Race race) {
        this.address = address;
        this.contactDetails = contactDetails;
        this.gender = gender;
        this.race = race;
    }

    public Address getAddress() {
        return address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public Gender getGender() {
        return gender;
    }

    public Race getRace() {
        return race;
    }
}

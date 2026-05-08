package za.ac.mycput.studentregistrationsystemspringboot.domain;

/*
ContactDetails.java
ContactDetails class representing contact information
(email and phone number) for a person.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/

import jakarta.persistence.Embeddable;

@Embeddable
public class ContactDetails {
    private String email;
    private String phone;

    public ContactDetails() {
    }

    public ContactDetails(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Email: " + email + ", Phone: " + phone;
    }
}

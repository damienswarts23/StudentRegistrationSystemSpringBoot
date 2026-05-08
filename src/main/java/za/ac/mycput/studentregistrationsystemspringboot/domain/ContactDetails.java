package za.ac.mycput.studentregistrationsystemspringboot.domain;

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

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Email: " + email + ", Phone: " + phone;
    }
}
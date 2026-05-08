package za.ac.mycput.studentregistrationsystemspringboot.domain;

/*
Address.java
Address entity class representing a student's or lecturer's physical address

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/

public class Address {
    private String street;
    private String city;
    private String postalCode;
    private String province;

    public Address(String street, String city, String postalCode, String province) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + postalCode + ", " + province;
    }
}

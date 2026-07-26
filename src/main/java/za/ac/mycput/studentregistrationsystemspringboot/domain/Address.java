package za.ac.mycput.studentregistrationsystemspringboot.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String postalCode;
    private String province;

    public Address() {
    }

    public Address(String street, String city, String postalCode, String province) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address" +street + ", " + city + ", " + postalCode + ", " + province;
    }
}
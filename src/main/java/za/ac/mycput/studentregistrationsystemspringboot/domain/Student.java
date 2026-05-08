package za.ac.mycput.studentregistrationsystemspringboot.domain;

/*
Student.java
Student entity representing a student.
Uses the Builder Pattern for flexible and controlled object creation.
Inherits common attributes from the Person class.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
public class Student extends Person{
    private int studentID;
    private String firstName;
    private String lastName;

    private Student(Builder builder) {
        super(builder.address, builder.contactDetails, builder.gender, builder.race);
        this.studentID = builder.studentID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static class Builder{
        private int studentID;
        private String firstName;
        private String lastName;
        private Address address;
        private ContactDetails contactDetails;
        private Gender gender;
        private Race race;

        public Builder setStudentID(int studentID) {
            this.studentID = studentID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setContactDetails(ContactDetails contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setRace(Race race) {
            this.race = race;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}

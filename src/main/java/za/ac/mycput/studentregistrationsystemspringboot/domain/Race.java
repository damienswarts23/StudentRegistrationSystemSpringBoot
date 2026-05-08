package za.ac.mycput.studentregistrationsystemspringboot.domain;

import jakarta.persistence.Embeddable;

/*
Race.java
Enumeration representing race categories for a person.

Author: Damien Swarts (222868791)
Date: 08 May 2026
*/
@Embeddable
public enum Race {
    AFRICAN,
    COLOURED,
    INDIAN,
    WHITE,
    OTHER
}

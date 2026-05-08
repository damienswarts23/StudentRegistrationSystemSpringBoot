# Student Registration System (Spring Boot)

A backend-based Student Registration System currently being developed using Java, Spring Boot, JPA/Hibernate, and MySQL.

This project is part of my ADP372S coursework and focuses on applying real-world software engineering concepts such as:
- Domain-Driven Design (DDD)
- Test-Driven Development (TDD)
- Builder Pattern
- Factory Pattern
- Repository Pattern
- REST APIs
- Database Persistence with JPA/Hibernate

The system is still under development and more entities/features will be added over time.

---

# Current Progress

## Completed
- Spring Boot project setup
- MySQL database connection
- Student entity creation
- Abstract `Person` superclass
- Embedded classes:
  - Address
  - ContactDetails
- Enum implementation:
  - Gender
  - Race
- JPA/Hibernate mappings
- CRUD testing with Postman
- Repository layer
- Service layer
- Controller layer

## Still In Progress
- Lecturer entity
- Department entity
- Course entity
- Classes entity
- Relationships between entities
- Full CRUD for all entities
- Validation
- Testing layer
- Frontend integration
- Authentication & security

---

# Technologies Used

- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA

---

# Project Structure

```bash
src
└── main
    └── java
        └── za.ac.mycput.studentregistrationsystemspringboot
            ├── controller
            ├── domain
            ├── repository
            ├── service
            └── factory

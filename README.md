# Spring Boot REST CRUD with Native Hibernate/JPA

This project serves as a practical demonstration of building a RESTful API using Spring Boot and Native JPA (Hibernate).

It focuses on the explicit implementation of the DAO (Data Access Object) Pattern. Instead of relying on automated repository interfaces, this application manually manages database interactions using the JPA EntityManager. This approach provides a deep understanding of how ORM (Object-Relational Mapping) works internally.



## 🚀 Overview

The application provides a complete Employee Directory API with full CRUD (Create, Read, Update, Delete) capabilities.

### Key Features
  
  - Manual DAO Implementation: The data access layer is written explicitly using EntityManager and JPQL (Java Persistence Query Language).
  - Service Layer: Handles transaction management using @Transactional.
  - REST Controller: Exposes endpoints using standard Spring MVC annotations.
  - Database Agnostic: Can be configured to work with MySQL, PostgreSQL, or H2.


## 🛠 Tech Stack

  - Java (JDK 21)
  - Spring Boot
  - Spring Data JPA (Hibernate)
  - MySQL Database


## ▶️ Running the project

```json
./mvnw spring-boot:run
```

## 📝 API Endpoints

The API is accessible at http://localhost:8080. 
Below are the available endpoints:
  - GET/api/employees  - retrieve a list of all employees
  - GET/api/employees/{id} - retrieve a specific employee by ID
  - POST/api/employees - create a new employee
  - PUT/api/employees/{id} - update an existing employee
  - DELETE/api/employees/{id} - delete an employee



## 📄 API Documentation (Swagger)

This project includes interactive API documentation powered by Swagger.
You can explore and test all endpoints directly in the browser:

  - http://localhost:8080/swagger-ui/index.html
  - OpenAPI JSON: http://localhost:8080/v3/api-docs

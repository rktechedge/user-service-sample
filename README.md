# User Service – Spring Boot Learning Project

This repository contains a step-by-step Spring Boot learning project built over multiple days to cover core backend concepts required for production-grade microservices.

The goal of this project is structured, incremental mastery of Spring Boot with proper architectural practices.

---

## Tech Stack

- Java 17
- Spring Boot 3.x
- Maven
- H2 (planned)
- Spring Validation
- SLF4J Logging
- Actuator

---

## Completed Features

### Day 1
- Java service-style coding
- Streams & Optional
- Clean layering

### Day 2
- Dependency Injection (Constructor-based)
- @Service / @Repository
- REST Controller (GET)
- DTO pattern
- Global Exception Handling

### Day 3
- application.yml configuration
- Profiles (dev)
- Logging configuration
- Actuator health endpoint

### Day 4
- POST endpoint
- Request body handling
- Bean Validation (@Valid, @Email, @NotBlank)
- Clean validation error response

---

## Architecture

Controller → Service → Repository

- Controllers expose REST endpoints
- Services contain business logic
- Repository handles data access (currently in-memory)
- DTOs protect API contract
- Global exception handling ensures clean API responses

---

## How to Run

```bash
mvn spring-boot:run

http://localhost:8081

GET API
http://localhost:8081/users/1

POST API
http://localhost:8081/users
Body
{
  "id": 6,
  "email": "wrong-email",
  "active": true
}
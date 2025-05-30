# Student Management & DSA Tasks

## Overview

This repository contains:
- **Spring Boot Student Management CRUD API** (in the `student/` directory)
- **Java DSA Programs** (in the root directory)

---

## 1. Student Management CRUD API

A Spring Boot application for managing student records with MySQL database integration.

### Features

- Add a new student
- Retrieve all students
- Retrieve a student by ID
- Update student details
- Delete a student

### API Endpoints

| Method | Endpoint            | Description                | Request Body                |
|--------|---------------------|----------------------------|-----------------------------|
| POST   | `/students`         | Add a new student          | `{ "id": 1, "name": "...", "age": 20, "email": "..." }` |
| GET    | `/students`         | Get all students           | -                           |
| GET    | `/students/{id}`    | Get student by ID          | -                           |
| PUT    | `/students/{id}`    | Update student by ID       | `{ "name": "...", "age": 21, "email": "..." }`           |
| DELETE | `/students/{id}`    | Delete student by ID       | -                           |

### Technologies Used

- Java 17
- Spring Boot 3.5.0
- Spring Data JPA
- MySQL
- Lombok

### How to Run

1. Configure your MySQL database in [`application.properties`](student/src/main/resources/application.properties).
2. Build and run the application:
   ```sh
   cd student
   ./mvnw spring-boot:run
   ```
3. Access the APIs at `http://localhost:8080/students`

---

## 2. DSA Java Programs

Standalone Java programs for common DSA problems:

- [`program1LongestSubString.java`](program1LongestSubString.java): Find the length of the longest substring without repeating characters.
- [`program2MaximumPathSum.java`](program2MaximumPathSum.java): Find the maximum path sum in a matrix.
- [`program3CoinChange.java`](program3CoinChange.java): Count the number of ways to make change for a given amount.

---


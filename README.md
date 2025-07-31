# Library Management System

## Project Structure
```
src/main/java/com/lms/
├── LibraryManagementSystemApplication.java
├── config/         # Configuration classes
├── controller/     # REST controllers
├── model/         # Entity classes
├── repository/    # JPA repositories
└── service/       # Business logic
```

## Technology Stack
- Spring Boot 3.1.3
- Spring Security
- Spring Data JPA
- MySQL Database
- Maven
- Java 17
- Lombok
- Spring Validation

## Getting Started
1. Configure MySQL database credentials in `application.properties`
2. Build the project: `mvn clean install`
3. Run the application: `mvn spring-boot:run`

## Default Credentials
- Username: admin
- Password: admin

## Features (To Be Implemented)
- Book Management
- Member Management
- Borrowing Management
- User Authentication
- Role-based Access Control

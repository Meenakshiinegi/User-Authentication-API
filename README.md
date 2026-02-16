# User Authentication API

A secure and scalable RESTful authentication system built using Spring Boot and JSON Web Tokens (JWT).  
This project demonstrates modern backend security practices including token-based authentication, password encryption, and role-based authorization.

---

##  Project Overview

This backend application provides a complete authentication mechanism for web applications.  
It ensures secure user registration, login, and access to protected APIs using stateless authentication.

##  Core Features

### User Registration
- New users can create accounts.
- Passwords are encrypted using BCrypt before storing in the database.
- Validation ensures secure credential handling.

### User Login
- Users authenticate using username and password.
- Credentials are validated using Spring Security.
- A signed JWT token is generated upon successful authentication.

### JWT Token-Based Authentication
- Stateless session management.
- Token contains encoded user information.
- Token must be sent in the Authorization header.

### Secured API Endpoints
- Protected routes require a valid JWT token.
- Unauthorized access returns proper HTTP error responses.

### Role-Based Access Control (RBAC)
- Supports role-based access (e.g., USER / ADMIN).
- Access to endpoints can be restricted based on user roles.

### Custom JWT Filter
- Intercepts incoming requests.
- Extracts and validates JWT.
- Sets authentication in SecurityContext.

### Exception Handling
- Custom authentication entry point for handling unauthorized requests.
- Proper HTTP status responses (401, 403).

## 🛠️ Technologies Used

### Backend
- Java 11
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)

### Database & Persistence
- MySQL
- Spring Data JPA
- Hibernate ORM

### Build & Tools
- Maven
- Postman (API testing)
- Git & GitHub

# API Endpoints

# Authentication
 **POST** `/auth/login`  
  Authenticates user credentials and returns a JWT token.

# Protected APIs
 **GET** `/home/user`  
  Returns user data (requires valid JWT token).

 **GET** `/home/current-user`  
  Returns the currently authenticated user's username.

# Security Flow
1. User sends login request with credentials.
2. Server validates credentials.
3. JWT token is generated and returned to the client.
4. Client sends the token in the `Authorization` header for protected requests.
5. JWT filter validates the token and allows access to secured endpoints.


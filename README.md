# User Authentication API

##  Project Overview

A secure and scalable RESTful authentication system built using Spring Boot and JSON Web Tokens (JWT).  
This project demonstrates modern backend security practices including token-based authentication, password encryption, and role-based authorization
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
- The JWT Token must be sent in the Authorization header.

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

## Technologies Used

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

## Controllers Documentation

This section provides a concise overview of the REST controllers and their exposed endpoints.

---

## AuthController

**Base Path:** /auth

### POST /auth/signup
Registers a new user and returns a JWT token on successful registration.

**Request Body:**
````json
{
  "email": "user@example.com",
  "fullName": "User Name",
  "role": "USER",
  "password": "your_password"
}
````

**Response:** JWT token with role  
**Status:** 201 Created

---

### POST /auth/signin
Authenticates an existing user and returns a JWT token.

**Request Body:**
```json
{
  "email": "user@example.com",
  "password": "your_password"
}
```

**Response:** JWT token with role  
**Status:** 200 OK

---

## HomeController

**Base Path:** /

### GET /home
Protected endpoint that requires a valid JWT token.

**Header Required:**
Authorization: Bearer <JWT_TOKEN>

**Status:** 200 OK



## Security Flow

The authentication and authorization process follows a JWT-based stateless mechanism.

1. User sends a login request with credentials (email & password).
2. Spring Security validates the credentials using AuthenticationManager.
3. If credentials are valid, a signed JWT token is generated.
4. The JWT token is returned to the client in the response.
5. The client stores the token and includes it in the Authorization header for protected requests.
6. JWTAuthenticationFilter intercepts incoming requests.
7. The filter extracts and validates the token.
8. If the token is valid, the user is authenticated and access to secured endpoints is granted.
9. If token is invalid or missing, access is denied with 401 Unauthorized.
10. If the token is expired, the client must log in again to obtain a new JWT token.



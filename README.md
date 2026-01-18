# User Authentication API

User Authentication API is a backend RESTful application built using Spring Boot that provides secure user authentication and authorization using JSON Web Tokens (JWT). The project demonstrates standard backend security practices such as token-based authentication, stateless sessions, and protected API endpoints.

This API can be used as a base for real-world applications that require secure login, role-based access, and user identity validation.

# Features
- User login with username and password
- JWT generation on successful authentication
- Secure access to protected REST endpoints
- Stateless authentication using JWT
- Spring Security integration
- Custom authentication filter and entry point

## Tech Stack
- Java  
- Spring Boot  
- Spring Security  
- JWT (JSON Web Token)  
- Maven  

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


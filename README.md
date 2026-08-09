# Java Full Stack Contact Management System

A complete Java Full Stack Contact Management System developed as part of the Maincrafts Java Full Stack Internship.

The project progressively combines the requirements from Tasks 1 to 6 into one complete application.

## 🚀 Features

- Modern landing page
- Contact form
- Spring Boot backend
- MySQL database
- Spring Data JPA
- REST APIs
- Contact management dashboard
- Create, read, update and delete contacts
- Bean Validation
- Pagination and sorting
- Global exception handling
- Spring Security
- BCrypt password hashing
- JWT-based stateless authentication
- User registration and login
- ADMIN and USER roles
- Role-based authorization
- Custom 401 and 403 responses
- React frontend
- Axios API integration
- JWT storage
- Axios authentication interceptor
- Protected routes
- Role-based UI

## 🛠️ Tech Stack

### Frontend
- React
- JavaScript
- HTML
- CSS
- Axios
- React Router

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- JJWT
- Bean Validation

### Database
- MySQL

### Tools
- IntelliJ IDEA
- MySQL
- Postman
- Git
- GitHub

## 📚 Task Progression

### Task 1 — Full Stack Foundation
- Landing page
- Contact form
- Spring Boot backend
- Form submission handling

### Task 2 — Database Integration
- MySQL integration
- Spring Data JPA
- Contact persistence

### Task 3 — Contact Dashboard
- REST API
- Fetch contacts
- Dynamic contact table

### Task 4 — Authentication
- Spring Security
- Login
- ADMIN role
- Protected contact dashboard

### Task 5 — Contact Management
- CRUD operations
- Validation
- Pagination
- Sorting
- Error handling

### Task 6 — JWT Security
- JWT authentication
- Stateless security
- User registration
- ADMIN / USER roles
- JWT filter
- Axios interceptor
- Protected React routes
- Custom 401 / 403 responses

## 🔐 Role Permissions

| Feature | USER | ADMIN |
|---|---:|---:|
| Register | ✅ | ✅ |
| Login | ✅ | ✅ |
| View Contacts | ✅ | ✅ |
| Add Contact | ❌ | ✅ |
| Edit Contact | ❌ | ✅ |
| Delete Contact | ❌ | ✅ |

## 📁 Project Structure

```text
contact-management/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │
│   └── test/
│
├── pom.xml
├── README.md
└── ...
# Online Learning Management System

## Project Overview

The Online Learning Management System (LMS) is a web application designed to manage the educational process, including course creation, enrollment, and grading. The system will support multiple roles such as administrators, instructors, and students, providing each with the tools they need to manage their respective tasks.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
  - [User Management](#user-management)
  - [Course Management](#course-management)
  - [Enrollment Management](#enrollment-management)
  - [Grading System](#grading-system)
  - [Authentication and Authorization](#authentication-and-authorization)
- [Technology Stack](#technology-stack)
- [API Endpoints](#api-endpoints)
  - [User Endpoints](#user-endpoints)
  - [Course Endpoints](#course-endpoints)
  - [Enrollment Endpoints](#enrollment-endpoints)
  - [Grading Endpoints](#grading-endpoints)
- [Frontend Structure](#frontend-structure)
- [Database Schema](#database-schema)

## Features

### User Management

- **User Registration**: Allows new users to create accounts.
- **User Login**: Allows users to log in to the system.
- **User Roles**: Different roles for administrators, instructors, and students.
- **Profile Management**: Users can view and update their profiles.

### Course Management

- **Course Creation**: Administrators and instructors can create and manage courses.
- **Course Listing**: Users can view a list of available courses.
- **Course Details**: Users can view detailed information about each course.

### Enrollment Management

- **Enrollment**: Students can enroll in courses.
- **View Enrollments**: Instructors can view students enrolled in their courses.
- **Enrollment Status**: Students can view the status of their enrollments.

### Grading System

- **Grade Entry**: Instructors can enter grades for students.
- **View Grades**: Students can view their grades.
- **Grade Calculation**: The system calculates final grades based on assessments.

### Authentication and Authorization

- **JWT Authentication**: Secure authentication using JSON Web Tokens.
- **Role-Based Access Control**: Access control based on user roles.

## Technology Stack

- **Frontend**: React.js, React Router
- **Backend**: Spring Boot, Spring Security, JWT
- **Database**: MongoDB (NoSQL)
- **Tools**: Postman for API testing, GitHub for version control

## API Endpoints

### User Endpoints

- `POST /api/auth/register`: Register a new user
- `POST /api/auth/login`: Log in a user
- `GET /api/users/profile`: Get user profile

### Course Endpoints

- `POST /api/courses`: Create a new course
- `GET /api/courses`: Get a list of courses
- `GET /api/courses/{id}`: Get course details by ID

### Enrollment Endpoints

- `POST /api/enrollments`: Enroll in a course
- `GET /api/enrollments`: Get a list of enrollments
- `GET /api/enrollments/{id}`: Get enrollment details by ID

### Grading Endpoints

- `POST /api/grades`: Enter a grade
- `GET /api/grades`: Get a list of grades
- `GET /api/grades/{id}`: Get grade details by ID




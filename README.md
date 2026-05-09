# Pathology Lab Management System

A full-stack Pathology Lab Management System developed using:

* Java 17
* Spring Boot 3
* MySQL
* Angular 17
* Bootstrap 5

This project helps pathology laboratories manage:

* Test Master
* Patient Test Orders
* Result Entry
* Order Tracking

---

# Tech Stack

## Backend

* Java 17
* Spring Boot 3
* Spring Data JPA
* MySQL
* Maven
* Lombok

## Frontend

* Angular 17
* TypeScript
* Bootstrap 5

---

# Project Structure

```text
pathology-system/
│
├── pathology-backend/
│
├── pathology-ui/
│
└── README.md
```

---

# Backend Setup

## 1. Clone Repository

```bash
git clone <your-repository-url>
```

---

## 2. Create MySQL Database

Open MySQL Workbench and run:

```sql
CREATE DATABASE pathology_lab;
```

---

## 3. Configure Database

Update:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/pathology_lab
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 4. Run Backend

Inside backend folder:

```bash
mvn spring-boot:run
```

Backend runs on:

```text
http://localhost:8080
```

---

# Frontend Setup

## 1. Install Dependencies

Inside frontend folder:

```bash
npm install
```

---

## 2. Run Angular Application

```bash
ng serve
```

Frontend runs on:

```text
http://localhost:4200
```

---

# Features

## Test Master

* Add pathology tests
* View all tests

## Test Orders

* Create patient orders
* Track order status

## Result Entry

* Save pathology test results
* Add technician notes

---

# API Endpoints

## Test APIs

### Create Test

```http
POST /api/tests
```

### Get All Tests

```http
GET /api/tests
```

---

## Order APIs

### Create Order

```http
POST /api/orders
```

### Get Today Orders

```http
GET /api/orders/today
```

---

## Result APIs

### Save Result

```http
POST /api/results/{orderId}
```

---

# Screens

* Test Master Screen
* Order Management Screen
* Result Entry Screen

---

# Future Improvements

* Authentication & Authorization
* JWT Security
* PDF Report Generation
* Dashboard Analytics
* Search & Filters
* Docker Deployment
* Role-Based Access

---

# Author

Developed by Kriya Mulani

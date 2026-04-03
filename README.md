# Inventory Management Service

A backend API for order and inventory management built with Spring Boot and PostgreSQL.  
This system manages item data and processes orders by performing **stock check → stock deduction → order creation** as one safe transaction.

---

## Overview

This project is a learning and portfolio application designed with practical backend architecture in mind.

Instead of being just a simple CRUD app, it focuses on:

- Clear separation of responsibilities with Layered Architecture
- Transaction management using `@Transactional`
- Custom exception handling for out-of-stock cases
- Reproducible local development with Docker
- Persistent storage with PostgreSQL

---

## Main Features

### Item Management

- Create items
- Get all items
- Get item details
- Update item information
- Manage stock quantity

### Order Management

- Create an order for an item
- Check stock before placing an order
- Deduct stock only when enough inventory is available
- Save order history

### Error Handling

- Reject orders when stock is insufficient
- Reject orders for non-existing items
- Validate invalid input values

---

## Tech Stack

| Category | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3.x |
| Database | PostgreSQL 15 |
| ORM | Spring Data JPA |
| Container | Docker / Docker Compose |
| Build Tool | Maven |
| DB Client | DBeaver |
| IDE | VS Code |

---

## Project Goal

The core purpose of this system is to preserve inventory consistency during order processing.

When an order is placed, the system performs the following three actions as one unit:

1. Check stock
2. Deduct stock
3. Save the order

Using `@Transactional`, these steps are handled as a single transaction:

- if all steps succeed, the transaction is committed
- if one step fails, everything is rolled back

---

## Architecture

This project follows a 5-layer architecture.

| Layer | Responsibility |
|---|---|
| Controller | Entry point for API requests |
| Service | Contains business logic |
| Repository | Handles database access |
| Entity | Represents database tables as Java classes |
| DTO | Represents request and response data |

### Flow

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
PostgreSQL
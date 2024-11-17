# REST Swagger Product Management

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [License](#license)

## Overview
This project is a Spring Boot-based RESTful API designed for product management. It provides functionality to create, view, update, delete, and retrieve products with pagination and filtering options. The application utilizes Spring Boot to build REST services and Spring Data for database interactions.

### Features
- **Product Management**: Create, read, update, and delete products.
- **Pagination**: Efficient product listing with pagination support.
- **Filtering**: Filter products by category and price range.

## Usage
1. **Setup and Deployment**:
    - Clone the repository to your local machine.
    - Build the application with Maven.
    - Set up your database configuration in the `application.properties` file.
    - Run the application.

2. **Access the API**:
    - The API can be accessed at `http://localhost:8080/api/products`.
    - Use Postman, cURL, or any other API client to interact with the endpoints.

3. **API Endpoints**:
    - **GET** `/api/products`: Retrieve a paginated list of products, with optional filters for category and price range.
    - **GET** `/api/products/{id}`: Get a specific product by its ID.
    - **POST** `/api/products`: Add a new product.
    - **PUT** `/api/products/{id}`: Update an existing product by its ID.
    - **DELETE** `/api/products/{id}`: Remove a product by its ID.

## License
This project is licensed under the MIT License. For more details, see the [LICENSE](LICENSE) file.
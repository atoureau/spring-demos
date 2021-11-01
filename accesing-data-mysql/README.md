# Accesing Data MySQL

This demo shows how to connect to MySQL Server and perform some basic CRUD operations to the database by handling HTTP Requests.

## Summary

We will send HTTP Requests to the server in order to create, retrieve or delete users in the MySQL database.

| Dependency      | Required |
| --------------  | :------: |
| Spring Web      | ✔️ |
| Spring Data JPA | ✔️ |
| MySQL Driver    | ✔️ |
| Lombok          | ❌ |

## Spring Data

In this demo we use **Spring Data JPA** to handle all the neccesary logic to implement some CRUD operations in the MySQL database for the given entity, which is user in this demo.

You may follow this steps to replicate this demo:

- *Configure application properties*: It's a properties file for the application. We will set properties such as the server port and the database connection. This file resides in **src/main/resources/** 

- *Create an entity*: It's a POJO which represents what we want to model, we will perform CRUD operations on it.

- *Create a repository*: It's an interface which inherits all the CRUD operations for the given entity.

- *Create a controller*: It's a class which handles HTTP Requests and maps those requests to its methods.

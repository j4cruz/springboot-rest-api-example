# Spring Boot REST API example

A Spring Boot REST API example to create, read, update and delete a list of personal portfolio projects.

It contains the following entities with CRUD operations:
1. Projects
2. Image (A project can have many Images, An image can be assigned to one project - One to many)
3. Technology (A project can have many technologies, A technology can exist in many projects - Many to many) 

The postman collection can be found at `Spring Boot MVC Projects API.postman_collection.json`

## Prerequisites

The following installed:

1. Java (JDK 8)
2. Maven
3. Spring Tool Suite

## Running from the command line

1. Run `mvn clean install`
2. Run `java -jar target/springboot-rest-api-example-1.0.0-SNAPSHOT.jar`

## Running from Spring Tool Suite

1. Import the project into Spring Tool Suite
2. Right click project -> Run as -> Spring Boot App

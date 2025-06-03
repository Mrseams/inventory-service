# Inventory Service

This is a Spring Boot-based inventory service application that uses Jakarta EE with Spring Data JPA.

## Getting Started

### Prerequisites
* Java 21
* Maven
* Docker (for running MySQL database)

### Database Setup
The application uses MySQL as its database. You can start the database using Docker Compose:

```bash
docker-compose up -d
```
./mvnw clean package
java -jar target/inventory-service-0.0.1-SNAPSHOT.jar

## Technologies Used
- Spring Boot
- Jakarta EE
- Spring Data JPA
- MySQL
- Lombok
- Docker

## Project Structure

.
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── mysql/          # MySQL configuration
├── .mvn/          # Maven wrapper directory
├── docker-compose.yml
└── pom.xml


## Reference Documentation
For further reference, please consider the following sections:
- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/html/)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#data.sql.jpa-and-spring-data)
- [Spring Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#web)


This HELP.md file provides:
1. A brief description of the project
2. Setup and running instructions
3. List of key technologies used
4. Project structure overview
5. References to relevant documentation

The content is based on the actual project structure I observed, including:
- The presence of Docker Compose configuration
- Maven wrapper setup
- Spring Boot application with JPA
- MySQL database usage
- Java 21 environment
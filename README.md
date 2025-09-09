# Chat App

This is a simple chat application built with Spring Boot and WebSocket.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Java 17 or higher
* Maven 3.6 or higher

### Building and Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/scolerad134/chat-app
   cd chat-app
   ```
2. Build the project using Maven:
   ```bash
   ./mvnw clean install
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

The application will be accessible at `http://localhost:8080`.

## Docker

To build and run the application using Docker:

1. Build the Docker image:
   ```bash
   docker build -t chat-app:0.0.1-SNAPSHOT .
   ```
2. Run the Docker container:
   ```bash
   docker run -p 8080:8080 chat-app:0.0.1-SNAPSHOT
   ```

The application will be accessible at `http://localhost:8080`.

## Technologies Used

* Spring Boot
* WebSocket
* Maven
* HTML, CSS, JavaScript

## Project Structure

```
chat-app/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── chat/
│   │   │           ├── ChatAppApplication.java
│   │   │           ├── config/
│   │   │           │   ├── WebSocketConfig.java
│   │   │           │   └── WebSocketEventListener.java
│   │   │           ├── controller/
│   │   │           │   └── ChatController.java
│   │   │           └── dto/
│   │   │               ├── ChatMessage.java
│   │   │               └── enums/
│   │   │                   └── MessageType.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           ├── css/
│   │           │   └── main.css
│   │           ├── index.html
│   │           └── js/
│   │               └── main.js
│   └── test/
│       └── java/
│           └── com/
│               └── chat/
│                   └── ChatAppApplicationTests.java
├── pom.xml
├── mvnw
├── mvnw.cmd
├── Dockerfile
└── README.md
```

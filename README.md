Backed Side
---------------------
The project is a weather application developed using the Spring Boot framework. It provides RESTful APIs to store and retrieve weather data for specific locations. The backend is implemented using Spring Web, Spring Data JPA, and MySQL.

Dependencies:

The project utilizes the following dependencies:

Spring Web: To build RESTful APIs and handle HTTP requests.
Spring Data JPA: To interact with the database using the Java Persistence API (JPA).
Lombok: To reduce boilerplate code by generating getters, setters, constructors, and other common methods.
MySQL: As the relational database management system.
Entity Class:

The Weather class is an entity class representing weather information. It includes fields such as id, location, condition, temperature, and humidity. The class is annotated with @Entity to indicate it is a JPA entity. Lombok annotations @Getter and @Setter are used to generate getter and setter methods for the fields.

Repository Interface:

The WeatherRepository interface extends the CrudRepository interface provided by Spring Data JPA. It includes the method findByLocation to retrieve weather data based on the location.

Service Class:

The WeatherService class is a service class responsible for handling business logic related to weather data. It is annotated with @Service to indicate it is a Spring service bean. It includes methods to save weather data and retrieve data by location. The service class uses the WeatherRepository for database operations.

Controller Class:

The WeatherController class is a REST controller that handles HTTP requests related to weather data. It is annotated with @RestController and @RequestMapping to specify the base URL for the weather-related endpoints. The controller includes methods for saving weather data and retrieving data by location. It utilizes the WeatherService to perform the necessary operations.

CommandLineRunner:

The Weather1AppApplication class implements the CommandLineRunner interface and serves as the entry point of the application. It runs the code inside the run method when the application starts. In this case, it initializes and saves weather data for several locations using the WeatherService.

Improvements:

Consider using environment-specific configuration files to store database credentials and other configuration settings instead of hardcoding them in the code.
Implement error handling and validation for the API endpoints to handle exceptions and provide appropriate responses to the client.
Add unit tests to ensure the correctness of the implemented functionality.
Implement pagination and sorting options for retrieving weather data.
Apply logging to track application behavior and debug potential issues.
Consider using DTOs (Data Transfer Objects) to decouple the API contract from the entity classes.
Implement proper exception handling and error responses for exceptional cases, such as duplicate entries or invalid input.
Consider adding authentication and authorization mechanisms to secure the APIs if required.
-----------------------------------------------------------------------------------------
Front-End
-------------------------------
The frontend of the weather application is developed using Angular version 14. It includes a service and a component to retrieve and display weather data. The service communicates with the backend API to fetch the saved data from the database, while the component handles the rendering of the retrieved data on the screen.

Angular Version:

Angular version 14 is used for the frontend development.

Service:

The service is responsible for making HTTP requests to the backend API to retrieve the weather data. It utilizes Angular's HttpClient module to send GET requests to the appropriate API endpoint. The retrieved data is returned as an Observable that can be subscribed to by the component.
--------------------------------------
AWS
-----------------------------

The deployment of the weather application on AWS involves creating an EC2 instance with Red Hat Linux OS and using Mobaxterm to connect to the instance. Java, MySQL, and Tomcat server are installed on the instance. The project folder containing the application is deployed by pushing a WAR file to Mobaxterm, and finally, the Tomcat server is started to make the project accessible on AWS.

Deployment Steps:

AWS Setup:

Create an EC2 instance on AWS with Red Hat Linux OS.
Generate a key pair to establish a secure connection to the instance.
Configure the necessary security groups to allow incoming traffic.
Mobaxterm Configuration:

Install Mobaxterm on the local machine.
Launch Mobaxterm and establish a connection to the EC2 instance using the generated key pair.
Set up the necessary SSH settings to establish a secure connection.
Environment Setup:

Install Java Development Kit (JDK) on the EC2 instance using Mobaxterm.
Install MySQL database on the EC2 instance using Mobaxterm.
Install Apache Tomcat server on the EC2 instance using Mobaxterm.
Deploying the Project:

Package the weather application as a WAR (Web Application Archive) file.
Push the WAR file to the EC2 instance using Mobaxterm.
Copy the WAR file to the appropriate location in the Tomcat server's deployment directory.
Start the Tomcat server using Mobaxterm.
Verification:

Access the application by entering the EC2 instance's public IP address or domain name in a web browser.
Verify that the weather application is running and accessible on AWS.

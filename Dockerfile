# Use OpenJDK base image
FROM eclipse-temurin:17-jre-alpine

# Set working directory inside container
WORKDIR /

# Copy jar file into container
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

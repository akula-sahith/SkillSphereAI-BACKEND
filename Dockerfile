# Use OpenJDK 17 runtime
FROM openjdk:24-jdk-slim

# Set working directory
WORKDIR /app

# Copy your JAR file from target folder
COPY target/SkillSphereAI-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Spring Boot default is 8080)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

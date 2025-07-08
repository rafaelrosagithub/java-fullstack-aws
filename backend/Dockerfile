# Build stage
FROM eclipse-temurin:21 AS build
WORKDIR /app

# Copy only Maven wrapper and pom.xml to leverage Docker layer caching
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download dependencies only (offline mode)
RUN ./mvnw dependency:go-offline

# Copy the rest of the application code
COPY . .

# Build the application without running tests
RUN ./mvnw clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 5000 for Elastic Beanstalk
EXPOSE 5000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

# Step 1: Build the Spring Boot application using Gradle
FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /app

# Copy the Gradle configuration files and wrapper to cache dependencies
COPY gradle gradle
COPY gradlew build.gradle settings.gradle ./
RUN ./gradlew dependencies --no-daemon

# Copy the source code and build the executable JAR file
COPY src src
RUN ./gradlew bootJar --no-daemon

# Step 2: Create the lightweight runtime container
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the compiled JAR file from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the standard port (Render will automatically detect this or bind PORT)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]

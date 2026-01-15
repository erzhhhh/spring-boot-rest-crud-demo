# ==============================================================================
# Spring Application Dockerfile
# ==============================================================================

# Use the lightweight Alpine Linux image with OpenJDK 21 (BellSoft Liberica).
# "cds" stands for Class Data Sharing, which helps improve startup time.
FROM ghcr.io/bell-sw/liberica-openjdk-alpine:21.0.9-cds

# Set the working directory inside the container to /app.
# All subsequent commands will be executed in this folder.
WORKDIR /app

# Copy the entire project source code from your local machine (host) to the container.
COPY . /app

# Run the Maven wrapper script to compile the code and package the application.
# This creates the JAR file inside the /app/target directory.
RUN ./mvnw package

# Inform Docker that the container listens on port 8080 at runtime.
EXPOSE 8080

# The command to start the application.
# I use a wildcard (*.jar) to automatically find the JAR file without hardcoding the version.
CMD java -jar /app/target/*.jar

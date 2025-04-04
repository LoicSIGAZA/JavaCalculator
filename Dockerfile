# Use OpenJDK as base image
FROM openjdk:21

# Set working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY out/artifacts/SoftwareTesting_22805969_jar/SoftwareTesting_22805969.jar app.jar

# Command to run the app
CMD ["java", "-cp", "app.jar", "com.calculator.CalculatorLogic"]


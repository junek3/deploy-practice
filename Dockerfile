FROM openjdk:11-jdk-slim

WORKDIR /app

COPY build/libs/aws-v5-0.0.1.jar app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=prod" ,"app.jar"]
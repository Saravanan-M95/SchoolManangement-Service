FROM maven:3.8.4-openjdk-8 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:8-jdk-slim

WORKDIR /app

COPY --from=build /app/target/schoolmanagement-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/schoolmanagement-0.0.1-SNAPSHOT.jar"]
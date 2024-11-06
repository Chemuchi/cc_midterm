FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/cc_20221204-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "cc_20221204-0.0.1-SNAPSHOT.jar"]
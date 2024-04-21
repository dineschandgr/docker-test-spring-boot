FROM openjdk:21
WORKDIR /app
COPY ./target/Docker-0.0.1-SNAPSHOT.jar /app
EXPOSE 8090
CMD ["java", "-jar", "Docker-0.0.1-SNAPSHOT.jar"]
FROM  openjdk:18-jdk-alpine3.15

WORKDIR /app
COPY ./build/libs/tube-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "tube-0.0.1-SNAPSHOT.jar"]
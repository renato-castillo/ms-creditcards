FROM openjdk:11-alpine
COPY target/ms-creditcards-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
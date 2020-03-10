FROM amazoncorretto:8

COPY target/just-gif-it-1.0-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "-Dspring.profiles.active=default", "just-gif-it-1.0-SNAPSHOT.jar"]

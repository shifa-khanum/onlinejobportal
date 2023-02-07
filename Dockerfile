FROM openjdk:13
ADD target/jobportal-0.0.1-SNAPSHOT.jar jobportal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","jobportal-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
FROM openjdk:11

WORKDIR /

ADD target/cs208project-microservice1-0.0.1-SNAPSHOT.jar cs208project-microservice1-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java", "-jar", "cs208project-microservice1-0.0.1-SNAPSHOT.jar"]
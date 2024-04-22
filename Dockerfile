FROM openjdk:17
ADD target/*.jar spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar","spring-boot-0.0.1-SNAPSHOT.jar"]


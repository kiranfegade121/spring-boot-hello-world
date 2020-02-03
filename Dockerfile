FROM openjdk:8-jdk-alpine
ADD target/spring-boot-hello-world.jar .
EXPOSE 8181
CMD ["java", "-jar", "spring-boot-hello-world.jar"]


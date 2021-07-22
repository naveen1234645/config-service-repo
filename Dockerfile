FROM openjdk:latest
EXPOSE 5000
ADD target/user-service.jar user-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /user-service.jar"]
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8001
ADD target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
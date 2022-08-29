FROM openjdk:8-jdk-alpine
LABEL maintainer="whgusrnr7755@gmail.com"
VOLUME /tmp
ARG JAR_FILE=./build/*.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
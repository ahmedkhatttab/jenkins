FROM amazoncorretto:17
WORKDIR /app
COPY /target/*.jar ./jenkins_integration-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT java -jar jenkins_integration-0.0.1-SNAPSHOT.jar
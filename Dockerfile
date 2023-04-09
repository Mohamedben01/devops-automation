FROM openjdk:17-jdk-alpine
EXPOSE 9090
ADD target/devops-integration-jenkins*.jar devops-integration-jenkins.jar
ENTRYPOINT ["java", "-jar", "/devops-integration-jenkins.jar"]
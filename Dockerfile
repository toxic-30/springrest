FROM openjdk:8
EXPOSE 1002
ADD target/Springboot-docker.jar Springboot-docker.jar 
ENTRYPOINT ["java","-jar","/Springboot-docker.jar"]
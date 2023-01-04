FROM openjdk:8
EXPOSE 1002
ADD target/springboot-docker.jar springboot-docker.jar 
ENTRYPOINT ["java","-jar","/springboot-docker.jar"]

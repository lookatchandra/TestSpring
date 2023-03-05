FROM openjdk:8
EXPOSE 8080
#ARG JAR_FILE=target/test.jar
ADD target/spring-test.jar spring-test.jar
ENTRYPOINT ["java","-jar","/spring-test.jar"]
#End of Docker File
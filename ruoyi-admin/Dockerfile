FROM openjdk:8-jdk-alpine
MAINTAINER lgq0218@gmail.com
COPY target/ruoyi-admin.jar  app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]


#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
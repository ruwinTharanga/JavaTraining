FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/SampleDockerHelloWorld.jar SampleDockerHelloWorld.jar
ENTRYPOINT ["java","jar","/SampleDockerHelloWorld.jar"]
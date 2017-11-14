FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerMonitoring.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerMonitoring.jar"]

EXPOSE 8989 8080
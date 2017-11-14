FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerHealth.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerHealth.jar"]

EXPOSE 6000
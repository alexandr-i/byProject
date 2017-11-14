FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerGateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerGateway.jar"]

EXPOSE 4000
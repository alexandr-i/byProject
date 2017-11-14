FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerScanner.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerScanner.jar"]

EXPOSE 6000
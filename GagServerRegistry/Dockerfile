FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerRegistry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerRegistry.jar"]

EXPOSE 8761
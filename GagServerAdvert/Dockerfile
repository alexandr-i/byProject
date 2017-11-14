FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerAdvert.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerAdvert.jar"]

EXPOSE 6000
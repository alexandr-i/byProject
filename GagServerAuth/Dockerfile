FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerAuth.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerAuth.jar"]

EXPOSE 5000
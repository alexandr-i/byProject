FROM java:8-jre
MAINTAINER Alexandr I <al.i@mail.tv>

ADD ./target/GagServerConfig.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/GagServerConfig.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:8888/health || exit 1

EXPOSE 8888
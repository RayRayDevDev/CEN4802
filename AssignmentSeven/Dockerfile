FROM openjdk:17
COPY src/main/java /usr/src/RadioStation
WORKDIR /usr/src/RadioStation
RUN javac dev/rayraydev/*.java
CMD ["java", "dev.rayraydev.Main"]

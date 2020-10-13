FROM openjdk:latest

WORKDIR /usr/src

COPY ./build/libs/*.jar .

RUN chmod +x *.jar

EXPOSE 8090

ENTRYPOINT java -jar *.jar

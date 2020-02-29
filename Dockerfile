FROM java:8-jdk-alpine

COPY ./target/coding-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch coding-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","coding-0.0.1-SNAPSHOT.jar"]
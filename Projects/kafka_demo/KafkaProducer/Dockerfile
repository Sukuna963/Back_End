FROM eclipse-temurin:22-jdk-alpine

RUN adduser -D kuuhaku12

USER kuuhaku12

COPY ./KafkaProducer/target/KafkaProducer-0.0.1-SNAPSHOT.jar KafkaProducer-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","/KafkaProducer-0.0.1-SNAPSHOT.jar"]
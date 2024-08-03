FROM eclipse-temurin:22-jdk-alpine

RUN adduser -D kuuhaku12

USER kuuhaku12

COPY ./KafkaConsumer/target/KafkaConsumer-0.0.1-SNAPSHOT.jar KafkaConsumer-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","/KafkaConsumer-0.0.1-SNAPSHOT.jar"]
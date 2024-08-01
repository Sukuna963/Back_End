FROM eclipse-temurin:22-jdk-alpine

RUN adduser -D kuuhaku12

USER kuuhaku12

COPY ./herosAPI/target/herosAPI-0.0.1-SNAPSHOT.jar herosAPI-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","/herosAPI-0.0.1-SNAPSHOT.jar"]
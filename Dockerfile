FROM ghcr.io/bell-sw/liberica-openjdk-alpine:21.0.9-cds

WORKDIR /app
COPY . /app
RUN ./mvnw package

EXPOSE 8080

CMD java -jar /app/target/*.jar

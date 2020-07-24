FROM openjdk:14-alpine

WORKDIR /app
COPY target/spring-boot-docker-*.jar app.jar
RUN mvn install

COPY . .
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
CMD docker-compose up

FROM openjdk:17

RUN mkdir /app

WORKDIR /app
COPY build/libs/dbs-1.0.0.jar /app/dbs.jar

# CMD ["java","-server","-jar","/app/server.jar"]
CMD ["java", "-Dspring.profiles.active=kuber", "-server", "-jar", "/app/dbs.jar"]
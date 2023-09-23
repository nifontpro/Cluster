FROM openjdk:17

RUN mkdir /app

WORKDIR /app
COPY build/libs/rs-1.0.0.jar /app/rs.jar

# CMD ["java","-server","-jar","/app/server.jar"]
CMD ["java", "-jar","/app/rs.jar"]
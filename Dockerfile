FROM maven:3.8.5-openjdk-17
WORKDIR src/app
COPY . .
CMD ["mvn", "clean", "spring-boot:run", "-Dserver.port=$PORT"]
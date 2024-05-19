FROM maven:3.8.5-openjdk-17
WORKDIR src/app
COPY . .
EXPOSE 8080
CMD ["mvn", "clean", "spring-boot:run"]
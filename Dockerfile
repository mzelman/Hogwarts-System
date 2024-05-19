FROM maven:3.8.5-openjdk-17
WORKDIR src/app
COPY . .
EXPOSE $PORT
CMD ["mvn", "clean", "spring-boot:run", "-Dspring-boot.run.jvmArguments='-Dserver.port=$PORT'"]
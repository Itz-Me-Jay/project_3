# base image
FROM open-jdk:11-jdk-alpine
# create a directior for application
WORKDIR /app
# Copy Tar file
COPY ./target/*.jar /app.jar
# execute to make container running
CMD [ "java" , "-jar", "app.jar"]


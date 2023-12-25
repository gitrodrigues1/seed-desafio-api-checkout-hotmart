FROM amazoncorretto:17-alpine

WORKDIR /app

COPY target/demo.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
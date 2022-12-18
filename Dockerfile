FROM openjdk:17

COPY target/sb_docker_app.jar   sb_docker_app.jar

CMD java -jar sb_docker_app.jar

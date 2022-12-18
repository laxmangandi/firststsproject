FROM openjdk:17

EXPOSE 8083

ADD target/sb_docker_app.jar   sb_docker_app.jar

ENTRYPOINT ["java", "-jar","sb_docker_app.jar"]


#THIS IS USING COMMND PROMPT for only docker desktop example used this
#FROM openjdk:17

#COPY target/sb_docker_app.jar   sb_docker_app.jar

#CMD java -jar sb_docker_app.jar

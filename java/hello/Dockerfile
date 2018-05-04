FROM java:8
VOLUME /tmp
ADD gs-rest-service-0.1.0.jar user.jar
RUN bash -c 'touch /user.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /user.jar"]


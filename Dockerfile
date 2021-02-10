FROM java:8

EXPOSE 8080

ADD target/BackendToDo.jar BackendToDo.jar

ENTRYPOINT ["java", "-jar", "BackendToDo.jar"]
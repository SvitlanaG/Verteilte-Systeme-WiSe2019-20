# base image

FROM openjdk:11

# irgendwelhe sachen hinzufügen

# komandos ausführen
COPY target/*.jar example-app.jar

# app starten

ENTRYPOINT ["java", "-jar", "/example-app.jar"]
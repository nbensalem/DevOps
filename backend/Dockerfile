# Stage de build
FROM maven:3.6.0-jdk-8-alpine AS build

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -Pdev 

# Construction de l'image finale
FROM openjdk:8-jre-slim

ENV SLEEP 0

# Ajout du jar généré par maven dans l'image
COPY --from=build /usr/src/app/target/*.jar /app.jar

# Création du groupe et user <projet>
RUN groupadd -g 1000 -r app \
&& useradd -u 1000 -g app -c 'User app' app \
&& chown app /app.jar

USER app

CMD echo "The application will start in ${SLEEP}s..." && \
    sleep ${SLEEP} && \
    java -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=dev -jar /app.jar

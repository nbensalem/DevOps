# Stage de build
FROM node:10-alpine  AS build

RUN mkdir -p /src/app &&\
    chown -R node:node /src/app &&\
    chmod -R 750 /src/app

USER node
WORKDIR /src/app
COPY ./ /src/app

RUN rm -f .npmrc &&\
    npm install &&\
    npm run-script build

# Construction de l'image finale
FROM httpd:2-alpine

USER root

# Si besoin d'un fichier de configuration apache spécfique
COPY httpd.conf /usr/local/apache2/conf/httpd.conf
COPY proxy.conf /usr/local/apache2/conf/extra/proxy.conf

# Copie de l'application Javascript
COPY --from=build /src/app/dist/DevopsFront/ /var/www/html/

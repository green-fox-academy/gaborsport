FROM alpine

WORKDIR /var/app
COPY server.js .
RUN npm i express
RUN echo "ezt most a buildelas soran csinalom"

CMD ["node", "server.js"]


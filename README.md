# Betting Game

Betting game is a work in progress. The goal is to make a generic browser game platform for mainly mobile use. It
focusses on player interaction, not fancy graphics or speed. I'm developing it to use with family and friends to 'bet'
fake money on outcomes of family events such as competitions.

Technology stack is currently Spring Boot with a Postgres database backend, however since we're using JPA it wouldn't
be a big deal to replace it with something else. And since we're not doing anything fancy I might also try it with a
noSQL database in the future.

The database locally runs in a docker image that's defined in docker/docker-compose.yml

# Running

Before you run anything, start the database:
```
./start-docker.sh
# admin interface is reachable at http://localhost:9898
username: springboot
password: sa
```

To build and test:
```
mvn clean verify
```

To run:
```
mvn spring-boot:run
# or
java -jar target/betting-game-*.*.*-SNAPSHOT.jar
# api is reachable at http://localhost:8080
```

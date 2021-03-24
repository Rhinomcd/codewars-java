
# codewars - java
[![Build Status](https://travis-ci.org/Rhinomcd/codewars-java.svg?branch=master)](https://travis-ci.org/Rhinomcd/codewars-java)

## Purpose

This repo exists so that I can keep track programming challenges and my solutions.  It might be fun to see how I grow as an engineer.
These solutions are likely my first passes at these challenges and may have more optimal solutions. 

## Building

```bash
# gradle jar
./gradlew
java -jar ./build/libs/*-all.jar

# gradle install script
./gradlew clean installDist
./build/install/codewars/bin/codewars

# gradle distribution
./gradlew clean distZip
unzip -o ./build/distributions/codewars-0.0.1.zip -d /tmp
bash /tmp/codewars-0.0.1/bin/codewars

# gradle docker / docker-compose
./gradlew clean build composeUp
./gradlew composeDown
```

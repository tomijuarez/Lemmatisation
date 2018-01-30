#!/bin/bash

#Generate jar with dependencies
mvn clean compile assembly:single
#Place in target folder
cd "target/"
#Run jar. You must have Java 1.8
java -jar test-1.0-SNAPSHOT-jar-with-dependencies.jar
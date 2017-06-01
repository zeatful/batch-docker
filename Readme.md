# Spring-Batch-Admin / Spring-Boot Application
### Build the Docker Image
`mvn package docker:build`

### Start the Docker Container
`docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t springio/gs-spring-boot-docker`
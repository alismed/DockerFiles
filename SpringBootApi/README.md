## Spring Boot Api

  Use this files to build and run a container for a Spring Boot Api on Eclipse

### MySQL
  It is using the [MySQL container](https://hub.docker.com/_/mysql/):

  ```
  docker pull mysql
  ```

### Setup
  Change the 'docker-compose' to edit the information about MySQL.

  It is recommended to have [Maven](https://maven.apache.org/) installed.

  **Script**
  - $ mvn clean && mnv install
  - $ docker build -f Dockerfile --no-cache -t springdocker . 
  - $ docker run -p 8081:8080 springdocker
  - Use a rest client, like [Postman](https://www.getpostman.com/) to test
   

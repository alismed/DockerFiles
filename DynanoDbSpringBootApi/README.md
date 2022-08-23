## DynamoDB CRUD with Spring Boot Api

  Use this files to build and run a container for a Spring Boot Api to integrate with DynamoDB

### Setup

  It is necessary to have:
  - [Maven](https://maven.apache.org/)
  - [OpenJDK](https://openjdk.org/)

  **AWS**
  - Create `Group` with a proper `Policy` to access Dynamodb
  - Create a 'User' associated with the above group
  - Create a dynamodb table named employee

  **Script**
  - Change the credencials and information about Region in `DynamoDbConfiguration.java`
  - mvn clean && mnv install
  - docker build --no-cache -t springdocker . 
  - docker run -p 8083:8083 springdocker
  - Use a rest client, like [Insomnia](https://insomnia.rest/) to test
   

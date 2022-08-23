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
  - Use a rest client, like [Insomnia](https://insomnia.rest/) or curl to test:

  ```console
  ## create
  curl --request POST \
    --url http://localhost:8083/employee \
    --header 'Content-Type: application/json' \
    --data '{
      "firstName": "Jhon",
      "lastName": "Doe",
      "email": "jdoe@aol.com",
      "departament": {
          "departmentName": "IT",
          "departmentCode": "IT001"
      }
  }'

  ## update
  curl --request PUT \
    --url http://localhost:8083/employee/<id-returned-above> \
    --header 'Content-Type: application/json' \
    --data '{
      "employeeId": "15ea6223-46e1-4724-9ef4-c88da10368b5",
      "firstName": "Jhon",
      "lastName": "Doe",
      "email": "jdoe@aol.com.br",
      "departament": {
          "departmentName": "IT",
          "departmentCode": "IT002"
      }
  }'
 
  ## read
  curl --request GET \
    --url http://localhost:8083/employee/<id-returned-above>
  
  ## delete
  curl --request DELETE \
    --url http://localhost:8083/employee/<id-returned-above>
  ```

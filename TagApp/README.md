## Rails Api

Example to create a Rails API with PostgreSQL



- Build the containner images: `docker-compose build`
- Initialize the containers: `docker-compose up -d`
- To create a new Rails api: `docker-compose run web rails new . --api -d postgresql`
- Edit `config/database.yml` 
- Example to create a entity:
    - `docker-compose run web rails g scaffold article title:string resume:string body:text author:string`
- To execute the migration: `docker-compose run web rails db:migrate`
- `psql -h localhost -p 5432 -U <database_username>`
- Call the api:
```shell
curl --request POST \
  --url http://localhost:3000/articles \
  --header 'Content-Type: application/json' \
  --data '{
 "title": "news",
 "resume": "great news",
 "body": "lala lalala lalalala lalalalala",
 "author": "joe"
}'
```
- To shutdown the enviroment 'docker-compose down`

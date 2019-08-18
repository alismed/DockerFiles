## Postgres

  Use this files to build and run a container for a Postgres Database and [pgAdmin](https://www.pgadmin.org/)

### Setup

```
docker-compose up
```
  
### Using

It is possible to access the database using the command line:

```
psql -h localhost -p 54320 -U `<User>` -d mydb
```
See how to install [Postgres client only](https://github.com/alismed/ubuntu-after-install).

Also is possible to use pgAdmin:
  - Open `http://localhost:16543`
  - Login with the username defined in [docker-compose](docker-compose.yml)
  - Click `Add new server` 
  - Fill the gaps with information defined in db service session at docker-compose:
      - hostname: db container name
      - port
      - username
      - password
  

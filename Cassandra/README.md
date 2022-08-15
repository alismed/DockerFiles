## Cassandra

  Use this files to build and run a container for a Cassandra database

### Cassandra
  It is using the [Cassandra container](https://hub.docker.com/_/cassandra/):

  ```
  docker pull cassandra
  docker pull nuvo/docker-cqlsh
  ```
  
### Network
  Create a network to make easy the process to exposing the ports:

  ```
  docker network create cassandra
  ```
  
### Run

  - `docker run --rm -d --name cassandra --hostname cassandra --network cassandra cassandra`
  - Access the cassandra with `CLQSH` in a diferent container
  - `docker run --rm -it --network cassandra nuvo/docker-cqlsh cqlsh cassandra 9042 --cqlversion='3.4.5'`

### execute External files
  To execute external scripts, use the opetion `-v` to share a script between the host and container.
  - `docker run --rm --network cassandra -v "$(pwd)/script.cql:/scripts/script.cql" -e CQLSH_HOST=cassandra -e CQLSH_PORT=9042 -e CQLVERSION=3.4.5 nuvo/docker-cqlsh`
  



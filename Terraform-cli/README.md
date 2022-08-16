## Terraform CLI

  Use this files to build and run a container to run Terraform and AWS cli.

### Ubuntu
  It is using the [Ubuntu container](https://hub.docker.com/_/ubuntu/):

  ```
  docker pull ubuntu
  ```

### Setup
  - Build the DockerFile: `docker build -t terraformcli .`
  - Exeute the docker run sharing the local folder of your project:
    -  `docker run -v $(pwd):/root -it terraformcli /bin/bash`
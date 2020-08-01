## Rails Application

  Use this files to build and run a container for a Rails Application.

### MySQL
  It is using the [MySQL container](https://hub.docker.com/_/mysql/):

  ```
  docker pull mysql
  ```
  
### Gemfile
  Edit the `Gemfile` according your application.
  
### Setup
  Edit the `DockerFile` to change the `Ruby version` and the **Project Name**.
  Change the `docker-compose` to edit the information on the `MySQL Database` and the **Project Name**.

  **Script**

  - `$ mkdir <project-name> && cd <project-name>`
  - Copy all files to the new folder.
  - `$ docker-compose build --no-cache`: To build the image, it may take a few minutes. 
  - `$ docker-compose run web rails new .`: To create a new Rails aplication.
   - Type 'y' to overwrite the Gemfile.
  - Edit the 'config/database.yml`
  - `$ docker-compose run web rake db:create`
  - `$ docker-compose run web rails g <something> <options>`:  Create your models, views, etc.
  - `$ docker-compose run web rails db:migrate`
  - `$ docker-compose up web`:
  - Open http://localhost:9292/
  

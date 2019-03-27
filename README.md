# Spring REST API
An example of a couple REST endpoints implemented using the Spring framework. As well as 
flyway to create the data model. This was done on Windows 10 home edition so there
 are `docker-machine` commands mixed in, ignore as required. 

## Set Up 

### Create a MYSQL: 5.6 Container locally

This will create a docker machine instance and a running mysql server in that instance. 
Also will expose ports to run flyway migration on it. 
- Create new machine: `docker-machine create --virtualbox [NAME OF VM]`
- SSH into machine: `docker-machine ssh vm1`
- Run container IN docker-machine: `docker run --name [NAME OF CONTAINER] -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin
-e MYSQL_DATABASE=eval -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin mysql:5.6`
- Get Docker machine's IP address to point Flyway at it: `docker-machine ip vm1`

#### Navigate DB Container
Once the docker machine VM  is running the MYSQL container, it's useful to get into the container and
interact with the MYSQL server. 
- From within the docker-machine run: `docker exec -it [NAME OF CONTAINER] /bin/bash`
- Login to MYSQL, using creds it was created with in docker command: `mysql -u admin -p`
- Create the database you wish to use in this setup the database name is `eval`. So
the command `create database eval`

#### Notes
Local install and containerized versions do not behave the same way. There is casing differences.
Best solution is use all lowercase. 

### Run Flyway Migration
This assumes there is now a running instance of MySql 5.6 that your machine can reach.
- Edit the `build.gradle` file to ensure the MySql username, password and url are set
to what is appropriate. Edit the flyway section of the file. Be sure the add the database
name to the end of the url. 
- Run `gradle flywayMigrate -i`. This should trigger the creation of the schema and
populate it. 


### Running the Application
- Set the database url, username and password in both the `application.properties`
 and `hikari.properties` files. 
- Run `gradlew bootRun`
- Verify that the REST API's are running via the Swagger-UI endpoint: 
`http://localhost:8080/swagger-ui.html#/`
 
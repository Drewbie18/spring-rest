# Create a MYSQL: 5.6 Container locally

This will create a docker machine instance and a running mysql server in that instance. 
Also will expose ports to run flyway migration on it. 
- Create new machine: docker-machine create --virtualbox [NAME OF VM]
- SSH into machine: docker-machine ssh vm1
- Run container IN docker-machine: docker run --name [NAME OF CONTAINER] -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin
-e MYSQL_DATABASE=eval -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin mysql:5.6
- Get Docker machine's IP address to point Flyway at it: docker-machine ip vm1

## Navigate DB Container
Once the docker machine VM  is running the MYSQL container, it's useful to get into the container and
interact with the MYSQL server. 
- From within the docker-machine run: docker exec -it [NAME OF CONTAINER] /bin/bash
- Login to MYSQL, using creds it was created with in docker command: mysql -u admin -p
- 

## Notes
Local install and containerized versions do not behave the same way. There is casing differences.
Best solution is use all lowercase. 

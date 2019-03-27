# Examples of MySQL Scripts

This will contain various samples of using MySql commands. 

## DDL Scripts
Data Definition Language. This is use to create the database (schema) before it is populated with
data. 

## DML Scripts
Data Manipulation Language. 


## Part 4 SQL Queries
The task is to create an endpoint that takes three parameters but two are optional. However it must
return a list of tickets that are listed but not sold. That means in the listings table but NOT
in the sales table. 

## WorkFlow
- Start docker machine 
- Start mysql container in machine
- Edit URL and credentials in the build gradle and properties files. 
- Run gradle build, this will populate the database via flyway

After these steps it is possible to query the databases via MySql queries. 


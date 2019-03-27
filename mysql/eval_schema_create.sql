-- Create and select
CREATE DATABASE Eval;
USE Eval;
SHOW DATABASES;

CREATE TABLE Users (
   user_id INT NOT NULL,
   username VARCHAR(255),
   first_name VARCHAR(255),
   last_name VARCHAR(255),
   city VARCHAR(255),
   user_state VARCHAR(255),
   email VARCHAR(255),
   phone VARCHAR(255),
   sports BOOLEAN,
   theatre BOOLEAN,
   concerts BOOLEAN,
   jazz BOOLEAN,
   classical BOOLEAN,
   opera BOOLEAN,
   rock BOOLEAN,
   vegas BOOLEAN,
   broadway BOOLEAN,
   musicals BOOLEAN,
   PRIMARY KEY (user_id));

CREATE TABLE Venues (
   venue_id INT NOT NULL,
   venue_name VARCHAR(255),
   city VARCHAR(255),
   venue_state VARCHAR(255),
   seating_capacity INT,
   PRIMARY KEY (venue_id));

CREATE TABLE Categories (
   category_id INT NOT NULL,
   cat_group VARCHAR(255),
   name VARCHAR(255),
   description TEXT,
   PRIMARY KEY (category_id));

CREATE TABLE Dates (
   date_id INT NOT NULL,
   cal_date DATE,
   day_name VARCHAR(255),
   week_num INT,
   month_abrv VARCHAR(255),
   quarter_num INT,
   year_num INT,
   holiday BOOLEAN,
   PRIMARY KEY (date_id));

CREATE TABLE Events (
   event_id INT NOT NULL,
   venue_id INT,
   category_id INT,
   date_id INT,
   event_name VARCHAR(255),
   event_start_time TIMESTAMP NULL,
   PRIMARY KEY (event_id),
   FOREIGN KEY event_venue(venue_id) REFERENCES Venues (venue_id),
   FOREIGN KEY event_category(category_id) REFERENCES Categories (category_id),
   FOREIGN KEY event_date(date_id) REFERENCES Dates (date_id));

CREATE TABLE Listings (
   listing_id INT NOT NULL,
   seller_id INT,
   event_id INT,
   date_id INT,
   num_tickets INT,
   price_ticket DOUBLE,
   total_price DOUBLE,
   list_timestamp TIMESTAMP NULL,
   PRIMARY KEY (listing_id),
   FOREIGN KEY seller(seller_id) REFERENCES Users (user_id),
   FOREIGN KEY event(event_id) REFERENCES Events (event_id),
   FOREIGN KEY date(date_id) REFERENCES Dates (date_id));

CREATE TABLE Sales (
   sales_id INT NOT NULL,
   listing_id INT,
   seller_id INT,
   buyer_id INT,
   event_id INT,
   date_id INT,
   quantity_sold INT,
   price_paid DOUBLE,
   commission_amount DOUBLE,
   sale_timestamp TIMESTAMP NULL,
   PRIMARY KEY (sales_id),
   FOREIGN KEY listing(listing_id) REFERENCES Listings (listing_id),
   FOREIGN KEY seller(seller_id) REFERENCES Users (user_id),
   FOREIGN KEY buyer(buyer_id) REFERENCES Users (user_id),
   FOREIGN KEY event(event_id) REFERENCES Events (event_id),
   FOREIGN KEY date(date_id) REFERENCES Dates (date_id));


   

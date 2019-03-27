SET FOREIGN_KEY_CHECKS = 0;

LOAD DATA LOCAL INFILE './data/users.txt'
INTO TABLE users
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n'
(
user_id,
username,
first_name,
last_name,
city,
user_state,
email,
phone,
@sports,
@theatre,
@concerts,
@jazz,
@classical,
@opera,
@rock,
@vegas,
@broadway,
@musicals
)

SET sports = (@sports = 'TRUE'),
 theatre = (@theatre = 'TRUE'),
 concerts = (@concerts = 'TRUE'),
 jazz = (@jazz = 'TRUE'),
 classical = (@classical = 'TRUE'),
 opera = (@opera = 'TRUE'),
 rock = (@rock = 'TRUE'),
 vegas = (@vegas = 'TRUE'),
 broadway = (@broadway = 'TRUE'),
 musicals = (@musicals = 'TRUE');

LOAD DATA LOCAL INFILE './data/venues.txt'
INTO TABLE venues
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n';

LOAD DATA LOCAL INFILE './data/categories.txt'
INTO TABLE categories
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n';


LOAD DATA LOCAL INFILE './data/dates_2008.txt'
INTO TABLE dates
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n'
(
date_id,
cal_date,
day_name,
week_num,
month_abrv,
quarter_num,
year_num,
@holiday
)
SET holiday = (@holiday = 'TRUE');

LOAD DATA LOCAL INFILE './data/events.txt'
INTO TABLE events
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n';


LOAD DATA LOCAL INFILE './data/listings.txt'
INTO TABLE listings
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n';


LOAD DATA LOCAL INFILE './data/sales.txt'
INTO TABLE sales
FIELDS TERMINATED BY '\t'
LINES TERMINATED BY '\r\n';

SET FOREIGN_KEY_CHECKS = 1;

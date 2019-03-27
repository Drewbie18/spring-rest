USE eval
LOAD DATA LOCAL INFILE 'users.txt'
INTO TABLE USERS
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
 musicals = (@musicals = 'TRUE')
USE eval
LOAD DATA LOCAL INFILE 'categories.txt'
INTO TABLE CATEGORIES
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n'

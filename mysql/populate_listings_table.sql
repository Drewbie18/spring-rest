USE eval;
-- switch this off
SET FOREIGN_KEY_CHECKS = 0;
LOAD DATA LOCAL INFILE 'listings.txt'
INTO TABLE LISTINGS
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '\r\n';
SET FOREIGN_KEY_CHECKS = 1;
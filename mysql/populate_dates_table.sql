USE eval
LOAD DATA LOCAL INFILE 'dates_2008.txt'
INTO TABLE DATES
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
SET holiday = (@holiday = 'TRUE')
Activity4:

-- new grade column
ALTER TABLE salesman ADD grade int;


-- Set the value of grade column to 100 for all.
UPDATE salesman SET grade=100;

--  display the results.
SELECT * FROM salesman;

"SALESMAN_ID"	"SALESMAN_NAME"	"SALESMAN_CITY"	"COMMISSION"	"GRADE"
5001	"James Hoog"	"New York"	15	100
5002	"Nail Knite"	"Paris"	13	100
5005	"Pit Alex"	"London"	11	100
5006	"McLyon"	"Paris"	14	100
5007	"Paul Adam"	"Rome"	13	100
5003	"Lauson Hen"	"San Jose"	12	100
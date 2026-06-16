Activity1:

CREATE TABLE salesman(
    salesman_id int PRIMARY KEY,
    salesman_name VARCHAR(20),
    salesman_city VARCHAR(100),
    commission int
);

DESCRIBE salesman;

Activity2;

INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

SELECT * FROM salesman;
"SALESMAN_ID"	"SALESMAN_NAME"	"SALESMAN_CITY"	"COMMISSION"
5001	"James Hoog"	"New York"	15
5002	"Nail Knite"	"Paris"	13
5005	"Pit Alex"	"London"	11
5006	"McLyon"	"Paris"	14
5007	"Paul Adam"	"Rome"	13
5003	"Lauson Hen"	"San Jose"	12


Activity3:
SELECT salesman_id, salesman_city FROM salesman;

"SALESMAN_ID"	"SALESMAN_CITY"
5001	"New York"
5002	"Paris"
5005	"London"
5006	"Paris"
5007	"Rome"
5003	"San Jose"


SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';
"SALESMAN_ID"	"COMMISSION"
5007	13


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

Actvity5:

-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesman;

"SALESMAN_ID"	"SALESMAN_NAME"	"SALESMAN_CITY"	"COMMISSION"	"GRADE"
5001	"James Hoog"	"New York"	15	300
5002	"Nail Knite"	"Paris"		13	100
5005	"Pit Alex"	   "London"	    11	100
5006	"Pierre"	"Paris"		    14	100
5007	"Paul Adam"	"Rome"		    13	200
5003	"Lauson Hen"	"San Jose"	12	100


ACtivity6:

create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);


    -- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;

SELECT * FROM ORDERS;

"ORDER_NO"	"PURCHASE_AMOUNT"	"ORDER_DATE"	"CUSTOMER_ID"	"SALESMAN_ID"
70001	150.5	"2012-10-05T00:00:00Z"	3005	5002
70009	270.65	"2012-09-10T00:00:00Z"	3001	5005
70002	65.26	"2012-10-05T00:00:00Z"	3002	5001
70004	110.5	"2012-08-17T00:00:00Z"	3009	5003
70007	948.5	"2012-09-10T00:00:00Z"	3005	5002
70005	2400.6	"2012-07-27T00:00:00Z"	3007	5001
70008	5760	"2012-08-15T00:00:00Z"	3002	5001
70010	1983.43	"2012-10-10T00:00:00Z"	3004	5006
70003	2480.4	"2012-10-10T00:00:00Z"	3009	5003
70012	250.45	"2012-06-27T00:00:00Z"	3008	5002
70011	75.29	"2012-08-17T00:00:00Z"	3003	5007
70013	3045.6	"2012-04-25T00:00:00Z"	3002	5001


-- Get all salesman ids without any repeated values
SELECT DISTINCT salesman_id from orders;

"SALESMAN_ID"
5002
5005
5001
5003
5006
5007

-- Display the order number ordered by date in ascending order
SELECT order_no, order_date FROM orders ORDER BY order_date ASC;

"ORDER_NO"	"ORDER_DATE"
70013	"2012-04-25T00:00:00Z"
70012	"2012-06-27T00:00:00Z"
70005	"2012-07-27T00:00:00Z"
70008	"2012-08-15T00:00:00Z"
70011	"2012-08-17T00:00:00Z"
70004	"2012-08-17T00:00:00Z"
70007	"2012-09-10T00:00:00Z"
70009	"2012-09-10T00:00:00Z"
70002	"2012-10-05T00:00:00Z"
70001	"2012-10-05T00:00:00Z"
70003	"2012-10-10T00:00:00Z"
70010	"2012-10-10T00:00:00Z"

-- Display the order number ordered by purchase amount in descending order
SELECT order_no, purchase_amount FROM orders ORDER BY purchase_amount DESC;

"ORDER_NO"	"PURCHASE_AMOUNT"
70008	5760
70013	3045.6
70003	2480.4
70005	2400.6
70010	1983.43
70007	948.5
70009	270.65
70012	250.45
70001	150.5
70004	110.5
70011	75.29
70002	65.26

-- Display the full data of orders that have purchase amount less than 500.
SELECT * FROM orders WHERE purchase_amount < 500;

"ORDER_NO"	"PURCHASE_AMOUNT"	"ORDER_DATE"	"CUSTOMER_ID"	"SALESMAN_ID"
70001	150.5	"2012-10-05T00:00:00Z"	3005	5002
70009	270.65	"2012-09-10T00:00:00Z"	3001	5005
70002	65.26	"2012-10-05T00:00:00Z"	3002	5001
70004	110.5	"2012-08-17T00:00:00Z"	3009	5003
70012	250.45	"2012-06-27T00:00:00Z"	3008	5002
70011	75.29	"2012-08-17T00:00:00Z"	3003	5007

-- Display the full data of orders that have purchase amount between 1000 and 2000.
SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

"ORDER_NO"	"PURCHASE_AMOUNT"	"ORDER_DATE"	"CUSTOMER_ID"	"SALESMAN_ID"
70010	     1983.43	     "2012-10-10T00:00:00Z"	  3004	5006


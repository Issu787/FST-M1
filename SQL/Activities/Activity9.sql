Activity9
-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

    -- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;


-- Write an SQL statement to know which salesman are working for which customer.
SELECT customer_name, salesman_name FROM customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
"CUSTOMER_NAME"	"SALESMAN_NAME"
"Nick Rimando"	"James Hoog"
"Brad Davis"	"James Hoog"
"Graham Zusi"	"Nail Knite"
"Julian Green"	"Nail Knite"
"Geoff Cameron"	"Lauson Hen"
"Brad Guzan"	"Pit Alex"
"Fabian Johnson"	"Pierre"
"Jozy Altidor"	"Paul Adam"


--Write an SQL statement to make a list of customers in ascending order with a salesman that have a grade less than 300.
SELECT customer_name, salesman_name, a.grade FROM customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE a.grade < 300
ORDER BY customer_id;

"CUSTOMER_NAME"	"SALESMAN_NAME"	"GRADE"
"Nick Rimando"	"James Hoog"	100
"Jozy Altidor"	"Paul Adam"	200
"Graham Zusi"	"Nail Knite"	200
"Brad Davis"	"James Hoog"	200
"Geoff Cameron"	"Lauson Hen"	100


--Write an SQL statement to find the list of customers who appointed a salesman who gets a commission of more than 12%.
SELECT customer_name,salesman_name,commission FROM customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE commission > 12

"CUSTOMER_NAME"	"SALESMAN_NAME"	"COMMISSION"
"Nick Rimando"	"James Hoog"	15
"Brad Davis"	"James Hoog"	15
"Graham Zusi"	"Nail Knite"	13
"Julian Green"	"Nail Knite"	13
"Fabian Johnson"	"Pierre"	14
"Jozy Altidor"	"Paul Adam"	13


--Write an SQL statement to find the following details of an order - order number, order date, purchase amount of order, which customer gives the order and which salesman works for that customer and commission rate they get for the order.

SELECT order_no, order_date, purchase_amount,customer_name,salesman_name, commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
INNER JOIN orders c ON a.customer_id=c.customer_id


"ORDER_NO"	"ORDER_DATE"	"PURCHASE_AMOUNT"	"CUSTOMER NAME"	"GRADE"	"SALESMAN"	"COMMISSION"
70008	"2012-08-15T00:00:00Z"	5760	"Nick Rimando"	100	"James Hoog"	15
70013	"2012-04-25T00:00:00Z"	3045.6	"Nick Rimando"	100	"James Hoog"	15
70002	"2012-10-05T00:00:00Z"	65.26	"Nick Rimando"	100	"James Hoog"	15
70005	"2012-07-27T00:00:00Z"	2400.6	"Brad Davis"	200	"James Hoog"	15
70007	"2012-09-10T00:00:00Z"	948.5	"Graham Zusi"	200	"Nail Knite"	13
70001	"2012-10-05T00:00:00Z"	150.5	"Graham Zusi"	200	"Nail Knite"	13
70012	"2012-06-27T00:00:00Z"	250.45	"Julian Green"	300	"Nail Knite"	13
70010	"2012-10-10T00:00:00Z"	1983.43	"Fabian Johnson"	300	"Pierre"	14
70004	"2012-08-17T00:00:00Z"	110.5	"Geoff Cameron"	100	"Lauson Hen"	12
70003	"2012-10-10T00:00:00Z"	2480.4	"Geoff Cameron"	100	"Lauson Hen"	12
70011	"2012-08-17T00:00:00Z"	75.29	"Jozy Altidor"	200	"Paul Adam"	13
70009	"2012-09-10T00:00:00Z"	270.65	"Brad Guzan"	300	"Pit Alex"	11

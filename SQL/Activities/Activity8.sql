Activity8:

-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
SELECT customer_id, MAX(purchase_amount) AS "High Purchase Amount" FROM orders GROUP BY customer_id ORDER BY "High Purchase Amount";

"CUSTOMER_ID"	"HIGH PURCHASE AMOUNT"
3003	75.29
3008	250.45
3001	270.65
3005	948.5
3004	1983.43
3007	2400.6
3009	2480.4
3002	5760


-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

"SALESMAN_ID"	"ORDER_DATE"	"MAX AMOUNT"
5003	"2012-08-17T00:00:00Z"	110.5
5007	"2012-08-17T00:00:00Z"	75.29


-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list 2030, 3450, 5760, and 6000.
SELECT customer_id, order_date, MAX(purchase_amount) AS Max_Amount FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

"CUSTOMER_ID"	"ORDER_DATE"	"MAX_AMOUNT"
3002	"2012-08-15T00:00:00Z"	5760



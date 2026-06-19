Activity7
-- Write an SQL statement to find the total purchase amount of all orders.
SELECT SUM(purchase_amount) AS "Total sum" from orders;

"TOTAL SUM"
17541.18

-- Write an SQL statement to find the average purchase amount of all orders.
SELECT AVG(purchase_amount) AS "Average" from orders;

"AVERAGE"
1461.765

-- Write an SQL statement to get the maximum purchase amount of all the orders.
SELECT MAX(purchase_amount) AS "Maximum" from orders;

"MAXIMUM"
5760

-- Write an SQL statement to get the minimum purchase amount of all the orders.
SELECT MIN(purchase_amount) AS "Minumum" from orders;

"MINUMUM"
65.26

-- Write an SQL statement to find the number of salesmen listed in the table.
SELECT COUNT(distinct salesman_id) AS "Total count" from orders;
"TOTAL COUNT"
6
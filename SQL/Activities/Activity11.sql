Activity11:
-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order
SELECT customer_id AS entity_id, customer_name AS entity_name
FROM customers a
WHERE 1 < ( SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id )
UNION
SELECT salesman_id AS entity_id, salesman_name AS entity_name
FROM salesman a
WHERE 1 < ( SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id )
ORDER BY entity_name;


-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.
SELECT salesman_id,order_date,order_no,purchase_amount,
CASE 
WHEN purchase_amount = MAX(purchase_amount) OVER (PARTITION BY order_date) 
THEN 'highest on'
WHEN purchase_amount = MIN(purchase_amount) OVER (PARTITION BY order_date) 
THEN 'lowest on'
END AS order_status
FROM orders
WHERE purchase_amount IN (
    SELECT MAX(purchase_amount) FROM orders o2 WHERE o2.order_date = orders.order_date
    UNION
    SELECT MIN(purchase_amount) FROM orders o3 WHERE o3.order_date = orders.order_date
)
ORDER BY order_date, order_status;

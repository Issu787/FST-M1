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
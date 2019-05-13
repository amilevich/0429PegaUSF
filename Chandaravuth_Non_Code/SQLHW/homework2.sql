--2.1 SELECT
--2.1A
SELECT * 
FROM Employee;
/*****************************************************/
--2.1B
SELECT * 
FROM Employee
WHERE lastname like '%King%';
/*****************************************************/
--2.1C
SELECT *
FROM employee
WHERE firstname LIKE '%Andrew%'
AND reportsto IS null;
/*****************************************************/
/*****************************************************/
--2.2 ORDER BY
--2.2A
SELECT *
FROM album
ORDER BY title DESC
;
/*****************************************************/
--2.2B
SELECT firstname
FROM customer
ORDER BY city
;
/*****************************************************/
/*****************************************************/
--2.3 INSERT INTO
--2.3A
INSERT INTO genre
(genreid,name)
VALUES
(26,'PROGRAMMING')
;
INSERT INTO genre
(genreid,name)
VALUES
(27,'History')
;
/*****************************************************/
--2.3B
INSERT INTO employee
(employeeid,lastname,firstname) --> the rest of columes allow null value in that why insert go trought
VALUES
(9,'john','carter') --> please check employeeID to avoid from cracking
;
INSERT INTO employee
(employeeid,lastname,firstname)
VALUES
(10,'lord','stev')
;
--commit;
/*****************************************************/
--2.3C
INSERT INTO customer
(customerid,lastname,firstname,email) --> the rest of columes allow null value in that why insert go trought
VALUES
(100,'john','carter','john@carter') 
;
INSERT INTO customer
(customerid,lastname,firstname,email)
VALUES
(101,'lord','stev','lord@stev')
;
--commit;
/*****************************************************/
/*****************************************************/
--2.4 UPDATE
--2.4A
UPDATE customer
SET firstname = 'Robert',
    lastname = 'Walter'
WHERE customerid = 32
;
/*****************************************************/
--2.4B
UPDATE artist
SET name = 'CCR'
WHERE artistid = 76
;
/*****************************************************/
/*****************************************************/
--2.5 LIKE
--2.5
SELECT *
FROM invoice
WHERE billingaddress LIKE 'T%'
;
/*****************************************************/
/*****************************************************/
--2.6 BETWEEN
--2.6A
SELECT *
FROM invoice
WHERE total BETWEEN 15.00 AND 50.00
;
/*****************************************************/
--2.6B
SELECT *
FROM employee
WHERE hiredate BETWEEN TO_DATE ('01/06/2003','dd/mm/yyyy') AND TO_DATE('01/03/2004','dd/mm/yyyy')
;
/*****************************************************/
/*****************************************************/
--2.7
ALTER TABLE invoice DROP CONSTRAINT FK_InvoiceCustomerId;
DELETE FROM customer
where firstname like 'Robert' AND lastname like 'Walter'
;

--3.1 System Defined Function
/*
ALTER SESSION SET TIME_ZONE = 'US/Eastern';
ALTER SESSION SET NLS_DATE_FORMAT = 'dd-mon-yyyyHH24:MI:SS';
SELECT  CURRENT_TIMESTAMP FROM DUAL;

select current_date from dual;
select sysdate from dual;
*/
--3.1A
--SELECT TO_CHAR(CURRENT_DATE, 'HH:MI:SS')AS TIME FROM DUAL;
create or replace function get_time
return VARCHAR2 is
  var_time VARCHAR2(100);
begin
  select TO_CHAR(CURRENT_DATE, 'HH:MI:SS')AS TIME
    into var_time
    from dual;
return var_time;
end;
/

DECLARE
    time_s VARCHAR2(100);
BEGIN
    time_s := get_time();
    DBMS_OUTPUT.PUT_LINE('Current time is: ' || time_s);
END;
/
--SELECT get_time AS TIME FROM dual;
/*****************************************************/
--3.1B
create or replace function mediatype_length(get_length IN VARCHAR2)
RETURN VARCHAR2 IS
var_length VARCHAR2(250);
begin
SELECT LENGTH(get_length) 
INTO var_length
FROM DUAL;
RETURN var_length;
END;
/
--SELECT mediatype_length('hello world') FROM dual;
DECLARE
    print_var VARCHAR2(250);
BEGIN
    print_var := mediatype_length('hello world');
    DBMS_OUTPUT.PUT_LINE('length of the letter is: ' || print_var);
END;
/
/*****************************************************/
/*****************************************************/
--3.2
--3.2A
/*
SELECT avg(total)
from invoice;
*/
create or replace function avg_total_invoice
RETURN NUMBER is
avg_i NUMBER;
begin
SELECT avg(total)
INTO avg_i
FROM invoice;
RETURN avg_i;
END;
/
DECLARE
print_avg NUMBER;
BEGIN
    print_avg := avg_total_invoice();
    DBMS_OUTPUT.PUT_LINE('Average: ' || print_avg);
END;
/
/*****************************************************/
--3.2B
SELECT name
FROM track
WHERE  UNITPRICE = (SELECT max(UNITPRICE) FROM track)
GROUP BY TRACKID,name
;

/*
create or replace function most_exp
RETURN VARCHAR2 IS
price_t VARCHAR2(250);
BEGIN
    SELECT name
    INTO price_t
    FROM track
    WHERE UNITPRICE = (SELECT max(UNITPRICE) FROM track)
    GROUP BY name;
    RETURN price_t;
END;
/
SELECT most_exp FROM track;

DECLARE
print_p VARCHAR2(250);
BEGIN
    print_p := most_exp();
LOOP
    DBMS_OUTPUT.PUT_LINE('Most expensive track: ' || print_p);
END LOOP;
END;
/
*/
/*****************************************************/
/*****************************************************/
--4.1 INNER
SELECT customer.firstname AS firstname,customer.lastname AS lastname,invoice.invoiceid AS ID
FROM customer INNER JOIN invoice ON customer.customerid = invoice.customerid;
/*****************************************************/
/*****************************************************/
--4.2 OUTER
SELECT customer.customerid,customer.firstname,customer.lastname,invoice.invoiceid, invoice.total
FROM customer FULL OUTER JOIN INVOICE ON customer.customerid = invoice.invoiceid
WHERE (customer.firstname IS NOT NULL) AND (customer.lastname IS NOT NULL);
/*****************************************************/
/*****************************************************/
--4.3 RIGHT
SELECT artist.name,album.title
FROM album RIGHT JOIN artist ON album.artistid=artist.artistid;
/*****************************************************/
/*****************************************************/
--4.4
SELECT *
FROM album CROSS JOIN artist
ORDER BY artist.name; --> by default is asc
/*****************************************************/
/*****************************************************/
--4.5
SELECT *
FROM employee e1, employee e2
WHERE e1.reportsto = e2.reportsto;










    
    





SELECT *
FROM invoice
;


SELECT *
FROM customer 
;
SELECT *
FROM customer 
where firstname like 'Robert' AND lastname like 'Walter'
;
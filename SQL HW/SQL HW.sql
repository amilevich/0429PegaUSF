-- SQL LAB HW

-- 2.1 SELECT
/* A) */ 
SELECT*FROM employee;
/* B) */ 
SELECT*FROM employee WHERE LOWER(lastname) LIKE'king';
/* C) */ 
SELECT*FROM employee WHERE (firstname) LIKE'Andrew' AND (reportsto) IS NULL;

-- 2.2 ORDER BY 
/* A) */ 
SELECT*FROM album ORDER BY title DESC;
/* B) */ 
SELECT (firstname) FROM customer ORDER BY city ASC;

--2.3 INSERT INTO
/* A) */
INSERT INTO GENRE (genreid, name) VALUES (26, 'mysong');
INSERT INTO GENRE (genreid, name) VALUES (27, 'mysing');
SELECT * FROM Genre;
/* B) ONLY ADDED INTO 3 COLUMNS TO DEMONSTRATE*/ 
INSERT INTO employee (employeeid, lastname, firstname) VALUES (9, 'Dom','Jerry'); --please check emp id to avoid problems
INSERT INTO employee (employeeid, lastname, firstname) VALUES (10, 'Jay','John');
SELECT * FROM employee;
/* C) */
INSERT INTO customer (customerid, firstname, lastname, company, email) VALUES (60, 'Milly','Porter','Revature','why@gmail.com');
INSERT INTO customer (customerid, firstname, lastname, company, email) VALUES (61, 'Jenny','Porter','Revature','likereally@gmail.com');
SELECT * FROM customer;

--2.4 UPDATE
/* A) */
UPDATE customer SET firstname = 'Robert', lastname = 'Walter' WHERE customerid = 32;
/* B) */
SELECT*FROM artist WHERE (name) LIKE'Creedence%'; --Step 1: to find artist id
UPDATE artist SET name = 'CCR' WHERE artistid=76; --2
SELECT*FROM artist WHERE (name) LIKE'CCR'; --3, confirmed rename

--2.5 LIKE
/* A) */
SELECT*FROM invoice WHERE billingaddress LIKE'T%';

--2.6 BETWEEN
/* A) */
SELECT*FROM invoice;
SELECT*FROM invoice WHERE total BETWEEN '15' AND '50';
/* B) */
SELECT*FROM employee;
SELECT*FROM employee WHERE hiredate BETWEEN '01-JUN-03' AND '01-MAR-04';

--2.7 DELETE
/* A) */
SELECT*FROM customer WHERE lastname LIKE'Walter';
SELECT*FROM customer;
SELECT*FROM invoice;
SELECT*FROM invoiceline;
SELECT*FROM invoiceline WHERE invoiceid LIKE'290';
SELECT*FROM invoice WHERE customerid LIKE'32';
DELETE FROM invoiceline WHERE invoiceid = 245; --run from here to bottom
DELETE FROM invoiceline WHERE invoiceid = 290;
DELETE FROM invoiceline WHERE invoiceid = 268;
DELETE FROM invoiceline WHERE invoiceid = 50;
DELETE FROM invoiceline WHERE invoiceid = 61;
DELETE FROM invoiceline WHERE invoiceid = 116;
DELETE FROM invoiceline WHERE invoiceid = 342;
--DELETE FROM invoice WHERE customerid = 32 AND invoiceid > 1; realized this could be done instead
DELETE FROM invoice WHERE customerid = 32 AND invoiceid = 245;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid = 290;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid= 268;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid= 50;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid= 61;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid= 116;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid= 342;
--DELETE FROM customer WHERE lastname = 'Walter' AND customerid = 32; 
DELETE FROM customer WHERE customerid = 32; --worked after deleting all child reliants


--3.0 SQL FUNCTIONS

--3.1 System Defined Functions
/* A) */ --Had to first go to original file and grant create procedure to user chinook
create or replace function timeGet
return VARCHAR2 is
vartime VARCHAR2(100);

begin

select TO_CHAR(CURRENT_DATE, 'HH:MI:SS')AS TIME
into vartime from dual;

return vartime;
end;
/
SELECT timeGet FROM dual;
/* B) */
SELECT * FROM mediatype;
SELECT LENGTH ('AAC audio file') "Length in characters" FROM dual; 

--3.2 System Defined Aggregate Functions
/* A) */
SELECT * FROM invoice;
SELECT AVG(total) FROM invoice;
/* B) */
SELECT*FROM track;
SELECT unitprice FROM track;
SELECT MAX(unitprice) "Maximum" FROM track;


--4.0 JOINS

--4.1 Inner
/* A) */
SELECT * FROM customer;
SELECT invoice.invoiceid, customer.firstname, customer.lastname
FROM invoice
INNER JOIN customer ON invoice.customerid = customer.customerid;

--4.2 Outer
/* A) */
SELECT invoice.total, invoice.invoiceid, customer.firstname, customer.lastname
FROM customer
FULL OUTER JOIN invoice ON customer.customerid = invoice.customerid;

--4.3 RIGHT
/* A) */
SELECT artist.name, album.title
FROM Artist
RIGHT OUTER JOIN album ON artist.artistid = album.albumid;

--4.4 CROSS
/* A) */
SELECT artist.name, album.title
FROM album
CROSS JOIN artist ORDER BY artist.name;

--4.5 SELF
/* A) */
SELECT*FROM employee;
SELECT employee.employeeid, employee.reportsto 
FROM employee
WHERE employee.employeeid <> employee.reportsto;

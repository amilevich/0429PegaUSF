--Oyindamola Odunjo 

--SQL Chinook Lab Assignment 

-- 2.1 SELECT
-- Task – Select all records from the Employee table.
SELECT * FROM Employee; 

--Task – Select all records from the Employee table where last name is King.
SELECT * FROM Employee
WHERE lastname = 'King';


--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM Employee
WHERE firstname = 'Andrew'
AND REPORTSTO = NULL;

--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM Album
ORDER BY Title DESC;

--Task – Select first name from Customer and sort result set in ascending order by city
SELECT firstname FROM Customer 
ORDER BY city;
--------------------------------------------------------------------------------------------------

--2.3 INSERT INTO

--Task – Insert two new records into Genre table

SELECT * FROM Genre; -- **Ignore: for testing
INSERT INTO Genre (GENREID, NAME)
VALUES ('26', 'Afrobeats');
INSERT INTO Genre (GENREID, NAME)
VALUES ('27', 'Raggaeton');


--Task – Insert two new records into Employee table
SELECT * FROM Employee;

INSERT INTO Employee (Employeeid, lastname, firstname, title, reportsto, 
birthdate, hiredate, address, city, state, country, postalcode, phone, fax, email)
VALUES ('9', 'Johnson', 'Redmond', 'Sales Manager', '1', '09-MAY-95', '05-AUG-05', '220 Main St', 'Calgary',
'AB', 'Canada', 'T3B 0C5', '+1 (708) 555-1020', '+1 (708) 555-1025', 'Redmond@chinookcorp.com');

INSERT INTO Employee (Employeeid, lastname, firstname, title, reportsto, 
birthdate, hiredate, address, city, state, country, postalcode, phone, fax, email)
VALUES ('10', 'Oakman', 'Shawn', 'IT Staff', '6', '03-JUN-91', '10-AUG-05', '660 Tribbett pl', 'Lethbridge',
'AB', 'Canada', 'T1K 5N8', '+1 (403) 817-1066', '+1 (403) 817-1067', 'Shawn@chinookcorp.com');


--Task – Insert two new records into Customer table
SELECT * FROM customer; --For testing 

INSERT INTO Customer (CUSTOMERID, FIRSTNAME, LASTNAME, COMPANY, ADDRESS, CITY, STATE, COUNTRY,
POSTALCODE, PHONE, FAX, EMAIL, SUPPORTREPID)
VALUES ('60', 'Sriram', 'Sid', '(null)', '800 E Lancaster Ave', 'Sidney', 'NSW', 'Australia', '2010', '+61 (02) 555 9195', 
'(null)', 'Ssriram22@gmail.com', '5');

INSERT INTO Customer (CUSTOMERID, FIRSTNAME, LASTNAME, COMPANY, ADDRESS, CITY, STATE, COUNTRY,
POSTALCODE, PHONE, FAX, EMAIL, SUPPORTREPID)
VALUES ('61', 'White', 'Katherine', '(null)', '250 Walnut St', 'Lasgidi', 'Lagos', 'Nigeria', '119291', '+234 (080) 366 70116', 
'(null)', 'KaWhi73@yahoo.com', '3');
----------------------------------------------------------------------------------------------
--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
SELECT * FROM customer; -- For testing 
UPDATE Customer 
SET firstname = 'Robert', lastname = 'Walter'
WHERE firstname = 'Aaron' AND lastname = 'Mitchell';

--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
SELECT * FROM artist; -- For testing 
UPDATE artist
SET name = 'CCR' 
WHERE name = 'Creedence Clearwater Revival';

--2.5 LIKE
--Task – Select all invoices with a billing address like “T%”
SELECT * FROM invoice -- Not for testing part of solution
WHERE billingaddress LIKE 'T%';

--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50
SELECT * FROM invoice
WHERE total BETWEEN 15 AND 50;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
SELECT * FROM Employee
WHERE HIREDATE BETWEEN '01-JAN-03' AND '01-MAR-04';

--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
SELECT * FROM Customer;-- For testing purposes to find Roberet Walter 
SELECT * FROM invoiceline WHERE invoiceid LIKE'290';
SELECT * FROM invoice WHERE customerid LIKE'32';
DELETE FROM invoiceline WHERE invoiceid = 245; --run from here to bottom
DELETE FROM invoiceline WHERE invoiceid = 290;
DELETE FROM invoiceline WHERE invoiceid = 268;
DELETE FROM invoiceline WHERE invoiceid = 50;
DELETE FROM invoiceline WHERE invoiceid = 61;
DELETE FROM invoiceline WHERE invoiceid = 116;
DELETE FROM invoiceline WHERE invoiceid = 342;
DELETE FROM invoice WHERE customerid = 32 AND invoiceid > 1; 
DELETE FROM customer WHERE customerid = 32; 

--------------------------------------------------------------------------------------------------------
--SQL Functions
--In this section you will be using the Oracle system functions, to perform various actions against the database
--3.1 System Defined Functions
--Task – Create a function that returns the current time.
SELECT TO_CHAR(CURRENT_DATE, 'HH:MI:SS') FROM dual;

--Task – create a function that returns the length of a mediatype from the mediatype table

SELECT * FROM mediatype;
SELECT LENGTH ('MPEG audio file') "Length" FROM dual;

--3.2 
--System Defined Aggregate Functions    

--Task – Create a function that returns the average total of all invoices
SELECT * FROM invoice;
SELECT AVG(total) FROM invoice;

--Task – Create a function that returns the most expensive track
SELECT * FROM TRACK;
SELECT MAX(unitprice) "MAX AMOUNT FOR A TRACK"  FROM track;

--4.0 JOINS
--In this section you will be working with combining various tables through the use of joins. 
--You will work with outer, inner, right, left, cross, and self joins.
---4.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
SELECT * FROM customer; -- To doublecheck 

SELECT invoice.invoiceid, customer.firstname, customer.lastname 
FROM invoice 
INNER JOIN customer ON invoice.customerid = customer.customerid; 

--4.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
SELECT invoice.total, invoice.invoiceid, customer.firstname, customer.lastname
FROM customer
FULL OUTER JOIN invoice ON customer.customerid = invoice.customerid;

--4.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.

SELECT artist.name, album.title
FROM Artist
RIGHT OUTER JOIN album ON artist.artistid = album.albumid;

--4.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
SELECT artist.name, album.title
FROM album
CROSS JOIN artist ORDER BY artist.name;

--4.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.
SELECT * FROM Employee; --For checking 

SELECT Employee.employeeid, employee.reportsto
FROM Employee
WHERE employee.employeeid <> employee.reportsto;



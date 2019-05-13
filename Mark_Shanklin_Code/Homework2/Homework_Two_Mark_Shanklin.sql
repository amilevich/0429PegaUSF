--SQL LAB
-- 1.0
-- 2.0

--2.1 SELECT
SELECT * FROM employee;

SELECT * FROM employee WHERE lastname='King';

SELECT * FROM employee WHERE firstname='Andrew' AND reportsto=NULL;

--2.2 ORDER BY
SELECT * FROM album ORDER BY title DESC;

SELECT firstname FROM customer ORDER BY city;

--2.3 INSERT INTO
    --task insert two new records into genre table
INSERT INTO genre (genreid, name) VALUES (26, 'Dubstep');
INSERT INTO genre (genreid, name) VALUES (27, 'Nightcore');
    --task insert two new records into employee table
INSERT INTO employee 
(employeeid, lastname, firstname, title, reportsto, 
    birthdate, hiredate, address, city, state, country, 
    postalcode, phone, fax, email) 
VALUES (9, 'Mary', 'Jude', 'HR Rep', null,
    '18-APR-87','13-APR-10', '123 A Street','Coos Bay', 'OR', 'USA', 
    'numbers', '+1 (541) 221-0111' , '+1 (541) 221-0112','mary@chinookcorp.com');
INSERT INTO employee 
(employeeid, lastname, firstname, title, reportsto, 
    birthdate, hiredate, address, city, state, country, 
    postalcode, phone, fax, email) 
VALUES (10, 'Joe', 'Dude', 'Software Dev', null,
    '10-SEP-80','13-APR-10', '122 A Street','Coos Bay', 'OR', 'USA', 
    'numbers', '+1 (541) 221-0121' , '+1 (541) 221-0122','joe@chinookcorp.com');
    --task insert two new records into customer table    
INSERT INTO customer 
(customerid, firstname, lastname, company, address, 
    city, state, country, postalcode, phone, fax, 
    email, supportrepid) 
VALUES
(60, 'Ann','Frank',null, '123 B Street', 
    'Klamath Falls', 'OR', 'USA', '97601', '+1 (541) 331-1234', null, 
    'ann@chinookcorp.com', 1);
    
INSERT INTO customer 
(customerid, firstname, lastname, company, address, 
    city, state, country, postalcode, phone, fax, 
    email, supportrepid) 
VALUES
(61, 'James','Topkin',null, '123 C Street', 
    'Klamath Falls', 'OR', 'USA', '97603', '+1 (541) 331-4321', null, 
    'james@chinookcorp.com', 1);
--2.4 UPDATE
    --Task – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE customer 
SET firstname='Robert' , lastname='Walter'
WHERE firstname='Aaron' AND lastname='Mitchell';
    --Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
UPDATE artist
SET name='CCR'
WHERE name='Creedence Clearwater Revival';
--2.5 LIKE
    --Task – Select all invoices with a billing address like “T%”
SELECT * FROM invoice WHERE billingaddress LIKE 'T%';
--2.6 BETWEEN
    --Task – Select all invoices that have a total between 15 and 50
SELECT * FROM invoice WHERE total BETWEEN 15 AND 20;
    --Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
SELECT * FROM employee WHERE hiredate BETWEEN '01-JUN-03' AND '01-MAR-04';
--2.7 DELETE
    --Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
DELETE FROM customer
WHERE firstname='Robert' AND lastname='Walter';


--3.0 SQL FUNCTIONS
--3.1 System Defined Functions
    --Task – Create a function that returns the current time.
SELECT SESSIONTIMEZONE, CURRENT_TIMESTAMP FROM DUAL;
    --Task – create a function that returns the length of a mediatype from the mediatype table

--3.2 System Defined Aggregate Functions    
    --Task – Create a function that returns the average total of all invoices

    --Task – Create a function that returns the most expensive track

--4.0 JOINS
--4.1 INNER
    --Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
    
--4.2 OUTER
    --Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

--4.3 RIGHT
    --Task – Create a right join that joins album and artist specifying artist name and title.
    
--4.4 CROSS
    --Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.

--4.5 SELF
    --Task – Perform a self-join on the employee table, joining on the reportsto column.

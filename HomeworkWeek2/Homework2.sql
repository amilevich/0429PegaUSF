-- Task 2.1a – Select all records from the Employee table.
SELECT * FROM employee;
-- Task 2.1b– Select all records from the Employee table where last name is King.
SELECT *FROM employee WHERE lastname = 'King';
-- Task 2.1c– Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT *FROM employee 
WHERE firstname = 'Andrew'
AND reportsto is NULL;
-- Task 2.2a– Select all albums in Album table and sort result set in descending order by title.
SELECT *FROM album 
ORDER BY title;
-- Task 2.2b– Select first name from Customer and sort result set in ascending order by city
SELECT *FROM customer
ORDER BY city DESC; 
-- Task 2.3a– Insert two new records into Genre table
INSERT INTO genre VALUES(26, 'Country');
INSERT INTO genre VALUES(27, 'Spoken Word');
SELECT *FROM genre;
-- Task 2.3b– Insert two new records into Employee table
INSERT INTO employee VALUES(9, 'Dobbs', 'Bob', 'Marketing Rep', 1, '27-SEP-66', '02-FEB-07', '4129 N. Sharapova Cir', 'Red Deer', 'AB', 'Canada', 'T4N 0B1', '+1 (403) 470-3891', '+1 (403) 470-3892', 'bobdobbs@chinookcorp.com');
INSERT INTO employee VALUES(10, 'Romanov', 'Carol', 'HR', 1, '12-DEC-60', '09-JAN-04', '7819 Belfast Ave', 'Calgary', 'AB', 'Canada', 'T2P 5B6', '+1 (403) 262-4407', '+1 (403) 262-4408', 'carolr@chinookcorp.com');
SELECT *FROM employee;
-- Task 2.3c– Insert two new records into Customer table
INSERT INTO customer VALUES(60, 'Larry', 'Schwartzer',null, '1275 Lancaster Ct', 'Wilmington', 'DE', 'USA', '19804', '+1 (302) 171-1938',null, 'schwartzer9000@gmaill.com', 4);
INSERT INTO customer VALUES(61, 'Herman', 'Gouda',null, '8806 Newhaven Ave', 'Montpeiler', 'VT', 'USA', '05601', '+1 (802) 019-1176',null, 'hermanatorwithcheez@yuhoo.com', 5);
SELECT *FROM customer;
-- Task 2.4a– Update Aaron Mitchell in Customer table to Robert Walter
UPDATE customer 
SET FIRSTNAME = 'Robert'
, LASTNAME = 'Walter' WHERE CUSTOMERID=32;
COMMIT;
/
SELECT *FROM customer;
-- Task 2.4b– Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
UPDATE artist 
SET NAME = 'CCR' WHERE NAME = 'Creedence Clearwater Revival';
SELECT *FROM artist;
-- Task 2.5– Select all invoices with a billing address like “T%”
SELECT * FROM invoice WHERE LOWER(BILLINGADDRESS) LIKE 't%';
-- Task 2.6a– Select all invoices that have a total between 15 and 50
SELECT * FROM invoice WHERE TOTAL >15 AND TOTAL <50;
-- Task 2.6b– Select all employees hired between 1st of June 2003 and 1st of March 2004
SELECT * FROM employee WHERE HIREDATE BETWEEN '01-JUN-2003' AND '01-MAR-2004';
-- Task 2.7– Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
--ADDED "ON DELETE CASCADE" to customer table.
DELETE FROM customer
WHERE CUSTOMERID = 32;
-- Task 3.1a– Create a function that returns the current time.
SELECT CURRENT_TIMESTAMP from dual;
-- Task 3.1b– create a function that returns the length of a mediatype from the mediatype table
SELECT LENGTH (NAME) "Length in characters"
   FROM mediatype;
-- Task 3.2a– Create a function that returns the average total of all invoices
SELECT AVG (TOTAL) FROM invoice;
-- Task 3.2b– Create a function that returns the most expensive track
SELECT MAX (UNITPRICE) from track;
-- Task 4.1– Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
SELECT * FROM customer Inner Join invoice on customer.CUSTOMERID = invoice.CUSTOMERID;
-- Task 4.2– Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
SELECT * FROM customer Full Join invoice on customer.CUSTOMERID = invoice.CUSTOMERID;
-- Task 4.3– Create a right join that joins album and artist specifying artist name and title.
SELECT * FROM artist Right Join album on artist.ARTISTID = album.ARTISTID;
-- Task 4.4– Create a cross join that joins album and artist and sorts by artist name in ascending order.
SELECT * FROM artist Cross Join album ORDER BY NAME;
-- Task 4.5– Perform a self-join on the employee table, joining on the reportsto column.
SELECT e.EMPLOYEEID,
       e.FIRSTNAME,
       e.LASTNAME,
       m.FIRSTNAME AS MANAGER_FN,
       m.LASTNAME AS MANAGER_LN
from employee e
JOIN employee m
    ON e.REPORTSTO = m.EMPLOYEEID;








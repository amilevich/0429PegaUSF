--2.1 SELECT
-- 2.1 - Select all records from the Employee table.
SELECT * FROM Employee;

--2.1B – Select all records from the Employee table where last name is King.
SELECT * FROM Employee WHERE (lastname = 'King');

--2.1C SELECT: Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM Employee WHERE (firstname = 'Andrew') AND reportsto IS NULL;

-- 2.2 ORDER BY
--A Task – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM album ORDER BY title DESC;

--B Task – Select first name from Customer and sort result set in ascending order by city
SELECT * FROM customer ORDER BY city ASC;

-- 2.3 INSERT INTO
--A Task – Insert two new records into Genre table
INSERT INTO genre (genreid, name) VALUES ('26', 'Beyonce');
INSERT INTO genre (genreid, name) VALUES ('27', 'Mozart');
select * from genre;
--B Task – Insert two new records into Employee table
INSERT INTO employee (employeeid, lastname, firstname, title, reportsto, birthdate, hiredate, address, city, state, country, postalcode, phone, fax, email) 
VALUES ('9', 'Carter', 'Braden', 'IT Staff', '2', '16-OCT-77', '15-APR-05', '1234 Maple Str NW', 'Lethbridge', 'AB', 'Canada', 'T1H 1Y8', '+1 (403 444-3455', '+1 (780 456-7899', 'braden@chinookcorp.com');

INSERT INTO employee (employeeid, lastname, firstname, title, reportsto, birthdate, hiredate, address, city, state, country, postalcode, phone, fax, email) 
VALUES ('10', 'Jackson', 'Michael', 'President', '3', '15-NOV-77', '15-DEC-05', '4321 Chocolate Str SW', 'Calgary', 'AB', 'Canada', 'T3B 0C5', '+1 (403 555-5533', '+1 (780 456-2467', 'michael@chinookcorp.com');
SELECT * FROM employee;

--C Task – Insert two new records into Customer table
INSERT INTO customer (customerid, firstname, lastname, company, address, city, state, country, postalcode, phone, fax, email, supportrepid)
VALUES ('60', 'Harsh', 'Parikh', 'JetBrains s.r.o.', '1234 E Billy Street', 'Vienne', 'SP', 'Brazil', '12227-000', '+55 (12) 3422-5335', '+55 (11) 2324-5453', 'hparikh@embraer.com.br', '5');

INSERT INTO customer (customerid, firstname, lastname, company, address, city, state, country, postalcode, phone, fax, email, supportrepid)
VALUES ('61', 'Mark', 'Remark', 'Fire Nation', '4455 E Burn Street', 'Castro Valley', 'CA', 'United States', '94546-000', '+1 564 433 5555', '+1 332 666 4444', 'Mremark@firenation', '2');

SELECT * FROM Customer;

-- 2.4 UPDATE
--A Task – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE customer SET firstname = 'Robert',  lastname = 'Walter' WHERE firstname = 'Aaron' AND lastname = 'Mitchell';
SELECT * FROM customer;

--B Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
UPDATE artist SET name = 'CCR' WHERE name = 'Creedence Clearwater Revival';
SELECT * FROM artist;


-- 2.5 LIKE
--A Task – Select all invoices with a billing address like “T%”
SELECT * from invoice WHERE billingaddress LIKE 'T%'


-- 2.6 BETWEEN
--A Task – Select all invoices that have a total between 15 and 50

SELECT * FROM invoice WHERE total BETWEEN 15 and 20 ;

--B Task – Select all employees hired between 1 st of June 2003 and 1 st of March 2004

SELECT * FROM Employee WHERE hiredate BETWEEN '01-JUN-03' AND '01-MAR-04';

-- 2.7 DELETE
--A Task – Delete a record in Customer table where the name is Robert Walter 
-- (There may be constraints
-- that rely on this, find out how to resolve them).

ALTER TABLE Invoice DROP CONSTRAINT FK_InvoiceCustomerId;

ALTER TABLE Invoice ADD CONSTRAINT FK_InvoiceCustomerId FOREIGN KEY (CustomerId) REFERENCES Customer (CustomerId)
   ON DELETE CASCADE;

ALTER TABLE InvoiceLine DROP CONSTRAINT FK_INVOICELINEINVOICEID;
ALTER TABLE InvoiceLine  ADD CONSTRAINT FK_InvoiceLineInvoiceId FOREIGN KEY (InvoiceId) REFERENCES Invoice (InvoiceId)
   ON DELETE CASCADE;


ALTER TABLE Customer DROP constraint FK_CUSTOMERSUPPORTREPID;

ALTER TABLE Customer DROP COLUMN SUPPORTREPID;

ALTER TABLE employee   ADD CONSTRAINT FK_CUSTOMERSUPPORTREPID;

DELETE FROM customer
where firstname = 'Robert' and lastname = 'Walter';

SELECT * from customer;

-- 3.0 SQL Functions
-- In this section you will be using the Oracle system functions, to perform various actions against the
-- database

-- 3.1 System Defined Functions
--A Task – Create a function that returns the current time.
/*Task – Create a function that returns the current time.*/
CREATE OR REPLACE PROCEDURE current_time
is
    BEGIN
         DBMS_OUTPUT.PUT_LINE('The current time in Florida is: '      
         ||    TO_CHAR(CURRENT_DATE, 'MON-DD-YYYY HH:MI:SS') );
    END;
    /
    BEGIN
  current_time();
END;
/

--B Task – create a function that returns the length of a mediatype from the mediatype table

create or replace function getlength(x in varchar2) 
return integer as z varchar(200);
begin 
    z := length(x);
    return z;
end;
/
select getlength(name) from mediatype;


-- 3.2 System Defined Aggregate Functions
--A Task – Create a function that returns the average total of all invoices
SELECT AVG(total) FROM invoice;

--B Task – Create a function that returns the most expensive track
SELECT Max(unitprice) from track;

--4.0 JOINS
-- In this section you will be working with combing various tables through the use of joins. You will work
-- with outer, inner, right, left, cross, and self joins.

--4.1 INNER
--A Task – Create an inner join that joins customers and orders and specifies the name of the customer and
-- the invoiceId.

SELECT C.FIRSTNAME, C.LASTNAME, I.INVOICEID
FROM CUSTOMER C
INNER JOIN INVOICE I
ON C.CUSTOMERID = I.CUSTOMERID;

-- 4.2 OUTER
--A Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId,
-- firstname, lastname, invoiceId, and total.

SELECT C.CUSTOMERID, C.FIRSTNAME, C.LASTNAME, I.INVOICEID, I.TOTAL
FROM CUSTOMER C
LEFT OUTER JOIN INVOICE I ON C.CUSTOMERID = I.CUSTOMERID;


-- 4.3 RIGHT
--A Task – Create a right join that joins album and artist specifying artist name and title.

SELECT ARTIST.NAME, ALBUM.TITLE
FROM ALBUM
RIGHT OUTER JOIN ARTIST ON ALBUM.ARTISTID = ARTIST.ARTISTID;


-- 4.4 CROSS
--A Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.

SELECT *
FROM ALBUM
CROSS JOIN ARTIST
ORDER BY ARTIST.NAME ASC;

-- 4.5 SELF
-- A Task – Perform a self-join on the employee table, joining on the reportsto column.

SELECT *
FROM EMPLOYEE E1
INNER JOIN EMPLOYEE E2
ON E1.REPORTSTO = E2.REPORTSTO;

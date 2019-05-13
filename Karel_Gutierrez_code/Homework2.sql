
------***********HomeWork 1 SQL*****************************

-- 2.1 SELECT 

SELECT * FROM Employee;
SELECT * FROM Employee WHERE lastname='King';
SELECT * FROM Employee WHERE firstname='Andrew' AND REPORTSTO IS NULL;


-- 2.2 ORDER BY 
SELECT * FROM ALBUM ORDER BY title DESC; 
SELECT firstname FROM Customer ORDER BY city ASC;

--2.3 INSERT INTO
INSERT INTO Genre (GENREID, NAME) VALUES (26, 'Symphonic Black Metal');
INSERT INTO Genre (GENREID, NAME) VALUES (27, 'Jpop');
INSERT INTO Employee (EMPLOYEEID, FIRSTNAME, LASTNAME) VALUES (30, 'George', 'Washington');
INSERT INTO Employee (EMPLOYEEID, FIRSTNAME, LASTNAME) VALUES (9, 'Abraham ', 'Lincoln');
INSERT INTO customer (CUSTOMERID, FIRSTNAME, LASTNAME, EMAIL) VALUES (60, 'Bruce', 'Walters','bruce.walters@gmail.com'); 
INSERT INTO customer (CUSTOMERID, FIRSTNAME, LASTNAME, EMAIL) VALUES (61, 'Michael', 'Piers','michael.piers@gmail.com');


--2.4 UPDATE WHERE
UPDATE customer SET FIRSTNAME = 'Robert', lastname= 'Walter' WHERE firstname = 'Aaron' AND lastname= 'Mitchell';
UPDATE artist SET name = 'CCR' WHERE name = 'Creedence Clearwater Revival';

--2.5 LIKE
SELECT * FROM Invoice WHERE BillingAddress LIKE 'T%';

--2.6 BETWEEN
SELECT * FROM invoice WHERE total BETWEEN 15 AND 50;
SELECT * FROM employee WHERE hiredate BETWEEN '01-JUN-2003' AND '01-MAR-2004';

--2.7 DELETE -- is there an issue without deleting the children. there is only 1 row deleted
ALTER TABLE Invoice
    DROP CONSTRAINT FK_InvoiceCustomerId;
    ALTER TABLE Invoice 
    ADD CONSTRAINT FK_InvoiceCustomerId
    FOREIGN KEY (CustomerId) REFERENCES Customer (CustomerId)
    ON DELETE CASCADE; 

ALTER TABLE InvoiceLine 
    DROP CONSTRAINT FK_INVOICELINEINVOICEID;
ALTER TABLE InvoiceLine 
    ADD CONSTRAINT FK_InvoiceLineInvoiceId
    FOREIGN KEY (InvoiceId) REFERENCES Invoice (InvoiceId)
    ON DELETE CASCADE;
    
DELETE FROM Customer WHERE FirstName='Robert' AND LastName='Walter';


--3.1 functions and system
/* Task – Create a function that returns the current time. */
ALTER SESSION SET TIME_ZONE = '-1:00';

SELECT CURRENT_TIMESTAMP
FROM dual;


/* Task – create a function that returns the length of a mediatype from the mediatype table */
SELECT NAME, LENGTH2(NAME)FROM MEDIATYPE;


--3.2 System Defined Aggregate Functions *********************** */
/* Task – Create a function that returns the average total of all invoices */
SELECT AVG(TOTAL)FROM INVOICE;

/* Task – Create a function that returns the most expensive track */
SELECT MAX(UNITPRICE)FROM INVOICELINE;


--4.1 Inner Join CUSTOMERS & INVOICE - cols = custname & invoiceid */
SELECT CUSTOMER.FIRSTNAME || CUSTOMER.LASTNAME AS Name, INVOICE.INVOICEID FROM CUSTOMER
INNER JOIN INVOICE ON CUSTOMER.CUSTOMERID = INVOICE.INVOICEID;


--4.2  Outer Join on CUSTOMERS and INVOICE - cols customerid, firstname, lastname, invoiceid, total */
SELECT  CUSTOMER.CUSTOMERID as ID,
        CUSTOMER.FIRSTNAME || CUSTOMER.LASTNAME as Name,
        INVOICE.INVOICEID as Invoice,
        INVOICE.TOTAL as Total
FROM CUSTOMER
LEFT OUTER JOIN INVOICE on CUSTOMER.CUSTOMERID = INVOICE.CUSTOMERID;


--4.3 /* Right join ALBUM and ARTIST - cols artistname & title */
SELECT ALBUM.TITLE, ARTIST.NAME
FROM ARTIST
RIGHT OUTER JOIN ALBUM
ON ALBUM.ARTISTID = ARTIST.ARTISTID;


--4.4  Cross Join ALBUM and ARTIST - sort by artist name ASC */
SELECT * FROM ALBUM
CROSS JOIN ARTIST
ORDER BY ARTIST.NAME;

--4.5  SELF JOIN self-join on the employee table, joining on the reportsto column. */
SELECT FIRST.EMPLOYEEID, FIRST.LASTNAME || FIRST.FIRSTNAME AS Name, SECOND.REPORTSTO
FROM EMPLOYEE FIRST, EMPLOYEE SECOND
WHERE FIRST.EMPLOYEEID = SECOND.REPORTSTO; 



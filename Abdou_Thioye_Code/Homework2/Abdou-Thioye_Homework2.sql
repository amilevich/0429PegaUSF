/*Select all records from the Employee table.*/
SELECT * FROM employee;


/*Select all records from the Employee table where last name is King.*/
SELECT * FROM employee WHERE lastname = 'King';


/*
Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
*/
SELECT * FROM employee where firstname = 'Andrew' AND reportsto IS NULL;


/*
Task – Select all albums in Album table and sort result set in descending order by title.
*/
SELECT * FROM ALBUM ORDER BY TITLE DESC;


/*
Task – Select first name from Customer and sort result set in ascending order by city
*/
SELECT FIRSTNAME FROM CUSTOMER ORDER BY CITY ASC;


/*
Task – Insert two new records into Genre table
*/
SELECT * FROM genre;
INSERT INTO genre (GENREID, NAME) VALUES (26, 'Abdou');
INSERT INTO genre (GENREID, NAME) VALUES (27, 'Marden');


/*
Task – Insert two new records into Employee table
*/
select * from employee;
INSERT INTO  employee (employeeid,lastname,firstname,title,reportsto,birthdate,hiredate,address,city,state,country,postalcode,phone,fax,email) 
VALUES(9,'Harsh','Normal','Sales',5,'05-FEB-2005','03-APR-1965',
'2552 Manhattan ST','New York','NY','USA','10026','+1 (646) 5254-758','+1 (646) 525-4758','Abdou@gmail.com');

INSERT INTO  employee (employeeid,lastname,firstname,title,reportsto,birthdate,hiredate,address,city,state,country,postalcode,phone,fax,email) 
VALUES(10,'Abdou','Thioye','Programer',5,'05-FEB-2001','03-APR-1975',
'2552 Manhattan ST','New York','NY','USA','10026','+1 (646) 5254-758','+1 (646) 525-4758','Hash@gmail.com');


/*
Task – Insert two new records into Customer table
*/
select * from customer;
INSERT INTO  customer (customerid,lastname,firstname,company,address,city,state,country,postalcode,phone,fax,email,supportrepid) 
VALUES(60,'Abdou','Thioye','Revature',
'2552 Manhattan ST','New York','NY','USA','10026','+1 (646) 5254-758','+1 (646) 525-4758','Hash@gmail.com',7);

INSERT INTO  customer (customerid,lastname,firstname,company,address,city,state,country,postalcode,phone,fax,email,supportrepid) 
VALUES(61,'Alex','John','Revature',
'2552 perl ST','New York','FL','USA','33612','+1 (646) 5254-758','+1 (646) 525-4758','Alex@gmail.com',7);


/*Task – Update Aaron Mitchell in Customer table to Robert Walter*/
update customer
set firstname = 'Robert', lastname = 'Walter'
where firstname='Aaron' and lastname = 'Mitchell';

/*Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”*/
update artist
set name = 'CCR'
where name = 'Creedence Clearwater Revival';


/*Task – Select all invoices with a billing address like “T%”*/
SELECT * FROM invoice where billingaddress like 'T%';


/*Task – Select all invoices that have a total between 15 and 50*/
select * from invoice where total between 15 and 50;


/*Task – Select all employees hired between 1st of June 2003 and 1st of March 2004*/
select * from employee where hiredate between '01-JUN-03' and '01-MAR-04';


/*Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).*/
ALTER TABLE Invoice DROP CONSTRAINT FK_InvoiceCustomerId;

delete from customer
where firstname = 'Robert' and lastname = 'Walter';

SELECT
    *
FROM customer where firstname='Robert';


/*Task – Create a function that returns the current time.*/
CREATE OR REPLACE PROCEDURE current_time_in_florida
is
    BEGIN
         DBMS_OUTPUT.PUT_LINE('The current time in Florida is: '      
         ||    TO_CHAR(CURRENT_DATE, 'MON-DD-YYYY HH:MI:SS') );
    END;
    /
    BEGIN
  current_time_in_florida();
END;
/


/*Task – create a function that returns the length of a mediatype from the mediatype table.*/
  Select  length (name) "String length in charactors"  FROM mediatype where mediatypeid=1 ;
 

/*Task – Create a function that returns the average total of all invoices*/
select AVG(total) from Invoice;


/*Task – Create a function that returns the most expensive track*/
Select Max(unitprice) from track;



/*Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.*/
SELECT CUSTOMER.FIRSTNAME ||' '|| CUSTOMER.LASTNAME AS Name, INVOICE.INVOICEID
FROM CUSTOMER
INNER JOIN INVOICE ON CUSTOMER.CUSTOMERID = INVOICE.INVOICEID
ORDER BY Name;


/*Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.*/

SELECT  CUSTOMER.CUSTOMERID ,
        CUSTOMER.FIRSTNAME ||' '|| CUSTOMER.LASTNAME ,
        INVOICE.INVOICEID ,
        INVOICE.TOTAL 
FROM CUSTOMER
FULL OUTER JOIN INVOICE 
on CUSTOMER.CUSTOMERID = INVOICE.CUSTOMERID;


/*Task – Create a right join that joins album and artist specifying artist name and title.*/
SELECT ALBUM.TITLE, ARTIST.NAME
FROM ARTIST
RIGHT JOIN ALBUM
ON ALBUM.ARTISTID = ARTIST.ARTISTID;


/*Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.*/
SELECT *
FROM ALBUM
    CROSS JOIN ARTIST
ORDER BY ARTIST.NAME;


/*Task – Perform a self-join on the employee table, joining on the reportsto column.*/
SELECT FIRST.EMPLOYEEID, FIRST.LASTNAME ||' '||FIRST.FIRSTNAME AS Name, SECOND.REPORTSTO
FROM EMPLOYEE FIRST, EMPLOYEE SECOND
WHERE FIRST.EMPLOYEEID = SECOND.REPORTSTO; 


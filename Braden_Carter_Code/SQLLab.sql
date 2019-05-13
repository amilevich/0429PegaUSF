--BRADEN CARTER   PEGA BATCH 05/13/2019
--SQL LAB HOMEWORK

--2.1 SELECT
--Task – Select all records from the Employee table.
SELECT*FROM Employee;

--Task – Select all records from the Employee table where last name is King.
SELECT*FROM Employee WHERE lastname = 'King';

--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT*FROM Employee WHERE firstname = 'Andrew' AND Reportsto is NULL;

--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.
SELECT*FROM Album ORDER BY title DESC;

--Task – Select first name from Customer and sort result set in ascending order by city
SELECT FIRSTNAME FROM Customer ORDER BY city ASC;

--2.3 INSERT INTO
--Task – Insert two new records into Genre table
INSERT INTO genre(genreid, name) values (26, 'bad music');
INSERT INTO genre(genreid, name) values (27, 'good music');

--Task – Insert two new records into Employee table
INSERT INTO employee(employeeid, lastname, firstname) values(9, 'Carter', 'Braden');
INSERT INTO employee(employeeid, lastname, firstname) values(10, 'McGuire', 'Mark');

--Task – Insert two new records into Customer table
INSERT into Customer (customerid, firstname, lastname, email) values (60, 'Braden', 'Carter', 'BradenCarter@gmail.com');

--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE customer SET firstname = 'Robert', lastname = 'WALTER' WHERE firstname = 'Aaron' and lastname = 'Mitchell';

--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

--2.5 LIKE
--Task – Select all invoices with a billing address like “T%”
select * from invoice where BILLINGADDRESS like 'T%';

--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50
select * from invoice where TOTAL between 15 and 30;

--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from employee where HIREDATE between '01-JUN-2003' and '01-MAR-2004';

--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
--rely on this, find out how to resolve them).
alter table invoice drop constraint FK_INVOICECUSTOMERID;
ALTER TABLE Invoice ADD CONSTRAINT FK_InvoiceCustomerID FOREIGN KEY (CustomerId) REFERENCES Customer (CustomerId) on delete cascade;
ALTER TABLE invoiceline drop constraint FK_INVOICELINEINVOICEID;
ALTER TABLE InvoiceLine ADD CONSTRAINT FK_InvoiceLineInvoiceId FOREIGN KEY (InvoiceId) REFERENCES Invoice (InvoiceId) on delete cascade;
delete from customer where FIRSTNAME = 'Robert' and LASTNAME = 'WALTER';

--3.0	SQL Functions
--In this section you will be using the Oracle system functions, to perform various actions against the database
--3.1 System Defined Functions
--Task – Create a function that returns the current time.
create or replace Function getTime 
return timestamp 
is
begin 
    return SYSDATE;
    end;
/
declare
    today timestamp;
begin
    today := getTime;
    dbms_output.put_line(today);
end;
/

--Task – create a function that returns the length of a mediatype from the mediatype table
create or replace function getlength(x in varchar2) 
return integer as z varchar(200);
begin 
    z := length(x);
    return z;
end;
/

--3.2 System Defined Aggregate Functions    
select getlength(name) from mediatype;

--Task – Create a function that returns the average total of all invoices
create or replace function myavg
return number as z number;
begin 
    select avg(total) into z from invoice;
    return z;
end;
/
select myavg from dual;

--Task – Create a function that returns the most expensive track
create or replace function mymax
return number as z number (10, 2);
begin 
    select max(unitprice) into z from track;
    return z;
end;
/
select mymax from dual;

--4.0 JOINS
--In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.

--4.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
SELECT firstname, lastname, invoiceid
    FROM customer INNER JOIN invoice
    ON customer.customerid = invoice.customerid;

--4.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
SELECT customer.customerid, firstname, lastname, invoiceid, total
    FROM customer LEFT JOIN invoice
    ON customer.customerid = invoice.customerid;
    
--4.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
SELECT name, title
    FROM album RIGHT JOIN artist
    ON album.artistid = artist.artistid;

--4.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
SELECT * FROM artist CROSS JOIN album ORDER BY name;

--4.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.
SELECT * FROM employee e1, employee e2 WHERE e1.reportsto = e2.reportsto;
 
 commit;

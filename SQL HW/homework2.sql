-- 2.1
SELECT * FROM Employee;
SELECT * FROM Employee where lastName = 'King';
SELECT * From employee where FirstName ='Andrew' and reportsto is null;

-- 2.2
SELECT * from ALBUM Order by title desc;
SELECT firstName from customer order by city;

--2.3
INSERT INTO Genre VALUES(26,'');
INSERT INTO Genre VALUES(27,'');
INSERT INTO Employee VALUES(9, 'lastname', 'firstname', 'title', 1, '01-JAN-2001', '01-JAN-2001',
'123 street', 'town', 'st', 'country', '12345', '1234567890', '1234567891', 'email@example.com');
INSERT INTO Employee VALUES(10, 'lastname', 'firstname', 'title', 1, '01-JAN-2001', '01-JAN-2001',
'123 street', 'town', 'st', 'country', '12345', '1234567890', '1234567891', 'email@example.com');
INSERT INTO Customer VALUES(60, 'firstname', 'lastname', 'company', '123 street', 'town', 'st',
'country', '12345', '1234567890', '1234567891', 'email@example.com', 2);
INSERT INTO Customer VALUES(61, 'firstname', 'lastname', 'company', '123 street', 'town', 'st',
'country', '12345', '1234567890', '1234567891', 'email@example.com', 2);

--2.4
UPDATE CUSTOMER
Set firstName = 'Robert', lastname='Walter'
WHERE firstname='Aaron' and lastname='Mitchell';
UPDATE Artist SET name='CCR' WHERE name='Creedence Clearwater Revival';
 
--2.5
SELECT * from invoice where billingaddress like 'T%';

--2.6
SELECT * from invoice where total Between 15 and 50;
SELECT * from employee where hiredate between '01-JUN-2003' and '01-MAR-2004';

--2.7
delete from invoiceline where invoiceid=50;
delete from invoiceline where invoiceid=61;
delete from invoiceline where invoiceid=116;
delete from invoiceline where invoiceid=245;
delete from invoiceline where invoiceid=268;
delete from invoiceline where invoiceid=290;
delete from invoiceline where invoiceid=342;
DELETE FROM invoice where customerid=32;
DELETE from customer where firstName = 'Robert' and lastname='Walter';

--3.1
CREATE OR REPLACE FUNCTION get_current_time
RETURN VARCHAR2
IS
    out_vc2 VARCHAR2(8);
BEGIN
    out_vc2 := TO_CHAR(EXTRACT(HOUR FROM LOCALTIMESTAMP)||':'||EXTRACT(MINUTE FROM LOCALTIMESTAMP));
    RETURN out_vc2;
END;
/

CREATE OR REPLACE FUNCTION get_mediatype_length(in_num IN NUMBER)
RETURN NUMBER
IS
    typevc2 VARCHAR2(50);
    out_num NUMBER(2);
BEGIN
    SELECT name INTO typevc2 FROM Mediatype WHERE mediatypeid=in_num;
    out_num := LENGTH(typevc2);
    RETURN out_num;
END;
/


--3.2
CREATE OR REPLACE FUNCTION avg_invoice_total
RETURN NUMBER
IS
    out_num NUMBER;
BEGIN
    SELECT AVG(total) INTO out_num FROM Invoice;
    RETURN out_num;
END;
/

CREATE OR REPLACE FUNCTION highest_price_track
RETURN NUMBER
IS
    out_num NUMBER;
BEGIN
    SELECT MAX(unitprice) INTO out_num FROM Track;
    RETURN out_num;
END;
/
--4.1
SELECT Customer.firstname, Customer.lastname, Invoice.invoiceid
FROM Customer
INNER JOIN Invoice
ON Customer.customerid=Invoice.customerid;
--4.2
SELECT Customer.customerid, Customer.firstname, Customer.lastname, Invoice.invoiceid, Invoice.total
FROM Customer
LEFT OUTER JOIN Invoice
ON Customer.customerid=Invoice.customerid;
--4.3
SELECT Artist.name, Album.title
FROM Artist
RIGHT OUTER JOIN Album
ON Artist.artistid=Album.artistid;

--4.4
CREATE OR REPLACE FUNCTION avg_invoice_total
RETURN NUMBER
IS
    out_num NUMBER;
BEGIN
    SELECT AVG(total) INTO out_num FROM Invoice;
    RETURN out_num;
END;
/
--4.5
CREATE OR REPLACE FUNCTION highest_price_track
RETURN NUMBER
IS
    out_num NUMBER;
BEGIN
    SELECT MAX(unitprice) INTO out_num FROM Track;
    RETURN out_num;
END;
/
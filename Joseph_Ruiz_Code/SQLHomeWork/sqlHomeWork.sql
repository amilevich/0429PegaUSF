-- File: sqlHomeWork.sql
-- Author: Joe Ruiz
-- Date: 05/10/2019

-- 2.1 SELECT
SELECT * FROM Employee;
SELECT * FROM Employee WHERE lastname='King';
SELECT * FROM Employee WHERE firstname='Andrew' AND reportsto IS NULL;

-- 2.2 ORDER BY
SELECT * FROM Album ORDER BY title DESC;
SELECT firstname FROM Customer ORDER BY city;

-- 2.3 INSERT INTO
-- genre
INSERT INTO Genre VALUES(26, 'Noise');
INSERT INTO Genre VALUES(27, 'Other');
-- employee
INSERT INTO Employee
VALUES(9, 'Name', 'Employee', 'Cashier', 2, TO_DATE('10-AUG-1980','DD-MON-YYYY'), TO_DATE('31-AUG-2003','DD-MON-YYYY'),
'1234 Street St W', 'Calgary', 'AB', 'Canada', 'T2P 2T3', '+1 (403) 555-5555', '+1 (403) 555-5556', 'employee@chinookcorp.com');
INSERT INTO Employee
VALUES(10, 'Person', 'Another', 'Cashier', 2, TO_DATE('01-AUG-1983','DD-MON-YYYY'), TO_DATE('01-JUN-2002','DD-MON-YYYY'),
'4213 Street St E', 'Calgary', 'AB', 'Canada', 'T2P 2T3', '+1 (403) 555-5557', '+1 (403) 555-5558', 'another@chinookcorp.com');
-- customer
INSERT INTO Customer
VALUES(60, 'Some', 'Person', NULL, '2454 Street St', 'Somewhere', 'ST', 'Somewhere', '342',
'+1 (999) 324-1643', '+1 (999) 324-5224', 'someperson4687@email.net', 4);
INSERT INTO Customer
VALUES(61, 'Anyone', 'Customer', 'Somewhere Store', '34525 Street St Apt A', 'Somewhere', 'ST', 'Somewhere', '347',
'+1 (999) 432-6453', '+1 (999) 432-3564', 'anyone@somewherestoresomewhere.net', 4);

-- 2.4 UPDATE
UPDATE Customer SET firstname='Robert', lastname='Walter' WHERE (firstname='Aaron' AND lastname='Mitchell');
UPDATE Artist SET name='CCR' WHERE name='Creedence Clearwater Revival';

-- 2.5 LIKE
SELECT * FROM Invoice WHERE billingaddress LIKE 'T%';

-- 2.6 BETWEEN
SELECT * FROM Invoice WHERE total BETWEEN 15 AND 50;
SELECT * FROM Employee WHERE hiredate BETWEEN TO_DATE('2003-06-01', 'YYYY-MM-DD') AND TO_DATE('2004-03-01', 'YYYY-MM-DD');

-- 2.7 DELETE
-- get customer id: SELECT * FROM Customer WHERE (firstname='Robert' AND lastname='Walter');
-- get invoice numbers: SELECT * FROM Invoice WHERE customerid=32;
DELETE FROM Invoiceline WHERE invoiceid=245;
DELETE FROM Invoiceline WHERE invoiceid=268;
DELETE FROM Invoiceline WHERE invoiceid=290;
DELETE FROM Invoiceline WHERE invoiceid=342;
DELETE FROM Invoiceline WHERE invoiceid=50;
DELETE FROM Invoiceline WHERE invoiceid=61;
DELETE FROM Invoiceline WHERE invoiceid=116;
DELETE FROM Invoice WHERE customerid=32;
DELETE FROM Customer WHERE (firstname='Robert' AND lastname='Walter');

-- 3.1
CREATE OR REPLACE FUNCTION get_current_time
RETURN VARCHAR2
IS
    out_vc2 VARCHAR2(8);
BEGIN
    out_vc2 := TO_CHAR(EXTRACT(HOUR FROM LOCALTIMESTAMP)||':'||EXTRACT(MINUTE FROM LOCALTIMESTAMP));
    RETURN out_vc2;
END;
/
DECLARE
    now_vc2 VARCHAR2(8);
BEGIN
    now_vc2 := get_current_time();
    DBMS_OUTPUT.PUT_LINE(now_vc2);
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
DECLARE
    test_num NUMBER;
BEGIN
    test_num := get_mediatype_length(2);
    DBMS_OUTPUT.PUT_LINE(test_num);
END;
/

-- 3.2
CREATE OR REPLACE FUNCTION avg_invoice_total
RETURN NUMBER
IS
    out_num NUMBER;
BEGIN
    SELECT AVG(total) INTO out_num FROM Invoice;
    RETURN out_num;
END;
/
DECLARE
    test_num NUMBER;
BEGIN
    test_num := avg_invoice_total();
    DBMS_OUTPUT.PUT_LINE(test_num);
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
DECLARE
    test_num NUMBER;
BEGIN
    test_num := highest_price_track();
    DBMS_OUTPUT.PUT_LINE(test_num);
END;
/

-- 4.1 INNER JOIN
SELECT Customer.firstname, Customer.lastname, Invoice.invoiceid
FROM Customer
INNER JOIN Invoice
ON Customer.customerid=Invoice.customerid;

-- 4.2 LEFT OUTER JOIN
SELECT Customer.customerid, Customer.firstname, Customer.lastname, Invoice.invoiceid, Invoice.total
FROM Customer
LEFT OUTER JOIN Invoice
ON Customer.customerid=Invoice.customerid;

-- 4.3 RIGHT OUTER JOIN
SELECT Artist.name, Album.title
FROM Artist
RIGHT OUTER JOIN Album
ON Artist.artistid=Album.artistid;

-- 4.4 CROSS JOIN
SELECT Artist.name, Album.title
FROM Artist
CROSS JOIN Album
WHERE Artist.artistid=Album.artistid
ORDER BY Artist.name;

-- 4.5 Self JOIN
SELECT A.employeeid, A.firstname, A.lastname, A.reportsto, B.firstname, B.lastname
FROM Employee A
JOIN Employee B
ON A.reportsto = B.employeeid;
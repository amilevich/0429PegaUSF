/*
SQL Lab
Author: Audrey Romero
*/

-- 2.1a
SELECT * FROM employee;

-- 2.1b
SELECT * FROM employee WHERE lastname = 'King';  -- Check convention before turning in

-- 2.1c
SELECT * FROM employee WHERE(firstname = 'Andrew' AND reportsto IS NULL);

-- 2.2a
SELECT * FROM album ORDER BY title DESC; -- Check convention before turning in. SORT or ORDER?

-- 2.2b
SELECT firstname FROM customer ORDER BY city;

-- 2.3a
INSERT INTO genre VALUES(26, 'Funk');
INSERT INTO genre VALUES(27, 'New Wave');

-- 2.3b
INSERT INTO employee VALUES(9, 'Will', 'Wilson', 'Team Lead', 1, '10-OCT-93', '06-MAY-15', '44 Fake St',
    'Tampa', 'FL', 'USA', '67453', '+1 (814) 222-2222', '+1 (333) 333-3333', 'will.wilson@chinookcorp.com');
    
INSERT INTO employee VALUES(10, 'Andrew', 'Bird', 'Music Curator', 2, '07-JUN-80', '22-JAN-09', '555 Break Ave',
    'Akron', 'OH', 'USA', '12345', '+1 (505) 123-4567', '+1 (505) 765-4321', 'abird@chinookcorp.com');

-- 2.3c
INSERT INTO customer VALUES(60, 'Mister', 'Mundy', 'Mann Co.', '1234 Aussie Rd',
    'Barnaby', 'BC', 'Canada', '12345', '+1 (505) 123-4567', NULL, 'mundy@mann.co', 4);
    
 INSERT INTO customer VALUES(61, 'Jason', 'Mendosa', NULL, '3636 Good Pl', 'Jacksonville', 'FL',
    'USA', '00000', '+1 (762) 987-6543', NULL, 'gojags@cablecompany.net', 3);

-- 2.4a
UPDATE customer SET firstname = 'Robert' WHERE(firstname= 'Aaron' AND lastname = 'Mitchell');
UPDATE customer SET lastname = 'Walter' WHERE(firstname= 'Robert' AND lastname = 'Mitchell');

-- 2.4b
UPDATE artist SET name = 'CCR' WHERE name = 'Creedence Clearwater Revival';

-- 2.5
SELECT * FROM invoice WHERE billingaddress LIKE 'T%';

-- 2.6a Select all invoices that have a total between 15 and 50;
-- 2.6b Select all employees hired between June 1, 2003 and March 1, 2004

-- 2.7
DELETE FROM invoiceline WHERE invoiceid=116;
DELETE FROM invoiceline WHERE invoiceid=245;
DELETE FROM invoiceline WHERE invoiceid=268;
DELETE FROM invoiceline WHERE invoiceid=290;
DELETE FROM invoiceline WHERE invoiceid=342;
DELETE FROM invoiceline WHERE invoiceid=50;
DELETE FROM invoiceline WHERE invoiceid=61;
DELETE FROM invoice WHERE customerid=32;
DELETE FROM customer WHERE(firstname = 'Robert' AND lastname = 'Walter');

-- 3.1a
CREATE OR REPLACE FUNCTION get_my_time
RETURN DATE
IS
    my_time DATE;
BEGIN
    RETURN my_time;
END;
/

-- 3.1b
CREATE OR REPLACE FUNCTION get_mediatype_length
RETURN NUMBER
IS
    mediatype_length NUMBER;
BEGIN
    SELECT LENGTH(name) INTO mediatype_length FROM mediatype;
    RETURN mediatype_length;
    END;
/

-- 3.2a
SELECT AVG(total) FROM invoice;

-- 3.2b
SELECT MAX(unitprice) FROM track;

-- 4.1
SELECT firstname, lastname, invoiceid
    FROM customer INNER JOIN invoice
    ON customer.customerid = invoice.customerid;
    
-- 4.2
SELECT customer.customerid, firstname, lastname, invoiceid, total
    FROM customer LEFT JOIN invoice
    ON customer.customerid = invoice.customerid;

-- 4.3
SELECT name, title
    FROM album RIGHT JOIN artist
    ON album.artistid = artist.artistid;

-- 4.4
SELECT * FROM artist CROSS JOIN album ORDER BY name;

-- 4.5
SELECT * FROM employee e1, employee e2 WHERE e1.reportsto = e2.reportsto;

COMMIT;
-------------------------------------------------------SQL Chinnok Homework---------------------------------------------------

--2.1 SELECT

--Task 1
SELECT * FROM Employee;

--Task 2
SELECT * FROM Employee WHERE LastName='King';

--Task 3
SELECT * FROM Employee WHERE FirstName='Andrew' AND ReportsTo IS NULL;

--2.2 ORDER BY

--Task 1
SELECT * FROM Album
ORDER BY Title DESC;

--Task 2
SELECT FirstName FROM Customer
ORDER BY City;

--2.3 INSERT INTO

--Task 1
SELECT * FROM Genre;

INSERT INTO Genre VALUES (26, 'rap');
INSERT INTO Genre VALUES (27, 'classical');

SELECT * FROM Genre;

--Task 2
SELECT * FROM Employee;

INSERT INTO Employee VALUES(9, 'Boamah', 'Kofi', 'Sales Associate', 2, TO_DATE('1972-5-10 00:00:00','yyyy-mm-dd hh24:mi:ss'), TO_DATE('2004-2-19 00:00:00','yyyy-mm-dd hh24:mi:ss'), '1055 Rundleside Drive NE', 'Calgary', 'AB', 'Canada', 'T1Y 1G1', '+1 (403) 817-2424', '+1 (403) 817-2423', 'kofi@chinookcorp.com');
INSERT INTO Employee VALUES (10, 'Quainoo', 'Dorcas', 'Sales Associate', 2, TO_DATE('1975-12-2 00:00:00','yyyy-mm-dd hh24:mi:ss'), TO_DATE('2003-9-10 00:00:00','yyyy-mm-dd hh24:mi:ss'), '166 Costa Mesa Close NE', 'Calgary', 'AB', 'Canada','TIY 6W9', '+1 (780) 561-8475', '+1 (780) 561-8578', 'dorcas@chinookcorp.com');

SELECT * FROM Employee;

--Task 3
SELECT * FROM Customer;

INSERT INTO Customer VALUES  (60, 'rondo', 'kobe', 'olajuwon', '12091 hawthorne drive', 'sanfransico', 'CA', 'USA', '22025', '+1 (703) 282-7410', '+ (692) 585-2415', 'duality@gmail.com', 5);
INSERT INTO Customer VALUES  (61, 'elon', 'federer', 'Google, Inc.', 'mozart', 'rondo', 'kobe', 'pandava', '36000', '+33-700-555-230','+33-521-621-241', 'paradox@gmail.com', 2);

SELECT * FROM Customer;

--2.4 UPDATE

--Task 1
UPDATE Customer
SET FirstName = 'Robert', LastName = 'Walter'
WHERE FirstName = 'Aaron' AND LastName = 'Mitchell';

--Task2


UPDATE Artist SET Name = 'CCR' WHERE Name = 'Creedence Clearwater Revival';

--2.5 LIKE

--Task 1
SELECT * FROM Invoice;

SELECT * FROM Invoice WHERE BillingAddress LIKE 'T%';

--2.6 BETWEEN

--Task 1
SELECT * FROM Invoice;

SELECT * FROM Invoice WHERE Total BETWEEN 15 AND 50;

--Task 2
SELECT * FROM Employee;

SELECT * FROM Employee WHERE HireDate BETWEEN TO_DATE ('2003-6-1 00:00:00', 'yyyy-mm-dd hh24:mi:ss') AND TO_DATE('2004-3-1 00:00:00', 'yyyy-mm-dd hh24:mi:ss') ;

--2.7 DELETE

--Task 1
SELECT * FROM Customer;

ALTER TABLE Invoice DROP CONSTRAINT FK_InvoiceCustomerId;

ALTER TABLE Customer DROP CONSTRAINT PK_Customer;

DELETE FROM Customer WHERE FirstName='Robert' AND LastName='Walter';

SELECT * FROM Customer;

----------------------------------------------------------------3.0--------------------------------------------------------------

--3.1 System Defined Functions

--Task 1
ALTER SESSION SET TIME_ZONE='-5:0';

ALTER SESSION SET NLS_DATE_FORMAT='yyyy-mm-dd hh24:mi:ss';

SELECT SESSIONTIMEZONE, CURRENT_TIMESTAMP FROM DUAL;

--Task 2
SELECT * FROM MediaType;

SELECT  LENGTH('MPEG audio file') "Length in characters" FROM DUAL;

--3.2 System Defined Aggregate Functions

--Task 1
SELECT * FROM Invoice;

SELECT SUM(Total) FROM Invoice;

--Task 2
SELECT UnitPrice FROM Track;

SELECT MAX(UnitPrice) "Maximum" FROM Track;

----------------------------------------------------------------4.0--------------------------------------------------------------

--4.1 INNER JOIN
SELECT Invoice.InvoiceId, Customer.FirstName, Customer.LastName
FROM Invoice
INNER JOIN Customer ON Invoice.CustomerId=Customer.CustomerId;

--4.2 OUTER JOIN
SELECT Customer.CustomerId, Customer.FirstName, Customer.LastName, Invoice.InvoiceId, Invoice.Total
FROM Customer
FULL OUTER JOIN Invoice ON Customer.CustomerId=Invoice.CustomerId;

--4.3 RIGHT JOIN
SELECT Artist.Name, Album.Title
FROM Artist
RIGHT JOIN Album ON Artist.ArtistId=Album.ArtistId;

--4.4 CROSS JOIN
SELECT Artist.Name, Album.Title
FROM Album
CROSS JOIN Artist
ORDER BY Artist.Name;

--4.5 SELF JOIN
SELECT Employee.EmployeeId, Employee.FirstName, Employee.LastName, Employee.Title, Employee.ReportsTo
FROM Employee
WHERE Employee.EmployeeId <> Employee.ReportsTo
ORDER BY Employee.EmployeeId;

COMMIT;


--2.0 SQL Queries
--2.1
SELECT * FROM Employee;
SELECT * FROM Employee WHERE LastName= 'King';
SELECT * FROM Employee WHERE FirstName = 'Andrew' AND ReportsTo IS NULL;

--2.2
SELECT * FROM ALbum ORDER BY Title DESC;
SELECT Firstname FROM Customer ORDER BY City ASC;

--2.3
INSERT INTO Genre (GenreId, Name) VALUES (26, 'abc');
INSERT INTO Genre(GenreId, Name) VALUES (27, 'abcd');

INSERT INTO Employee (EmployeeId, LastName, FirstName) VALUES(9, 'Abc', 'Xyz');
INSERT INTO Employee (EmployeeId, LastName, FirstName) VALUES (10, 'Def', 'Xyz');

INSERT INTO Customer (CustomerId, FirstName, LastName, Email) 
VALUES (60, 'Abc', 'Xyz', 'abc@email.com');
INSERT INTO Customer (CustomerId, FirstName, LastName, Email) 
VALUES (61, 'Cde', 'Xyz', 'cde@email.com');

--2.4
UPDATE Customer
SET FirtsName = 'Robert', LastName = 'Walter'
WHERE FirtsName = 'Aaron' AND FirtsName = 'Mitchell';

UPDATE Artist SET Name = 'CCR' WHERE Name = 'Creedence Clearwater Revival';

--2.5
SELECT * FROM Invoice WHERE BillingAddress LIKE 'T%';

--2.6
SELECT * FROM Invoice WHERE Total BETWEEN 15 AND 30;
SELECT * FROM Employee WHERE HireDate BETWEEN TO_DATE('2003-06-01', 'yyyy-mm-dd') AND TO_DATE('2004-03-01', 'yyyy-mm-dd');

--2.7
ALTER TABLE Invoice DROP CONSTRAINT FK_InvoiceCustomerId;
ALTER TABLE Invoice ADD CONSTRAINT FK_InvoiceCustomerId
    FOREIGN KEY (CustomerId) REFERENCES Customer (CustomerId)
    on delete cascade;
ALTER TABLE invoiceline DROP CONSTRAINT FK_InvoiceLineInvoiceId;
ALTER TABLE InvoiceLine ADD CONSTRAINT FK_InvoiceLineInvoiceId
    FOREIGN KEY (InvoiceId) 
    REFERENCES Invoice (InvoiceId) on delete cascade;
DELETE FROM Customer WHERE FirstName = 'Robert' and LastName = 'WALTER';

--3.0 SQL Functions
--3.1
create or replace function getSysdate
return date is

  l_sysdate date;

begin

  select sysdate
    into l_sysdate
    from dual;

  return l_sysdate;

end;
SELECT getSysdate() FROM dual;
/
create or replace function getlength(x in varchar2) 
return integer as z varchar(200);
begin 
    z := length(x);
    return z;
end;
/
select getlength(name) from mediatype;

--4.0 Joins
--4.1
SELECT * FROM Customer INNER JOIN Invoice ON Customer.CustomerId = Invoice.CustomerId;

--4.2
SELECT Customer.CustomerId, Customer.FirstName, Customer.LastName, Invoice.Total FROM Customer
FULL OUTER JOIN Invoice 
ON Customer.CustomerId = Invoice.CustomerId;

--4.3
SELECT Name, Title
FROM Artist RIGHT JOIN Album 
ON Artist.ArtistId = Album.ArtistId

--4.4
SELECT Name FROM Artist 
CROSS JOIN Album WHERE Artist.ArtistId = Album.ArtistId ORDER BY Artist.Name ASC;

--4.5
SELECT * FROM Employee JOIN Employee on Employee.ReportsTo = Employee.EmployeeId;



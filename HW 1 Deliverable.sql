SELECT * FROM Employee
WHERE LastName='King';

SELECT * FROM Employee
WHERE (FirstName='Andrew') AND (ReportsTo IS NULL);

SELECT * FROM Customer
ORDER BY LastName DESC;

SELECT * FROM Employee;
ORDER BY City ASC;

INSERT INTO Genre (GenreId, Name) VALUES (30, 'Meditation');
INSERT INTO Genre (GenreId, Name) VALUES (31, 'Christian');

INSERT INTO Employee (EmployeeId, LastName, FirstName, Title, ReportsTo, BirthDate, HireDate, Address, City, State, Country, PostalCode, Phone, Fax, Email) VALUES (21, 'McLaughlin', 'Mike', 'Bossy Overloard', 1, TO_DATE('1992-5-2 00:00:00','yyyy-mm-dd hh24:mi:ss'), TO_DATE('2003-10-17 00:00:00','yyyy-mm-dd hh24:mi:ss'), '123 Main Street', 'Pittsburgh', 'PA', 'USA', 'T3B 0C5', '+1 (412) 799-0801', null, 'MikeyMac@chinookcorp.com');
INSERT INTO Employee (EmployeeId, LastName, FirstName, Title, ReportsTo, BirthDate, HireDate, Address, City, State, Country, PostalCode, Phone, Fax, Email) VALUES (22, 'Butts', 'Seymour', 'Bossy Overlord', 1, TO_DATE('1992-2-5 00:00:00','yyyy-mm-dd hh24:mi:ss'), TO_DATE('2003-10-17 00:00:00','yyyy-mm-dd hh24:mi:ss'), '122 Main Street', 'Pittsburgh', 'PA', 'USA', 'T3B 0C5', '+1 (412) 855-9511', null, 'seymourbutts@chinookcorp.com');

INSERT INTO Customer (CustomerId, FirstName, LastName, Company, Address, City, State, Country, PostalCode, Phone, Fax, Email, SupportRepId) VALUES (300, 'David', 'McCullough', 'Author', '165 E Prospect Ave', 'State College', 'PA', 'Brazil', '16801-000', '(412) 123-4567', null, 'DmcC@embraer.com.br', 3);
INSERT INTO Customer (CustomerId, FirstName, LastName, Company, Address, City, State, Country, PostalCode, Phone, Fax, Email, SupportRepId) VALUES (301, 'JK', 'Rowling', 'Author', '123 Davidson Street', 'Pittsburgh', 'PA', 'Brazil', '15215-000', '+55 (814) 987-6543', null, 'jkrowling@embraer.com.br', 3);

SELECT * FROM Invoice
WHERE Total BETWEEN 15 AND 150;

SELECT * FROM Employee
WHERE HireDate BETWEEN TO_DATE('2003-06-01 00:00:00','yyyy-mm-dd hh24:mi:ss') AND TO_DATE('2004-03-01 00:00:00','yyyy-mm-dd hh24:mi:ss');

DELETE FROM Employee
WHERE FirstName='Robert' AND LastName='Walter';


SELECT CURRENT_DATE FROM dual;

SELECT * FROM MediaType;
SELECT  LENGTH('MPEG audio file') "Length" FROM DUAL;

SELECT * FROM Invoice;
SELECT AVG(Total) FROM Invoice;

SELECT * FROM Track;
SELECT MAX(UnitPrice) FROM Track;

SELECT Invoice.InvoiceId, Customer.FirstName, Customer.LastName FROM Invoice
INNER JOIN Customer ON Invoice.CustomerId=Customer.CustomerId;

SELECT Customer.CustomerId, Customer.FirstName, Customer.LastName, Invoice.InvoiceId, Invoice.Total FROM Customer
FULL OUTER JOIN Invoice ON Customer.CustomerId=Invoice.CustomerId;

SELECT Artist.Name, Album.Title FROM Artist
RIGHT JOIN Album ON Artist.ArtistId=Album.ArtistId;

SELECT Artist.Name, Album.TitleFROM Album
CROSS JOIN Artist 
ORDER BY Artist.Name;

SELECT Employee.EmployeeId, Employee.FirstName, Employee.LastName, Employee.Title, Employee.ReportsTo FROM Employee
WHERE Employee.EmployeeId <> Employee.ReportsTo
ORDER BY Employee.EmployeeId;
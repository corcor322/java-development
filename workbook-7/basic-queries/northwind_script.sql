-- Question 1:
-- products

-- Question 2:
SELECT ProductID, ProductName, UnitPrice
FROM products;

-- Question 3:
SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice;

-- Question 4:
SELECT *
FROM Products
WHERE UnitPrice <= 7.50;

-- Geitost, Guaran Fantastica, Konbu, Filo Mix, Tourtire

-- Question 5:
SELECT *
FROM products
WHERE UnitInStock >= 100
ORDER BY UnitPrice DESC;

-- Sirop d'rable, Grandma's Boysenberry Spread, Pt chinois, Gustaf's Knckebrd, Inlagd Sill,
-- Boston Crab Meat, Rd Kaviar, Sasquatch Ale, Rhnbru Klosterbier, Geitost

-- Question 6:
-- Same, ProductName;

-- Question 7:
SELECT ProductName, UnitsInStock, UnitsOnOrder, UnitPrice
 FROM northwind.products
 WHERE UnitsInStock = 0
 AND UnitsOnOrder >= 1
 ORDER BY UnitPrice DESC, ProductName;
 
 -- Gorgonzola Telino
 
 -- Question 8:
 -- categories
 
 -- Question 9:
 SELECT * FROM northwind.categories;
 -- 8
 
 -- Question 10:
 -- From Categories ID foreign key
 SELECT * FROM northwind.products
WHERE CategoryID = 8;

-- Ikura, Konbu, Carnarvon Tigers, Nord-Ost Matjeshering, Inlagd Sill, 
-- Gravad lax, Boston Crab Meat, Jack's New England Clam Chowder
-- Rogede sild, Spegesild, Escargots de Bourgogne, Rd Kaviar

-- Question 11:
SELECT LastName, FirstName
FROM northwind.employees;

-- Davolio	Nancy, Fuller	Andrew, Leverling	Janet, Peacock	Margaret, Buchanan	Steven
-- Suyama	Michael, King	Robert, Callahan	Laura, Dodsworth	Anne

-- Question 12:
SELECT *
FROM Employees
WHERE Title LIKE "%Manager%";

-- Steven Buchanan -Sales Manager

-- Question 13:
SELECT DISTINCT Title
FROM Employees;

-- Sales Representative, Vice President Sales, Sales Manager, Inside Sales Coordinator

-- Question 14:

-- Question 15:

-- Question 16:
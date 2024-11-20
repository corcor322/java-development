-- Q 1:
SELECT COUNT(SupplierID)
FROM northwind.suppliers;

-- 29

-- Q 2:
SELECT SUM(Salary)
FROM northwind.employees;

-- 20362.929931640625

-- Q 3:
SELECT MIN(UnitPrice)
FROM northwind.products;

-- 2.5000

-- Q 4:
SELECT avg(UnitPrice)
FROM northwind.products;

-- 28.86636364

-- Q 5:
SELECT MAX(UnitPrice)
FROM northwind.products;

-- 263.50

-- Q 6:
SELECT SupplierID, COUNT(*) AS ItemCount
FROM products
GROUP BY SupplierID;

-- DID NOT FINISH BEFORE REVIEW

-- Q 7:
SELECT CategoryID, AVG(UnitPrice) 
FROM northwind.products
GROUP BY CategoryID;

-- 1	37.97916667
-- 2	23.06250000
-- 3	25.16000000
-- 4	28.73000000
-- 5	20.25000000
-- 6	54.00666667
-- 7	32.37000000
-- 8	20.68250000

-- Q 8:
SELECT SupplierID, COUNT(*) ItemCount 
FROM northwind.products
GROUP BY SupplierID
HAVING COUNT(UnitsInStock) >=5;

-- 7	5
-- 12	5

-- Q 9:
SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS InventoryValue
FROM Products
ORDER BY InventoryValue DESC, ProductName;

-- DID NOT FINISH BEFORE REVIEW
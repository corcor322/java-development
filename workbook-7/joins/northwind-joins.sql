-- Q1:
SELECT ProductID, ProductName, UnitPrice, CategoryName
FROM products
JOIN categories
	ON products.CategoryID = categories.CategoryID
    ORDER BY CategoryName, ProductName;

-- Q2:
SELECT ProductID, ProductName, UnitPrice, CompanyName
FROM products
JOIN suppliers
	ON products.SupplierID = suppliers.SupplierID
    WHERE UnitPrice > 75
    ORDER BY ProductName;


-- Q3:
SELECT ProductID, ProductName, UnitPrice, CategoryName, CompanyName
FROM products
JOIN categories
	ON products.CategoryID = categories.CategoryID
JOIN suppliers
	ON products.SupplierID = suppliers.SupplierID
ORDER BY ProductName;

-- Q4:
SELECT ProductName, CategoryName
FROM products
JOIN categories
	ON products.CategoryID = categories.CategoryID
    WHERE UnitPrice = (SELECT MAX(UnitPrice)
						FROM products);

-- Q5:
SELECT OrderID, ShipName, ShipAddress, CompanyName AS ShippingCompany
FROM orders
JOIN shippers
	ON orders.ShipVia = shippers.ShipperID
    WHERE orders.ShipCountry = 'Germany';
    
-- Q6:
SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
FROM Orders o
JOIN `Order Details` od ON o.OrderID = od.OrderID
JOIN Products p ON od.ProductID = p.ProductID
WHERE p.ProductName = 'Sasquatch Ale';
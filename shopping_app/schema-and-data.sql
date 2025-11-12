-- Create database (run in MySQL Workbench if not already created)
CREATE DATABASE IF NOT EXISTS shopping_app;
USE shopping_app;

-- Category table
CREATE TABLE IF NOT EXISTS category (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL UNIQUE
);

-- Product table
CREATE TABLE IF NOT EXISTS product (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(200) NOT NULL,
  category VARCHAR(100) NOT NULL,
  price DOUBLE NOT NULL,
  total_items INT NOT NULL
);

-- Sample categories
INSERT INTO category (name) VALUES
('Food'), ('Mobiles'), ('Electronics'), ('Stationery')
ON DUPLICATE KEY UPDATE name = name;

-- Sample products (ID, Name, Category, Price, Total Items)
INSERT INTO product (name, category, price, total_items) VALUES
('Cake', 'Food', 200, 10),
('Phone', 'Mobiles', 20000, 100),
('Laptop', 'Electronics', 400000, 20),
('Book', 'Stationery', 50, 3);

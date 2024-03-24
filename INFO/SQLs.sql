
-- БАЗА ДАНИХ
-- Можливість створення БД з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Можемо створити БД через візуальний інструмент, наприклад,
-- MySQL Workbench.
CREATE DATABASE contacts_web_new_db;

USE contacts_web_new_db;


-- ТАБЛИЦІ
-- Можливість створення таблиць БД, з метою уникнення некваліфікованих
-- дій, краще залишити за розробником.
-- Тому такий функціонал у додатку не прописуємо.
-- Попередньо, необхідно спроектувати таблиці та їх зв'язки,
-- на основі сутностей реального світу.
-- Можемо створити таблиці БД через візуальний інструмент, наприклад,
-- MySQL Workbench.


CREATE TABLE IF NOT EXISTS contacts
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	contacts (image, first_name, last_name, phone)
VALUES
	('Portrait1.jpg', 'John', 'Smith', '+1 (123) 456-7890'),
    ('Portrait2.jpg', 'Emily', 'Johnson', '+1 (234) 567-8901'),
    ('Portrait3.jpg', 'Michael', 'Williams', '+1 (345) 678-9012'),
    ('Portrait4.jpg', 'Jessica', 'Brown', '+1 (456) 789-0123'),
    ('Portrait5.jpg', 'Christopher', 'Jones', '+1 (567) 890-1234'),
    ('Portrait6.jpg', 'Sarah', 'Davis', '+1 (678) 901-2345');



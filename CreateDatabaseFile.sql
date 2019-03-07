--
-- File generated with SQLiteStudio v3.2.1 on Thu Mar 7 22:19:26 2019
--
-- Text encoding used: UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Users
DROP TABLE IF EXISTS Users;
CREATE TABLE Users (id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE, username VARCHAR, password VARCHAR, division VARCHAR);
INSERT INTO Users (id, username, password, division) VALUES (1, 'ad', '1', 'Admin');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;

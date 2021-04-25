DROP DATABASE IF EXISTS remissiontypeservice ;
DROP USER IF EXISTS `remission_type_service`@`%`;
CREATE DATABASE IF NOT EXISTS remissiontypeservice CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `remission_type_service`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `remissiontypeservice`.* TO `remission_type_service`@`%`;
FLUSH PRIVILEGES;
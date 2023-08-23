DROP DATABASE IF EXISTS core_banking_microservice_db;
DROP user IF EXISTS 'banking'@localhost;
create database IF NOT EXISTS core_banking_microservice_db;
create user IF NOT EXISTS banking@localhost identified by '123654';
grant all privileges on core_banking_microservice_db.* To banking@localhost;
DROP TABLE IF EXISTS USER;
COMMIT;

CREATE TABLE USER(
  ID bigint auto_increment PRIMARY KEY,
  NAME VARCHAR(255),
  PHONE_NUMBER VARCHAR(255),
  EMAIL VARCHAR(255));

INSERT INTO USER VALUES(1, 'Leyla','111-11-11', 'test1@gmail.com');
INSERT INTO USER VALUES(2, 'Emil','222-22-22', 'test2@gmail.com');
COMMIT;
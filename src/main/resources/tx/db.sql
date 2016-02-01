SET SCHEMA PUBLIC;
CREATE TABLE account (
  acct_id     IDENTITY,
  first_name  VARCHAR (25)  not null,
  last_name   VARCHAR (25)  not null,
  dob         VARCHAR (8)   null,
  ssn         VARCHAR (10)  null
);

GRANT ALL ON account TO PUBLIC ;

INSERT INTO account (first_name, last_name, dob, ssn)
VALUES
('Situ', 'Ma', '19840909', '1234567890'),
('Yanwen', 'Chen', '19850318', '0987654321');
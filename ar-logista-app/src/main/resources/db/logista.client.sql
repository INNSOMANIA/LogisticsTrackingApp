CREATE TABLE CLIENT
(
    ID      SERIAL PRIMARY KEY,
    COMPANY VARCHAR(75),
    ADDRESS VARCHAR(75),
    EMAIL   VARCHAR(100),
    PHONE   NUMERIC,
    TAX     VARCHAR(20)

);

CREATE
    INDEX IDX_CLIENT_FBI ON CLIENT (ID);

INSERT INTO CLIENT (ID, COMPANY, ADDRESS, EMAIL, PHONE, TAX)
VALUES (1, 'ALFA', 'RUSSIA / KAZAN', 'alfaltd@outlook.com',
        1212121212, '1234556788764');
COMMIT;
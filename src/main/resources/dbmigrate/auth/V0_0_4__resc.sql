

-------------------------------------------------------------------------------
--  resource
-------------------------------------------------------------------------------
CREATE TABLE AUTH_RESC(
        ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
        NAME VARCHAR(50),
        DESCN VARCHAR(200),
	SCOPE_ID VARCHAR(50),
        CONSTRAINT PK_AUTH_RESC PRIMARY KEY(ID)
);

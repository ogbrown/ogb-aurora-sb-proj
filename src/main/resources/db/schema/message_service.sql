CREATE TABLE message (
    id UUID NOT NULL PRIMARY KEY,
    content VARCHAR(255),
    sender VARCHAR(255),
    timestamp TIMESTAMP NOT NULL
);
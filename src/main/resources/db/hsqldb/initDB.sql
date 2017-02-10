DROP TABLE categories IF EXISTS;

CREATE TABLE categories (
  id         INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30),
  created_at DATE,
  updated_at DATE
);
CREATE INDEX categories_name ON categories (name);

CREATE TABLE IF NOT EXISTS Author(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age int
    );


CREATE TABLE IF NOT EXISTS Book(
    name VARCHAR(255),
    year_of_print int,
    author_id int REFERENCES Author (id)
    );

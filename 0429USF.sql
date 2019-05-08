CREATE TABLE animals (
  animal_id NUMBER(6) PRIMARY KEY,
  animal_name VARCHAR2(100) UNIQUE,
  animal_leg_count NUMBER(3) CHECK (animal_leg_count > 1) NOT NULL
  );
  
CREATE TABLE food (
  food_id NUMBER(6) PRIMARY KEY,
  food_name VARCHAR2(50) NOT NULL,
  food_calories NUMBER(10),
  animal_id NUMBER(10),
  CONSTRAINT animal_id_fk FOREIGN KEY (animal_id) REFERENCES animals (animal_id)
  );
  
  DROP TABLE food;
  
  
  select * from animals;
  select * from food;
  
  INSERT INTO animals VALUES(1, 'Jonny', 20);
  INSERT INTO animals VALUES(2, 'Ruth', 3);
  INSERT INTO animals VALUES(3, 'Bojack', 4);
  INSERT INTO food VALUES(1, 'grapes', 74, 2);
  INSERT INTO food VALUES(2, 'steak', 150, 3);
  
  -- WHERE clause
  /*
   use a WHERE clause to apply any conditions to a CRUD operation
  */
  
  SELECT * FROM animals WHERE animal_id>1;
  DELETE FROM animals WHERE animal_id=1;
  
  /*
  REFERENTIAL INTEGRITY 
  the enforcement of foreign key relations. It prevents a user from inserting
  a record into a table with a foreign key that points to a non existent element.
  It also prevents a user from deleting a record that another table is referencing. 
  This is all to prevent orphan records, i.e. a record without a parent.
  */
  
  --UPDATE
  -- used to change the data inside records
  UPDATE animals SET animal_name = 'The Older Bojack' WHERE animal_id=3;
  select * from animals;
  
  --ALTER
  CREATE TABLE numbers(
    stuffs NUMBER(9)
    );
    
    INSERT INTO numbers VALUES(1);
    INSERT INTO numbers VALUES(2);
    INSERT INTO numbers VALUES(3);
    
    SELECT * FROM awesome_numbers;
    
    ALTER TABLE numbers RENAME TO awesome_numbers;
    ALTER TABLE awesome_numbers ADD CONSTRAINT check_num CHECK (stuffs>0);
    ALTER TABLE awesome_numbers DROP CONSTRAINT check_num;
    
    DELETE FROM food WHERE food_id=1;
    rollback;
    select * from food;
    
    savepoint;
    commit;
    
    select * from animals;
    
    TRUNCATE TABLE food;
    
    
    CREATE TABLE employees(
        e_id NUMBER(6) PRIMARY KEY,
        e_name VARCHAR2(100) NOT NULL,
        e_salary NUMBER(9),
        e_title VARCHAR2(100)
    );
    
    INSERT INTO employees VALUES(1, 'Tim', 5000, 'revature employee');
    INSERT INTO employees VALUES(2, 'Tom', 90000, 'supervisor');
        INSERT INTO employees VALUES(7, 'Jerry', 90000, 'supervisor');
    INSERT INTO employees VALUES(3, 'Samh', 80000, 'system analyst');
    INSERT INTO employees VALUES(4, 'Bill', 40000, 'HR coordinator');
    INSERT INTO employees VALUES(5, 'Cory', 17512, 'janitor');
    INSERT INTO employees VALUES(6, 'Alex', 6000, 'revature employee');

select * from employees;

/*
AGGREGATE FUNCTIONS
- functions that you apply to a column that will process all the data and return a single value back
Example:
SUM(), AVG(), MAX(), MIN(), COUNT()
*/
--this is a single line comment    
    SELECT COUNT(*) FROM employees;
    
    SELECT SUM(e_salary) FROM employees;
    
    -- In order to show multiple columns of data alongside an aggregate function, we need
    -- to tell how we are going to group non matching data
    SELECT SUM(e_salary), e_title FROM employees GROUP BY e_title --> groups the results by title,
                                                                                                                                        -- no individual records
    ORDER BY SUM(e_salary); --> ascending by default, DESC for descending order
  
  /*
  SCALAR FUNCTIONS
  - a function that applies to each cell of a column. i.e. alters the value within each cell of a column
  Example:
  LOWER() -- make a string lowercase
  UPPER()
  ABS() -- absolute value
  ROUND() -- rounds to the nearest whole number
  CONCAT()
  LENGTH()
  TRIM()
  */
  SELECT UPPER(e_name), LOWER(e_title) FROM employees;
  
  /*
  HAVING
  - having is a conditional that can be applied to aggregate data.
  
  if GROUP BY is NOT used, 'HAVING' behaves like 'WHERE'
  */
  SELECT SUM(e_salary), UPPER(e_title) FROM employees 
  WHERE e_salary > 8000 
  GROUP BY e_title
  HAVING SUM(e_salary) > 50000
  ORDER BY e_title;
  
  /*
  LIKE
  - we use the LIKE clause to search for data that matches a sort of regular expression criteria.
  There are two wildcards that you can use:
  _ -> ONE of any character
  % -> zero-many of any character
  */
  SELECT * FROM employees WHERE LOWER(e_name) LIKE 't%';
  -- all names that start with 't', not case sensitive because of LOWER
  SELECT * FROM employees WHERE LOWER(e_name) LIKE 'j%r_';
  -- all names that start with 'j', have a letter 'r' appear sometime after 'j' and have only one letter after 'r'
  SELECT * FROM employees WHERE LOWER(e_name) LIKE '%o%';
  
  
  
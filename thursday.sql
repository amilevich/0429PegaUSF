/*
PL/SQL - Procedural Language/Structured Query Language
It is an extenstion of Oracle
-- functions, stored procedures, sequences, triggers, cursors
-- exception handling
In other words, it provides a means to write actual code in SQL
*/

-- SEQUENCE
-- an object that will maintain a counter for you

CREATE SEQUENCE emp_seq
    START WITH 150
    INCREMENT BY 1;
/
-- This sequence can be used to handle the id field for employees. 
-- In order to actually utilize it, we will need to build something that 
-- reacts to situations where an employee is inserted.

-- TRIGGER
-- An object that we can create that waits for actions to occur based on a specific table 
-- the trigger was made for.
CREATE TRIGGER emp_seq_trigger 
BEFORE INSERT ON employees                  --> BEFORE or AFTER
BEGIN 
        IF :new.e_id IS NULL THEN
        SELECT emp_seq.nextval INTO :new.e_id FROM dual;
        END IF;
END;
/

-- STORED PROCEDURES
-- A named transaction that can be invoked when called (method in Java).
CREATE PROCEDURE hello_world_procedure
IS
BEGIN
        DBMS_OUTPUT.PUT_LINE('Hello World, yo');
END;
/

BEGIN
        hello_world_procedure();
END;
/

/*
IN parameters - whatever is passed as input during the procedure call
OUT parameters - whatever is returned from the procedure
IN OUT parameters - a variable that is used as input then transformed as output

--syntax
varname IN/OUT/IN OUT DATATYPE
*/

-- USER DEFINED FUNCTIONS
/*
    return something ONE and ONLY ONE resource.
    A function can only use IN parameters
    A function can only utilize DQL (stored procedure can use both DML and DQL)
*/

select * from employees;

    INSERT INTO employees VALUES(1, 'Tim', 5000, 'revature employee');
    INSERT INTO employees VALUES(2, 'Tom', 90000, 'supervisor');
    INSERT INTO employees VALUES(7, 'Jerry', 90000, 'supervisor');
    INSERT INTO employees VALUES(3, 'Samh', 80000, 'system analyst');
    INSERT INTO employees VALUES(4, 'Bill', 40000, 'HR coordinator');
    INSERT INTO employees VALUES(5, 'Cory', 17512, 'janitor');
    INSERT INTO employees VALUES(6, 'Alex', 6000, 'revature employee');
    commit;

CREATE OR REPLACE FUNCTION get_max_id   --> "or replace" if this already exists
                                                                                                        -- do it anyway
RETURN NUMBER            
IS
        max_id NUMBER(6);  -- size is not required
BEGIN
        SELECT MAX(e_id) INTO max_id FROM employees;
        RETURN max_id;
END;
/

DECLARE
        max_id NUMBER;
BEGIN 
        max_id := get_max_id();
        DBMS_OUTPUT.PUT_LINE('Maximum employee id: ' || max_id);
END;
/




/****************************************************
creating tables and primary keys
*****************************************************/

CREATE TABLE ers_reimbursement_status (
    reimb_status_id NUMBER NOT NULL,
    reimb_status VARCHAR2(10) NOT NULL,
    
    CONSTRAINT ers_reimbursement_status PRIMARY KEY (reimb_status_id)
);
    
CREATE TABLE ers_reimbursement_type (
    reimb_type_id NUMBER NOT NULL,
    reimb_type VARCHAR2(10),
    

    CONSTRAINT ers_reimbursement_type PRIMARY KEY (reimb_type_id)
);

CREATE TABLE ers_user_roles(
    ers_user_role_id NUMBER NOT NULL,
    user_role VARCHAR2(10) NOT NULL,
    
    CONSTRAINT ers_user_roles PRIMARY KEY (ers_user_role_id)
);

CREATE TABLE ers_user (
    ers_user_id NUMBER NOT NULL,
    ers_username VARCHAR(50) NOT NULL,
    ers_password VARCHAR(50) NOT NULL,
    user_first_name VARCHAR2(100) NOT NULL,
    user_last_name VARCHAR2(100) NOT NULL,
    user_email VARCHAR2(150) NOT NULL,
    user_role_id NUMBER NOT NULL,
    
    CONSTRAINT ers_user PRIMARY KEY (ers_user_id)
);

CREATE TABLE ers_reimbursement(
    reimb_id NUMBER NOT NULL,
    reimb_amount NUMBER NOT NULL,
    reimb_submitted TIMESTAMP NOT NULL,
    reimb_resolved TIMESTAMP,
    reimb_description VARCHAR2(250),
    reimb_receipt BLOB,
    reimb_author NUMBER NOT NULL,
    reimb_resolver NUMBER,
    reimb_status_id NUMBER NOT NULL,
    reimb_type_id NUMBER NOT NULL,
    
    CONSTRAINT ers_reimbursement PRIMARY KEY (reimb_id)
);

/*******************************************************************************
   Create foreign and unique keys
********************************************************************************/
--ers_reimbursement
ALTER TABLE ers_reimbursement ADD CONSTRAINT ers_user_fk_auth
  FOREIGN KEY (reimb_author) REFERENCES ers_user (ers_user_id)
  ON DELETE CASCADE;
  
ALTER TABLE ers_reimbursement ADD CONSTRAINT ers_user_fk_reslvr
  FOREIGN KEY (reimb_resolver) REFERENCES ers_user (ers_user_id)
  ON DELETE CASCADE;
  
ALTER TABLE ers_reimbursement ADD CONSTRAINT ers_reimbursement_status_fk
  FOREIGN KEY (reimb_status_id) REFERENCES ers_reimbursement_status (reimb_status_id)
  ON DELETE CASCADE;
  
ALTER TABLE ers_reimbursement ADD CONSTRAINT ers_reimbursement_type_fk
  FOREIGN KEY (reimb_type_id) REFERENCES ers_reimbursement_type (reimb_type_id)
  ON DELETE CASCADE;
  
  
    
--ers_user
ALTER TABLE ers_user ADD CONSTRAINT ers_username_unique UNIQUE (ers_username);

ALTER TABLE ers_user ADD CONSTRAINT user_email_unique UNIQUE (user_email);

ALTER TABLE ers_user ADD CONSTRAINT user_roles_fk
  FOREIGN KEY (user_role_id) REFERENCES ers_user_roles (ers_user_role_id)
  ON DELETE CASCADE;
  
  
  create sequence reimbursement_seq 
	start with 1
	increment by 1;
    
    
    --triggers 
    --1. change the PK to sequence value
    CREATE OR REPLACE TRIGGER reimbursement_trigger 
BEFORE INSERT ON ers_reimbursement
FOR EACH ROW
BEGIN 
        IF :new.reimb_id IS NULL THEN
        SELECT reimbursement_seq.nextval INTO :new.reimb_id FROM dual;
        END IF;
END;
/
    
    /****************************************
    insert test data
    *****************************************/
    
insert into ers_user_roles values(1,'Admin');
insert into ers_user_roles values(2,'Employee');



insert into ers_reimbursement_type values(1,'Housing');
insert into ers_reimbursement_type values(2,'Travel');
insert into ers_reimbursement_type values(3,'Food');
insert into ers_reimbursement_type values(4,'Misc');


insert into ers_reimbursement_status values(1,'Approved');
insert into ers_reimbursement_status values(2,'Denied');
insert into ers_reimbursement_status values(3,'Pending');
    

insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (1, 'jmoreno0', 'scK1ujbf7Hu8', 'Jimmy', 'Moreno', 'jmoreno0@ihg.com', 1);
insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (2, 'jlawson1', '2VaqcQ', 'Joyce', 'Lawson', 'jlawson1@icq.com', 2);
insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (3, 'eweaver2', 'ioEwxNm8C', 'Earl', 'Weaver', 'eweaver2@yellowpages.com', 2);
insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (4, 'rperez3', 'k3sjZe', 'Russell', 'Perez', 'rperez3@weebly.com', 1);
insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (5, 'lrobinson4', '7BuwMn8X', 'Louis', 'Robinson', 'lrobinson4@reddit.com', 2);
insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (6, 'jrivera5', 'GobV8IW', 'Jane', 'Rivera', 'jrivera5@t-online.de', 1);
insert into ers_user (ers_user_id, ers_username, ers_password, user_first_name, user_last_name, user_email, user_role_id) values (7, 'pweaver6', '9njtfW2uDqBE', 'Patricia', 'Weaver', 'pweaver6@stumbleupon.com', 1);


insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (1, '496.33', TIMESTAMP '2015-11-23 20:54:09', TIMESTAMP '2017-05-20 12:30:15', 'Exclusive 5th generation info-mediaries', 5, 2, 1);
insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (2, '153.60', TIMESTAMP '2015-11-14 10:32:50', 'Horizontal tertiary solution', 3, 3, 4);
insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (3, '123.13', TIMESTAMP '2015-04-24 08:28:49', 'Programmable next generation conglomeration', 2, 3, 2);
insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (4, '73.33', TIMESTAMP '2015-03-31 23:35:52', TIMESTAMP '2017-05-20 12:30:22', 'Function-based foreground flexibility', 3, 1, 4);
insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (5, '192.01', TIMESTAMP '2016-09-13 16:19:09', TIMESTAMP '2017-05-20 12:30:28', 'User-friendly holistic initiative', 2, 1, 3);
insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (6, '868.61', TIMESTAMP '2016-08-12 21:12:03', TIMESTAMP '2017-05-20 12:30:35', 'Configurable demand-driven firmware', 3, 2, 2);
insert into ers_reimbursement (reimb_id, reimb_amount, reimb_submitted, reimb_description, reimb_author, reimb_status_id, reimb_type_id) values (7, '196.73', TIMESTAMP '2015-12-21 07:58:19', 'Ergonomic 3rd generation architecture', 5, 3, 1);


commit;


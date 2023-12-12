CREATE DATABASE IF NOT EXISTS employees CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin;

USE employees;

CREATE TABLE employees (
	emp_no 		INT(11) 		NOT NULL,
    birth_date 	DATE 			NOT NULL,
    first_name 	VARCHAR(14) 	NOT NULL,
    last_name 	VARCHAR(16) 	NOT NULL,
    gender 		ENUM('M', 'F') 	NOT NULL,
    hire_date 	DATE,
    
    PRIMARY KEY (emp_no)
);

CREATE TABLE departments (
	dept_no 	CHAR(4) 		NOT NULL,
    dept_name 	VARCHAR(40) 	NOT NULL,
    
    PRIMARY KEY (dept_no)
);

CREATE TABLE dept_emp (
	emp_no 		INT(11) 		NOT NULL,
    dept_no 	CHAR(4) 		NOT NULL,
    from_date 	DATE 			NOT NULL,
    to_date 	DATE 			NOT NULL,
    
    FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,
    PRIMARY KEY (emp_no, dept_no)
);

CREATE TABLE dept_manager (
	dept_no 	CHAR(4) 		NOT NULL,
    emp_no 		INT(11) 		NOT NULL,
    from_date 	DATE 			NOT NULL,
    to_date 	DATE 			NOT NULL,
	
    FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,
    PRIMARY KEY (emp_no, dept_no)
);

CREATE TABLE salaries (
	emp_no 		INT(11) 		NOT NULL,
    salary 		INT(11) 		NOT NULL,
    from_date 	DATE 			NOT NULL,
    to_date 	DATE 			NOT NULL,
    
    FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    PRIMARY KEY(emp_no)
);

CREATE TABLE titles (
	emp_no 		INT(11) 		NOT NULL,
    title 		VARCHAR(50) 	NOT NULL,
    from_date 	DATE 			NOT NULL,
    to_date 	DATE 			NOT NULL,
    
    FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    PRIMARY KEY(emp_no)
);
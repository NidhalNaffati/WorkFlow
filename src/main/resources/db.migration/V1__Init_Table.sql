/*CREATE TABLE employee
(
    employee_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(32)             NOT NULL,
    position    VARCHAR(32)             NOT NULL,
    age         INT                     NOT NULL,
    salary      INT                     NOT NULL,
    start_date  DATE                    NOT NULL,
    address     VARCHAR(32)             NOT NULL,
    gender      ENUM ('MALE', 'FEMALE') NOT NULL
);*/

INSERT INTO WorkFlowDB.employee (name, position, age, salary, start_date, address, employee.gender)
VALUES ('John Doe', 'Manager', 35, 90000, '2022-01-01', '1 Main St, Anytown USA', 1),
       ('Jane Doe', 'Developer', 28, 80000, '2022-02-01', '2 Main St, Anytown USA', 0),
       ('Jim Smith', 'Salesperson', 42, 75000, '2022-03-01', '3 Main St, Anytown USA', 1),
       ('Emily Lee', 'Product Manager', 32, 85000, '2022-04-01', '4 Main St, Anytown USA', 1),
       ('David Kim', 'Support Engineer', 39, 70000, '2022-05-01', '5 Main St, Anytown USA',1),
       ('Katie Johnson', 'Marketing Manager', 27, 80000, '2022-06-01', '6 Main St, Anytown USA',1),
       ('Michael Brown', 'Designer', 45, 75000, '2022-07-01', '7 Main St, Anytown USA', 1),
       ('Sarah Davis', 'Content Writer', 29, 65000, '2022-08-01', '8 Main St, Anytown USA', 1),
       ('James Wilson', 'Data Analyst', 40, 80000, '2022-09-01', '9 Main St, Anytown USA', 1),
       ('Emily Clark', 'Product Manager', 34, 90000, '2022-10-01', '10 Main St, Anytown USA', 1);

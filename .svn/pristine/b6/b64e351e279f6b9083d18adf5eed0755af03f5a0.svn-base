# --- !Ups

--data needed to start application

------------------------users data------------------------

INSERT INTO users (user_id, last_name, first_name, middle_name, login, password, post)
VALUES ('1', 'Адмін', 'Адмін', 'Адмін', 'admin', 'admin', 'Адміністратор');

INSERT INTO users (user_id, last_name, first_name, middle_name, login, password, post)
VALUES ('2', 'User','Лікар', 'Лікар', 'user', 'user', 'Лікар');

ALTER SEQUENCE users_sequence START 3;
ALTER SEQUENCE users_sequence RESTART;

------------------------role data------------------------

INSERT INTO role (role_id, role_name) VALUES ('1', 'ADMIN');

INSERT INTO role (role_id, role_name) VALUES ('2', 'DOCTOR');

INSERT INTO role (role_id, role_name) VALUES ('3', 'USER');

ALTER SEQUENCE role_sequence START 4;
ALTER SEQUENCE role_sequence RESTART;


------------------------users_role data------------------------

INSERT INTO users_role (user_id, role_id) VALUES ('1', '1');
INSERT INTO users_role (user_id, role_id) VALUES ('2', '3');


# --- !Downs

--drop data needed to start application

------------------------users_role data------------------------

DELETE FROM users_role WHERE user_id = '1' AND role_id = '1';

DELETE FROM users_role WHERE user_id = '2' AND role_id = '3';

------------------------role data------------------------

DELETE FROM role WHERE role_id BETWEEN '1' AND '3';

------------------------users data------------------------

DELETE FROM users WHERE user_id BETWEEN '1' AND '2';

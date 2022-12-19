create TABLE users(
email VARCHAR2(128),
password VARCHAR2(128),
role VARCHAR2(128),
username VARCHAR2(128),
user_id number,
primary key(user_id)
);

SELECT * from users;
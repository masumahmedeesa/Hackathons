use id9331775_microinlo;



CREATE TABLE users(
	user_mobile VARCHAR(11) NOT NULL PRIMARY KEY,
	user_password VARCHAR(300) NOT NULL
);


CREATE TABLE customers (
	user_name VARCHAR(100) NOT NULL,
	user_motherName VARCHAR(100) DEFAULT NULL,
	user_fatherName VARCHAR(100) DEFAULT NULL,
	user_dateBirth date DEFAULT NULL,
	user_nid VARCHAR(30) NOT NULL,
	UNIQUE KEY user_nid (user_nid),
	user_parmanentAddress VARCHAR(500) DEFAULT NULL,
	user_bloddGroup VARCHAR(4) DEFAULT NULL,
	user_mobile VARCHAR(11) NOT NULL,
	FOREIGN KEY(user_mobile) REFERENCES users(user_mobile)
);


CREATE TABLE investment (
	user_mobile VARCHAR(11) NOT NULL,
	FOREIGN KEY(user_mobile) REFERENCES users(user_mobile),
	invest_transaction VARCHAR(30) NOT NULL,
	UNIQUE KEY invest_transaction (invest_transaction),
	invest_amount MEDIUMINT UNSIGNED NOT NULL,
	invest_date DATE NOT NULL,
	invest_time TIME NOT NULL
);

CREATE TABLE loan (
	user_mobile VARCHAR(11) NOT NULL,
	FOREIGN KEY(user_mobile) REFERENCES users(user_mobile),
	loan_transaction VARCHAR(30) NOT NULL,
	UNIQUE KEY loan_transaction (loan_transaction),
	loan_amount MEDIUMINT UNSIGNED NOT NULL,
	loan_date DATE NOT NULL,
	loan_time TIME NOT NULL
);








INSERT INTO customers(user_name, user_motherName, user_fatherName, user_dateBirth, user_nid, user_fingerprint, user_rating, user_image,user_parmanentAddress,
	user_bloddGroup,user_mobile)
VALUES ("Masum Ahmed","Shufia Begum","Abdul Haque",'1998-06-01',"19985104151141","sfIUEksjfkrnfgiergruejgniuer",500,"masumAhmed5104151141.jpg",
	"Iqbalpur, Jamalpur Sadar district, Mymensingh, Bangladesh","AB-","01701062056");

INSERT INTO users(user_mobile, user_password) VALUES ("01701062056",SHA1("helloWorld"));

INSERT INTO investment(user_mobile,invest_transaction,invest_amount,invest_date,invest_time) VALUES
("01701062056","firsttranction","500",'2019-04-18','10:15:28');


INSERT INTO loan(user_mobile,loan_transaction,loan_amount,loan_date,loan_time) VALUES
("01701062056","secondtranction","300",'2019-04-17','10:15:28');
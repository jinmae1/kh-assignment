--1.
CREATE TABLE ex_member (
	member_code NUMBER,
	member_id varchar2(20),
	member_pwd char(20) NOT NULL,
	member_name varchar2(30),
	member_addr varchar2(100) NOT NULL,
	gender char(3),
	phone char(11) NOT NULL,
	CONSTRAINT pk_ex_member__member_code PRIMARY KEY (member_code),
	CONSTRAINT uq_ex_member__member_id UNIQUE (member_id),
	CONSTRAINT ck_ex_member__gender CHECK (gender IN ('남', '여'))
);


--2.
 CREATE TABLE ex_member_nickname( 
 	member_code NUMBER,
 	member_nickname varchar2(100) NOT NULL,
 	CONSTRAINT fk_ex_member_nickname__member_code FOREIGN KEY (member_code) REFERENCES ex_member(member_code),
 	CONSTRAINT uq_ex_member_nickname__member_code UNIQUE (member_code)
 );
 
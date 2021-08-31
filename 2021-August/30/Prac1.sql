
--1. 학과테이블에서 계열별 정원의 평균을 조회(정원 내림차순 정렬)
SELECT 
	CATEGORY,
	trunc(avg(CAPACITY))
FROM
	TB_DEPARTMENT
GROUP BY
	category
ORDER BY
	avg(CAPACITY) DESC;



--2. 휴학생을 제외하고, 학과별로 학생수를 조회(학과별 인원수 내림차순)
SELECT
	DEPARTMENT_NO,
	count(ABSENCE_YN)
FROM
	TB_STUDENT
WHERE
	ABSENCE_YN = 'N'
GROUP BY
	department_no
ORDER BY
	count(ABSENCE_YN) DESC;



--3. 과목별 지정된 교수가 2명이상이 과목번호와 교수인원수를 조회
SELECT 
	CLASS_NO ,
	count(PROFESSOR_NO)
FROM
	TB_CLASS_PROFESSOR tcp
GROUP BY
	CLASS_NO
HAVING
	count(PROFESSOR_NO) >= 2;



--4. 학과별로 과목을 구분했을때, 과목구분이 "전공선택"에 한하여 과목수가 10개 이상인 행의 학과번호, 과목구분(class_type), 과목수를 조회(전공선택만 조회)
SELECT
	DEPARTMENT_NO,
	CLASS_TYPE,
	count(DEPARTMENT_NO)
FROM
	TB_CLASS
GROUP BY
	DEPARTMENT_NO,
	CLASS_TYPE
HAVING
	count(DEPARTMENT_NO) >= 10 
	AND CLASS_TYPE = '전공선택';
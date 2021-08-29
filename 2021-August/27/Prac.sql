-- 1.
SELECT
	emp_name,
	email,
	length(email)
FROM EMPLOYEE;


-- 2.
SELECT
	emp_name,
	substr(email, 1, instr(email, '@') - 1)
FROM EMPLOYEE;


-- 3.
SELECT
	emp_name AS "직원명",
	19 || substr(emp_no, 1, 2) AS "년생",
	nvl(bonus, 0) AS "보너스"
FROM EMPLOYEE
WHERE substr(emp_no, 1, 1) = 6;


-- 4.
SELECT
	count(*) || '명' AS "인원"
FROM EMPLOYEE
WHERE
	substr(PHONE, 1, 3) != '010';
	

-- 5.
SELECT
	emp_name,
	to_char(HIRE_DATE, 'yyyy"년" mm"월"')
FROM EMPLOYEE;


-- 6.
SELECT
	emp_name,
	rpad(substr(emp_no, 1, 8), 14, '*')
FROM EMPLOYEE;


-- 7.
SELECT
	emp_name,
	job_code,
	to_char(salary * (1 + nvl(bonus, 0)) * 12, 'FML999,999,999,999') AS "연봉" 
FROM EMPLOYEE;


-- 8.
SELECT
	emp_id,
	emp_name,
	dept_code,
	hire_date
FROM EMPLOYEE
WHERE
	dept_code IN ('D5', 'D9')
	AND EXTRACT(YEAR FROM hire_date) = 2004;
	

-- 9.
SELECT
	emp_name,
	hire_date,
	trunc(nvl(quit_date, sysdate) - hire_date)
FROM EMPLOYEE;


-- 10.
SELECT
	emp_name,
	dept_code,
	CASE
		WHEN substr(emp_no, 8, 1) IN (1, 2)
			THEN to_char(to_date('19' || substr(emp_no, 1, 6), 'yyyymmdd'), '"19"yy"년" mm"월" dd"일"')
		WHEN substr(emp_no, 8, 1) IN (3, 4)
			THEN to_char(to_date('20' || substr(emp_no, 1, 6), 'yyyymmdd'), '"20"yy"년" mm"월" dd"일"')
	END AS "생년월일",
	CASE
		WHEN substr(emp_no, 8, 1) IN (1, 2)
			THEN trunc((sysdate - to_date('19' || substr(emp_no, 1, 6), 'yyyymmdd')) / 365)
--			THEN (sysdate - to_date('19' || substr(emp_no, 1, 6), 'yyyymmdd')) / 365
		WHEN substr(emp_no, 8, 1) IN (3, 4)
			THEN trunc((sysdate -to_date('20' || substr(emp_no, 1, 6), 'yyyymmdd')) / 365)
	END AS "나이"
FROM EMPLOYEE;


-- 11.
SELECT
	sum(decode(EXTRACT(YEAR FROM hire_date), 1998, 1, 0)) AS "1998년"
	,sum(decode(EXTRACT(YEAR FROM hire_date), 1999, 1, 0)) AS "1999년"
	,sum(decode(EXTRACT(YEAR FROM hire_date), 2000, 1, 0)) AS "2000년"
	,sum(decode(EXTRACT(YEAR FROM hire_date), 2001, 1, 0)) AS "2001년"
	,sum(decode(EXTRACT(YEAR FROM hire_date), 2002, 1, 0)) AS "2002년"
	,sum(decode(EXTRACT(YEAR FROM hire_date), 2003, 1, 0)) AS "2003년"
	,sum(decode(EXTRACT(YEAR FROM hire_date), 2004, 1, 0)) AS "2004년"
	,sum(1) AS "전체직원수"
FROM EMPLOYEE;

-- 12.
SELECT
	emp_name,
	dept_code,
	CASE dept_code
		WHEN 'D5' THEN '총무부'
		WHEN 'D6' THEN '기획부'
		WHEN 'D9' THEN '영업부'
	END
FROM EMPLOYEE
WHERE dept_code IN ('D5', 'D6', 'D9')
ORDER BY dept_code;
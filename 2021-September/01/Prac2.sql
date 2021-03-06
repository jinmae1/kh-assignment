-- 1.
SELECT
	'2020-12-25' AS "날짜",
	to_char(to_date('2020-12-25', 'yyyy-mm-dd'), 'DAY') AS "요일"
FROM dual;


-- 2.
SELECT
	e.emp_name,
	e.emp_no,
	d.DEPT_TITLE,
	j.JOB_NAME
FROM
	EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN JOB j
		USING(JOB_CODE)
WHERE
	substr(emp_no, 8, 1) IN (2, 4)
	AND emp_name LIKE '전_%';


-- 3.
SELECT
	e.EMP_ID,
	e.EMP_NAME,
	e.AGE,
	d.DEPT_TITLE,
	j.JOB_NAME
FROM
	(
	SELECT
		EMP_ID,
		EMP_NAME,
		EXTRACT(YEAR FROM sysdate) - (decode(substr(EMP_NO, 8, 1), 1, 19, 2, 19, 20) || substr(emp_no, 1, 2)) + 1 AS "AGE",
		DEPT_CODE,
		JOB_CODE
	FROM
		EMPLOYEE e
	ORDER BY
		3) e
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN JOB j
		USING(JOB_CODE)
WHERE
	rownum = 1;

-- 4.
SELECT
	e.EMP_ID,
	e.EMP_NAME,
	d.DEPT_TITLE
FROM
	EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN JOB j
		USING(JOB_CODE)
WHERE
	EMP_NAME LIKE '형_%'
	OR EMP_NAME LIKE '_형%';



-- 5.
SELECT
	*
FROM
	EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN JOB j
		USING(JOB_CODE)
WHERE
	d.DEPT_TITLE LIKE '%해외_%';



-- 6.
SELECT
	e.EMP_NAME,
	e.BONUS,
	d.DEPT_TITLE,
	n.NATIONAL_NAME
FROM
	EMPLOYEE e
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN LOCATION l
ON
	d.LOCATION_ID = l.LOCAL_CODE
LEFT JOIN NATION n
ON
	l.NATIONAL_CODE = n.NATIONAL_CODE
WHERE
	BONUS IS NOT NULL;
	


-- 7.
SELECT
	e.EMP_NAME,
	j.JOB_NAME,
	d.DEPT_TITLE,
	n.NATIONAL_NAME
FROM
	EMPLOYEE e
LEFT JOIN JOB j
		USING(JOB_CODE)
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN LOCATION l
ON
	d.LOCATION_ID = l.LOCAL_CODE
LEFT JOIN NATION n
ON
	l.NATIONAL_CODE = n.NATIONAL_CODE
WHERE
	d.DEPT_ID = 'D2';
	


-- 8.
SELECT
	e.EMP_NAME,
	j.JOB_NAME,
	e.SALARY,
	e.SALARY * (1 + nvl(bonus, 0)) * 12 AS "Annual"
FROM
	EMPLOYEE e
LEFT JOIN SAL_GRADE g
		USING(SAL_LEVEL)
LEFT JOIN JOB j
		USING(JOB_CODE)
WHERE
	e.SALARY >= g.MAX_SAL ;


-- 9.
SELECT
	e.EMP_NAME,
	d.DEPT_TITLE,
	l.LOCAL_NAME,
	n.NATIONAL_NAME
FROM
	EMPLOYEE e
LEFT JOIN JOB j
		USING(JOB_CODE)
LEFT JOIN DEPARTMENT d
ON
	e.DEPT_CODE = d.DEPT_ID
LEFT JOIN LOCATION l
ON
	d.LOCATION_ID = l.LOCAL_CODE
LEFT JOIN NATION n
ON
	l.NATIONAL_CODE = n.NATIONAL_CODE
WHERE n.NATIONAL_NAME IN ('한국', '일본');
--WHERE l.NATIONAL_CODE IN ('KO', 'JP');


-- 10.
SELECT
	e1.EMP_NAME,
	DEPT_CODE,
	e2.EMP_NAME
FROM
	EMPLOYEE e1
JOIN EMPLOYEE e2
		USING(DEPT_CODE)
WHERE
	e1.EMP_ID != e2.EMP_ID
ORDER BY
	e1.EMP_ID;
	
select e.emp_name 사원명
      , dept_title 부서명
      , e2.emp_name 동료사원명
from employee e
 join employee e2 on(e.dept_code = e2.dept_code)
 left join department d on e.dept_code = dept_id
where e.emp_name != e2.emp_name
order by 1;
​


-- 11.
SELECT
	e.EMP_NAME,
	j.JOB_NAME,
	e.SALARY
FROM
	EMPLOYEE e
LEFT JOIN JOB j
		USING(JOB_CODE)
WHERE
	e.BONUS IS NULL
	AND j.JOB_NAME = '차장';
	

-- 12.
	SELECT
	sum(decode(QUIT_YN, 'N', 1, 0)) AS "재직중",
	sum(decode(QUIT_YN, 'Y', 1, 0)) AS "퇴직"
FROM
	EMPLOYEE;
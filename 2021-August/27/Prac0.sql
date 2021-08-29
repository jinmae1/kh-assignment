SELECT
	sum(CASE WHEN substr(emp_no, 8, 1) IN (1, 3) THEN 1 ELSE 0 END) AS "남",
	sum(CASE WHEN substr(emp_no, 8, 1) IN (2, 4) THEN 1 ELSE 0 END) AS "여"
FROM EMPLOYEE;
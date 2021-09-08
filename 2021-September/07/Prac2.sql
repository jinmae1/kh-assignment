--1.

	STUDENT_NO AS "학번",
	STUDENT_NAME AS "이름",
	ENTRANCE_DATE AS "입학년도"
FROM TB_STUDENT ts
WHERE DEPARTMENT_NO = (SELECT td.DEPARTMENT_NO FROM TB_DEPARTMENT td WHERE td.DEPARTMENT_NAME = '영어영문학과')
ORDER BY ENTRANCE_DATE;


--2.
SELECT
	PROFESSOR_NAME,
	PROFESSOR_SSN
FROM TB_PROFESSOR tp
WHERE LENGTH(PROFESSOR_NAME) != 3;



--3.
SELECT 
	PROFESSOR_NAME AS "이름",
	age AS "나이"
FROM (
SELECT
	PROFESSOR_NAME,
	EXTRACT(YEAR FROM SYSDATE) - (19 || SUBSTR(PROFESSOR_SSN, 1, 2)) + 1 AS age,
	substr(PROFESSOR_SSN, 8, 1) AS gender
FROM TB_PROFESSOR 
) tp
WHERE gender = 1
ORDER BY age;


--4.
SELECT
	substr(PROFESSOR_NAME, 2) AS "이름"
FROM TB_PROFESSOR tp;


--5.
SELECT 
	STUDENT_NO,
	STUDENT_NAME 
FROM TB_STUDENT ts
WHERE EXTRACT(YEAR FROM ENTRANCE_DATE) = (decode(substr(STUDENT_SSN, 8, 1), 1, 1900, 2, 1900, 2000) + substr(STUDENT_SSN, 1, 2)) + 20;


--6.
SELECT
	TO_CHAR(TO_DATE('2020-12-15', 'yyyy-mm-dd'), 'Day')
FROM dual;


--7.
SELECT
	to_date('99/10/11', 'YY/MM/DD'),
	to_date('49/10/11', 'YY/MM/DD'),
	to_date('99/10/11', 'RR/MM/DD'),
	to_date('49/10/11', 'RR/MM/DD')
FROM dual;


--8.
SELECT
	STUDENT_NO,
	STUDENT_NAME
FROM TB_STUDENT ts
WHERE SUBSTR(STUDENT_NO , 1, 1) != 'A';


--9.
SELECT
ROUND(AVG(POINT), 1) AS "평점"
FROM TB_GRADE tg
WHERE STUDENT_NO = (SELECT STUDENT_NO FROM TB_STUDENT ts WHERE STUDENT_NO = 'A517178')


--10.
SELECT
	DEPARTMENT_NO AS "학과번호",
	count(student_no) AS "학생수(명)"
FROM TB_DEPARTMENT td LEFT JOIN TB_STUDENT ts
USING(DEPARTMENT_NO)
GROUP BY DEPARTMENT_NO;


--11.
SELECT
	count(*)
FROM TB_STUDENT ts LEFT JOIN TB_PROFESSOR tp 
ON ts.COACH_PROFESSOR_NO = tp.PROFESSOR_NO 
WHERE ts.COACH_PROFESSOR_NO IS NULL;


--12.
SELECT
SUBSTR(TERM_NO, 1, 4) AS "년도", 
ROUND(avg(tg.POINT), 1) AS "년도 별 평점"
FROM TB_GRADE tg
WHERE STUDENT_NO = (SELECT STUDENT_NO FROM TB_STUDENT ts WHERE ts.STUDENT_NO = 'A112113')
GROUP BY SUBSTR(TERM_NO, 1, 4)
ORDER BY 1;


--13.
WITH absence
AS
(
SELECT
	DEPARTMENT_NO,
	STUDENT_NO 
FROM TB_STUDENT ts 
WHERE ABSENCE_YN = 'Y'
)
SELECT
	DEPARTMENT_NO,
	DEPARTMENT_NAME,	
	count(ab.student_no)
FROM TB_DEPARTMENT td LEFT JOIN absence ab
USING(DEPARTMENT_NO)
GROUP BY DEPARTMENT_NO, DEPARTMENT_NAME; 


--14.
SELECT *
FROM TB_STUDENT ts
WHERE STUDENT_NAME IN (SELECT STUDENT_NAME FROM TB_STUDENT ts2 GROUP BY STUDENT_NAME HAVING count(STUDENT_NAME) > 1)


--15.
SELECT
SUBSTR(TERM_NO, 1, 4) AS "년도", 
SUBSTR(TERM_NO, 5, 2) AS "학기",
ROUND(avg(tg.POINT), 1) AS "년도 별 평점"
FROM TB_GRADE tg
WHERE STUDENT_NO = (SELECT STUDENT_NO FROM TB_STUDENT ts WHERE ts.STUDENT_NO = 'A112113')
GROUP BY ROLLUP(SUBSTR(TERM_NO, 1, 4), SUBSTR(TERM_NO, 5, 2))
ORDER BY 1;
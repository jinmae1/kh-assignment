--1. 휴학중인 학번, 학생명, 학과명 조회
SELECT
	ts.STUDENT_NO AS "학번",
	ts.STUDENT_NAME AS "학생명",
	td.DEPARTMENT_NAME AS "학과명" 
FROM TB_STUDENT ts
LEFT JOIN TB_DEPARTMENT td
	USING(department_no)
WHERE
ts.ABSENCE_YN = 'Y';


--2. 수업번호, 수업명, 교수번호, 교수명 조회
SELECT 
	CLASS_NO AS "수업번호",
	CLASS_NAME AS "수업명",
	PROFESSOR_NO AS "교수번호",
	tp.PROFESSOR_NAME AS "교수명"
FROM TB_CLASS tc
LEFT JOIN TB_CLASS_PROFESSOR tcp
	using(CLASS_NO)
LEFT JOIN TB_PROFESSOR tp
	using(professor_no);


--3. 송박선 학생의 모든 학기 과목별 점수를 조회(학기, 학번, 학생명, 수업명, 점수)
SELECT
	tg.TERM_NO AS "학기",
	STUDENT_NO AS "학번",
	ts.STUDENT_NAME AS "학생명",
	tc.CLASS_NAME AS "수업명",
	tg.POINT AS "점수" 
FROM TB_STUDENT ts LEFT JOIN TB_GRADE tg
	USING(STUDENT_NO)
LEFT JOIN TB_CLASS tc 
	USING(CLASS_NO)
WHERE ts.STUDENT_NAME = '송박선';


--4. 학생별 전체 평점(소수점이하 첫째자리 버림) 조회 (학번, 학생명, 평점)
SELECT
	STUDENT_NO AS "학번",
	STUDENT_NAME AS "학생명",
	floor(avg(tg.POINT) * 10) / 10 AS "평점"
FROM TB_STUDENT TS
LEFT JOIN TB_GRADE tg
USING(STUDENT_NO)
GROUP BY STUDENT_NO , STUDENT_NAME; 


--5. 교수번호, 교수명, 담당학생명수 조회
-- 단, 5명 이상의 학생이 담당하는 교수만 출력
SELECT
	tp.PROFESSOR_NO AS "교수번호",
	tp.PROFESSOR_NAME AS "교수명",
	count(ts.COACH_PROFESSOR_NO) AS "담당학생 수"
FROM TB_STUDENT ts
RIGHT JOIN TB_PROFESSOR tp
ON ts.COACH_PROFESSOR_NO = tp.PROFESSOR_NO
GROUP BY tp.PROFESSOR_NO, tp.PROFESSOR_NAME 
HAVING count(ts.COACH_PROFESSOR_NO) >= 5;
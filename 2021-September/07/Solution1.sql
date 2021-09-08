--# Additional SELECT - 함수
​
--1.
SELECT STUDENT_NO AS 학번,
       STUDENT_NAME AS 이름,
          TO_CHAR(ENTRANCE_DATE, 'RRRR-MM-DD') AS 입학년도
FROM   TB_STUDENT
WHERE  DEPARTMENT_NO='002'
ORDER BY ENTRANCE_DATE;
​
--2.
SELECT PROFESSOR_NAME , 
       PROFESSOR_SSN
FROM   TB_PROFESSOR
WHERE  PROFESSOR_NAME NOT LIKE '___';
--문자패턴조건을 언더바 ___3개가  아닌(not like) 이름들 가져왔으므로
--이름이 한 자인 이름도 출력, 이름이 2 자인 이름도 출력(강혁), 이름이 4자인 이름도 출력(박강아름), 이름이 5자인 이름도 출력.....할수 있다.
​
--3.
SELECT PROFESSOR_NAME AS 교수이름,
       TO_NUMBER(TO_CHAR(SYSDATE, 'YYYY')) - TO_NUMBER('19' || SUBSTR(PROFESSOR_SSN, 1, 2)) AS 나이,
       TRUNC(
        MONTHS_BETWEEN(
            SYSDATE,  
            TO_DATE('19' ||SUBSTR(PROFESSOR_SSN, 1, 6),'RRRRMMDD'))/12
       ) 만나이
FROM   TB_PROFESSOR
WHERE  SUBSTR(PROFESSOR_SSN, 8, 1) = '1'
ORDER BY 2, 1;
​
--4.
SELECT SUBSTR(PROFESSOR_NAME, 2) AS 이름
FROM   TB_PROFESSOR;
​
--5.
SELECT  STUDENT_NO,
        STUDENT_NAME
FROM    TB_STUDENT
WHERE   TO_NUMBER(TO_CHAR(ENTRANCE_DATE, 'YYYY')) 
            - TO_NUMBER(TO_CHAR(TO_DATE(SUBSTR(STUDENT_SSN, 1, 2), 'RR'), 'YYYY'))  > 19
ORDER BY 1;
​
​
--6.
SELECT TO_CHAR(TO_DATE('2020/12/25'), 'YYYYMMDD DAY') FROM DUAL;
​
--7.
--RRRR YYYY
--RR YY
--YY : 현재년도기준으로 한세기(00~99)에서 판단. 2020 -> 2000 ~ 2099
--RR : 현재년도기준으로 한세기(50~49)에서 판단. 2020 -> 1950 ~ 2049,  2060 -> 2050 ~ 2149
​
SELECT TO_CHAR(TO_DATE('99/10/11', 'YY/MM/DD'), 'YYYY') FROM DUAL; --2099
SELECT TO_CHAR(TO_DATE('49/10/11', 'YY/MM/DD'), 'YYYY') FROM DUAL; --2049
SELECT TO_CHAR(TO_DATE('99/10/11', 'RR/MM/DD'), 'YYYY') FROM DUAL; -- 1999
SELECT TO_CHAR(TO_DATE('49/10/11', 'RR/MM/DD'), 'YYYY') FROM DUAL; -- 2049
/*
TO_DATE('99/10/11', 'YY/MM/DD') : 2099년 10월 11일
TO_DATE('49/10/11', 'YY/MM/DD') : 2049년 10월 11일
TO_DATE('99/10/11', 'RR/MM/DD') : 1999년 10월 11일
TO_DATE('49/10/11', 'RR/MM/DD') : 2049년 10월 11일
*/
​
--8.
SELECT STUDENT_NO,
       STUDENT_NAME
FROM   TB_STUDENT
WHERE  SUBSTR(STUDENT_NO, 1, 1) <> 'A'
ORDER BY 1;
​
--9. 
SELECT ROUND(AVG(POINT), 1) AS 평점 
FROM   TB_GRADE
WHERE  STUDENT_NO = 'A517178';
​
--10.
SELECT DEPARTMENT_NO AS 학과번호,
       COUNT(*) AS "학생수(명)"
FROM   TB_STUDENT
GROUP BY DEPARTMENT_NO
ORDER BY 1;
​
--11.
SELECT COUNT(*)
FROM   TB_STUDENT
WHERE COACH_PROFESSOR_NO IS NULL;
​
​
​
--12.
SELECT SUBSTR(TERM_NO, 1 ,4) AS 년도,
       ROUND(AVG(POINT), 1) AS "년도 별 평점" 
FROM   TB_GRADE
WHERE  STUDENT_NO = 'A112113'
GROUP BY SUBSTR(TERM_NO, 1, 4);
​
--13.
SELECT DEPARTMENT_NO AS 학과코드명,
       SUM(
        CASE 
            WHEN ABSENCE_YN ='Y' THEN 1 
            ELSE 0 END) AS "휴학생 수"
FROM   TB_STUDENT
GROUP BY DEPARTMENT_NO
--ORDER BY 1
;
​
--14.
SELECT STUDENT_NAME AS 동일이름,
       COUNT(*)     AS "동명인 수"
FROM   TB_STUDENT
GROUP BY STUDENT_NAME
HAVING COUNT(*) > 1;
​
--15.
--grouping : 실제 데이터 0, 집계데이터 1
select 
    decode(grouping(substr(term_no, 1, 4)), 0, substr(term_no, 1, 4), '___') 년도,
    decode(grouping(substr(term_no, 5, 2)), 0, substr(term_no, 5, 2), '___') 학기,
    round(avg(point), 1) 평점
from 
    tb_grade
where  student_no = 'A112113'
group by 
    rollup(
        substr(term_no, 1, 4), 
        substr(term_no, 5, 2)
    )
        
order by
    1, 2;
​
--DECODE이용
SELECT DECODE(GROUPING(SUBSTR(TERM_NO, 1, 4)),0,SUBSTR(TERM_NO, 1, 4),1,'총평점') AS 년도,
        DECODE(GROUPING(SUBSTR(TERM_NO, 5, 2)),0,SUBSTR(TERM_NO, 5, 2),1,'연별누적평점') AS 학기,
        ROUND(AVG(POINT), 1) AS 평점
FROM   TB_GRADE
WHERE  STUDENT_NO = 'A112113'
GROUP BY ROLLUP(SUBSTR(TERM_NO, 1, 4),SUBSTR(TERM_NO, 5, 2));
​
--CASE이용
SELECT DECODE(GROUPING(SUBSTR(TERM_NO, 1, 4)),0,SUBSTR(TERM_NO, 1, 4),1,'총평점') AS 년도,
        CASE WHEN GROUPING(SUBSTR(TERM_NO, 1, 4)) = 1 AND GROUPING(SUBSTR(TERM_NO, 5, 2))=1 THEN ' '
              WHEN GROUPING(SUBSTR(TERM_NO, 5, 2)) = 1 THEN '연별누적평점'
              ELSE SUBSTR(TERM_NO, 5, 2) END AS 구분,
        ROUND(AVG(POINT), 1) AS 평점
FROM   TB_GRADE
WHERE  STUDENT_NO = 'A112113'
GROUP BY ROLLUP(SUBSTR(TERM_NO, 1, 4),SUBSTR(TERM_NO, 5, 2));
​
Collapse




김동현  15:52
@실습문제풀이
1. 첫번째 테이블 명 : EX_MEMBER
* MEMBER_CODE(NUMBER) - 기본키						-- 회원전용코드 
* MEMBER_ID (varchar2(20) ) - 중복금지					-- 회원 아이디
* MEMBER_PWD (char(20)) - NULL 값 허용금지					-- 회원 비밀번호
* MEMBER_NAME(varchar2(30)) 							-- 회원 이름
* MEMBER_ADDR (varchar2(100)) - NULL값 허용금지					-- 회원 거주지
* GENDER (char(3)) - '남' 혹은 '여'로만 입력 가능				-- 성별
* PHONE(char(11)) - NULL 값 허용금지 					-- 회원 연락처


2. EX_MEMBER_NICKNAME 테이블을 생성하자. (제약조건 이름 지정할것)
(참조키를 다시 기본키로 사용할 것.)
* MEMBER_CODE(NUMBER) - 외래키(EX_MEMBER의 기본키를 참조), 중복금지		-- 회원전용코드
* MEMBER_NICKNAME(varchar2(100)) - 필수 						-- 회원 이름

    create table ex_member (
        member_code number, 						        -- 회원전용코드 
        member_id varchar2(20)  not null, 	                -- 회원 아이디
        member_pwd char(20) not null,		                -- 회원 비밀번호
        member_name varchar2(30), 							-- 회원 이름
        member_addr varchar2(100) not null,                   -- 회원 거주지
        gender char(3)  not null,                              -- 성별
        phone char(11) not null, 					             -- 회원 연락처
        constraint pk_ex_member_code primary key(member_code),
        constraint uq_ex_member_id unique(member_id),
        constraint ck_ex_member_gender check(gender in ('남','여'))
    );

    comment on table ex_member is '회원관리테이블';
    comment on column ex_member.member_code is '회원전용코드';
    comment on column ex_member.member_id is '회원 아이디';
    comment on column ex_member.member_pwd is '회원 비밀번호';
    comment on column ex_member.member_code is '회원 비밀번호';
    comment on column ex_member.member_name is '회원 이름';
    comment on column ex_member.member_addr is '회원 거주지';
    comment on column ex_member.gender is '전화번호';
    comment on column ex_member.phone is '회원 연락처';

    create table ex_member_nickname(
        member_code number constraint pk_ex_member_nickname primary key 
                            constraint fk_ex_member_nickname references ex_member(member_code),
        member_nickname varchar2(100) not null
    );

    comment on table ex_member_nickname is '회원별칭관리테이블';
    comment on column ex_member_nickname.member_code is '회원전용코드';
    comment on column ex_member_nickname.member_nickname is '회원 별칭';

    --테이블 주석 조회
    select *
    from user_tab_comments
    where table_name in ('EX_MEMBER','EX_MEMBER_NICKNAME');
    --컬럼 주석 조회
    select *
    from user_col_comments
    where table_name in ('EX_MEMBER','EX_MEMBER_NICKNAME');

    --EX_MEMBER 제약조건 조회
    select A.owner, 
        A.table_name, 
        B.column_name,
        constraint_name,
        A.constraint_type,
        A.search_condition
    from user_constraints A join user_cons_columns B
        using(constraint_name)
    where A.table_name = 'EX_MEMBER';

    --EX_MEMBER_NICKNAME 제약조건 조회
    select A.owner, 
        A.table_name, 
        B.column_name,
        constraint_name,
        A.constraint_type,
        A.search_condition
    from user_constraints A join user_cons_columns B
        using(constraint_name)
    where A.table_name = 'EX_MEMBER_NICKNAME';
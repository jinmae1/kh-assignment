create table tbl_escape_watch(
	watchname   varchar2(40)
	,description    varchar2(200)
);
--drop table tbl_escape_watch;
insert into tbl_escape_watch values('금시계', '순금 99.99% 함유 고급시계');
insert into tbl_escape_watch values('은시계', '고객 만족도 99.99점를 획득한 고급시계');
commit;
select * from tbl_escape_watch;


SELECT *
FROM tbl_escape_watch
WHERE
	instr(DESCRIPTION, '99.99%') != 0;
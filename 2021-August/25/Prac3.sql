create table tbl_files (
	fileno number(3),
	filepath varchar2(500)
);

insert into tbl_files values(1, 'c:\abc\deft\salesinfo.xls');
insert into tbl_files values(2, 'c:\music.mp3');
insert into tbl_files values(3, 'c:\documents\resume.hwp');

commit;
select * 
from tbl_files;

SELECT
	fileno as "파일번호",
	substr(filepath, instr(filepath, '\', -1) + 1) as "파일명"
FROM
	tbl_files

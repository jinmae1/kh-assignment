SELECT
	emp_id,
	emp_name,
	-- substr(emp_no, 1, 8) || '******' as "emp_no",
	rpad(substr(emp_no, 1, 8), 14, '*') as "emp_no",
	salary
FROM
	employee
WHERE
	instr(emp_no, '-1') != 0;

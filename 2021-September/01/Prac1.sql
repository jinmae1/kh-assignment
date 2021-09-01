-- 월별로 제품별 총 판매량을 출력하세요.
-- (2021-07, 2021-08, 2021-09)

SELECT
	to_char(sale_date, 'yyyy-mm') AS "판매월",
	p_name AS "제품명",
	sum(p_count) AS "판매량"
FROM
	(
	SELECT
		*
	FROM
		TBL_SALES s
UNION ALL
	SELECT
		*
	FROM
		TBL_SALES_202107 s07
UNION ALL
	SELECT
		*
	FROM
		TBL_SALES_202108 s08
) e
GROUP BY
	p_name,
	to_char(sale_date, 'yyyy-mm')
ORDER BY
	1;
CREATE VIEW empview10
AS
SELECT empno, ename, job
FROM emp
WHERE deptno = 10;

select *
from empview10;
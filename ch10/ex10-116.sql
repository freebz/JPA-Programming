-- 예제 10.116 proc_multiply MySQL 프로시저

DELIMITER //

CREATE PROCEDURE proc_multiply (INOUT inParam INT, INOUT outParam INT)
BEGIN
    SET outParam = inParam * 2;
END //

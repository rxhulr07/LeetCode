CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 Set N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      Select Distinct Salary
      from Employee
      Order by salary desc
      limit 1 OFFSET N
  );
END
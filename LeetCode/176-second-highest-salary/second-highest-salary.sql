# Write your MySQL query statement below
Select ( Select DISTINCT Salary
from Employee
ORDER by Salary desc
LIMIT 1 OFFSET 1)  As SecondHighestSalary;

    

# Write your MySQL query statement below
Select Max(Salary) As SecondHighestSalary
from Employee
where salary <( select Max(Salary) from Employee);
    

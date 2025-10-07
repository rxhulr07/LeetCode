# Write your MySQL query statement below

Select s1.score,
       (Select COUNT(DISTINCT s2.score)
From Scores s2
Where s2.score >= s1.score) As `rank`
from Scores s1
order by s1.score desc;
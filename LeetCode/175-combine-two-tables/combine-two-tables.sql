# Write your MySQL query statement below
select
      p.firstName AS firstName,
      p.lastName As lastName,
      a.city As city,
      a.state As state
From 
    Person p
Left Join
    Address a
on p.personId = a.personId;
-- group by firstname;



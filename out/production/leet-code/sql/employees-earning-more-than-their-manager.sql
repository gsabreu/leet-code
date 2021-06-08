SELECT 
    a.Name AS Employee
FROM Employee a JOIN Employee b
    ON a.ManagerId = b.Id
    AND A.Salary > b.Salary
package ru.mirea.task3;

public class Report
{
    private Employee employee;
    public String getReport(Employee employee)
    {
        return String.format(" %s : %.2f.",employee.getFullname(),employee.getSalary());
    }

}

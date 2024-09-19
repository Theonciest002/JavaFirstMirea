package ru.mirea.task3;

public class Employee
{
    private String fullname;
    private float salary;
    public Employee(String fullname,float salary)
    {
        this.fullname=fullname;
        this.salary=salary;
    }
    public float getSalary()
    {
        return salary;
    }
    public String getFullname()
    {
        return fullname;
    }
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    public void setFullname(String fullname)
    {
        this.fullname=fullname;
    }
    @Override
    public String toString()
    {
        return "emp{fio="+fullname+",salary="+salary+"}";
    }
}

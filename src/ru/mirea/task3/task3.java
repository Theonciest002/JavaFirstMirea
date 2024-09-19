package ru.mirea.task3;

public class task3
{
    public static void main(String[] args)
    {
        Report rp = new Report();
        Employee[] emp1 = new Employee[2];
        emp1[0] = new Employee("jo little",10.0f);
        emp1[1] = new Employee("jo big",50.0f);
        String rapports = "";
        for(int i =0;i< emp1.length;i++)
        {
            rapports+=rp.getReport(emp1[i]);
        }
        System.out.println(String.format("%200s",rapports));

    }
}

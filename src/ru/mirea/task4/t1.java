package ru.mirea.task4;

import java.util.Arrays;

public class t1
{
    public static void main(String[] args)
    {
        TimeOfYear timw = TimeOfYear.Winter;
        TimeOfYear tims = TimeOfYear.Summer;
        System.out.println(timw);
        timw.Say(timw);
        timw.getDescription();
        tims.getDescription();
        for (TimeOfYear t : TimeOfYear.values())
        {
            System.out.println(t);
            t.getDescription();
        }

    }
}

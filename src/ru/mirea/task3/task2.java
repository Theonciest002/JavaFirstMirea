package ru.mirea.task3;

import java.util.Scanner;
public class task2
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      Double dubl = Double.valueOf(30);
      char c = (char) 30.0;
      dubl = Double.parseDouble("001.01");
      System.out.println("double after parse="+dubl);
      System.out.println("byte value="+dubl.byteValue());
      System.out.println("short value="+dubl.shortValue());
      System.out.println("int value="+dubl.intValue());
      System.out.println("long value="+dubl.longValue());
      System.out.println("float value="+dubl.floatValue());
      System.out.println("double value="+dubl.doubleValue());
      System.out.println("char value="+c);
      if (dubl!=null)
      {
          System.out.println("boolean value="+true);
      }
      if (dubl == null)
      {
          System.out.println("boolean value="+false);
      }
        System.out.println("vals of double="+dubl);
        System.out.println("pi string");
        System.out.println(Double.toString(3.14));
    }
}

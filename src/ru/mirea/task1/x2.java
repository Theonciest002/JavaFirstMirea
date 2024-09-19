package ru.mirea.task1;
import java.util.Scanner;
public class x2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size,a,min=0,max=0;
        int i=0,sum=0;
        size=sc.nextInt();
        int[] b = new int[size];
        while (i<size)
        {
            b[i]=sc.nextInt();
            sum+=b[i];
            if (i==0)
            {
                min=b[i];
                max=b[i];
            }
            else
            {
                if (min>b[i])
                {
                    min=b[i];
                }
                if (max<b[i])
                {
                    max=b[i];
                }
            }
            i+=1;
        }
        System.out.printf("sum=%d,max=%d,min=%d",sum,max,min);
    }

}

package ru.mirea.task3;
import java.util.Random;
import java.util.Scanner;
public class task15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int j = 0;
        int n = 0;
        int cnt = 0;
        while (n!=10)
        {
            n = sc.nextInt();
            if (n!=10)
            {
                System.out.println("wrong combination");
            }
        }
        System.out.println("first array:");
        int[] ar1 = new int[n];
        for (int i = 0;i<n;i++)
        {
            ar1[i] = rd.nextInt(10);
            System.out.println(ar1[i]);
            if (ar1[i] %2 == 0)
            {
                cnt+=1;
            }
        }
        System.out.println("array of even:");
        int[] ar2 = new int[cnt];
        for (int i = 0;i<n;i++)
        {
            if (ar1[i] %2 == 0)
            {
                ar2[j]=ar1[i];
                System.out.println(ar2[j]);
                j+=1;
            }
        }
    }
}

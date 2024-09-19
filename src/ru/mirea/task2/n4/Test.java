package ru.mirea.task2.n4;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        Pc[] p1 = new Pc[2];
        //p1[0] = new Pc ("g", "c", "r", "o", "o");
        //p1[1] = new Pc ("g1", "c1", "r1", "o1", "o1");
        System.out.println("Welcome,enter 0 for tutorial");
        while (true)
        {
            int action=sc.nextInt();
            switch(action)
            {
                case 0:
                    shop.tutorial();
                    break;
                case 1:
                    shop.listpcs(p1);
                    break;
                case 2:
                    p1=shop.setPc(p1);
                    break;
                case 3:
                    p1=shop.delPc(p1);
                    break;
                case 4:
                    shop.search(p1);
                    break;
                case 5:
                    System.out.println(shop.getPc(p1));
                default:
                    break;
            }

        }

    }
}

import java.util.*;
public class Quest2
{
    public static int SumCalc(int n)
    {
        int num = 0;
        for (int i = 1; i<n; i+=2) // It will not add n for n add you can use i<=n
        {
            num+=i;
        }
        return num;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a Number");
        int a = sc.nextInt();
        System.out.println("Your Series of Odd num is :" +SumCalc(a));
    }
}
import java.util.*;
public class Quest1
{
    //Create a function
    public static double Average(double a, double b, double c)
    {
        return (a + b + c) / 3;       
    }    
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st Number:");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd Number:");
       double b = sc.nextDouble();
        System.out.println("Enter 3rd Number:");
        double c = sc.nextDouble();
        double x = Average(a,b,c);
        System.out.println ("Average is :" +x);
    }
}
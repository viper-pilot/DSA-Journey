import java.util.*;
public class Quest4
{
    public static double Circlecum(double x)
    {
        return 2 * 3.14 * x;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the circle");
        double a = sc.nextDouble();
        System.err.println("Circumference of the circle is :" + Circlecum(a));
    }
}
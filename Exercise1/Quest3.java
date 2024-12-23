import java.util.*;
public class Quest3
{
    public static int Greaternum(int a, int b)
    {
       /* if (a>b) return a;
        else return b; */
        //Ternary Operator (condition ? value_if_true : value_if_false)
        return (a > b) ? a : b;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int x = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int y = sc.nextInt();
        System.out.println("Greater is : " + Greaternum(x, y)); 
    }
}
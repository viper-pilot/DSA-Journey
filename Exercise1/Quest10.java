import java.util.*;
public class Quest10
{
    public static void Fiboseries (int n)
    {
        int n1 = 0, n2 = 1;
        //Observation don't use println instead use print
        System.out.print(n1 + " " + n2 + " " ); // First & Sec Num
        for (int i =2; i<n ; i++)
        {
            int next = n1+n2;
            System.out.print(next + " "); // Printing on same line
            n1 = n2; // Update n1 to previous n2
            n2 = next;// Update n2 to current num
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to make a series : ");
        int a = sc.nextInt();
        System.out.print(" Fibonacci Series : ");
        Fiboseries(a);
    }
}
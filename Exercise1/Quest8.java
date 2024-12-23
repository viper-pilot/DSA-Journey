import java.util.*;
public class Quest8
{
    public static int calPower(int base, int exponent)
    {
        int res = 1;
        for (int i = 0; i < exponent; i++)
        {
            res *= base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a base : ");
        int a = sc.nextInt();

        System.out.println("Enter a Exponent : ");
        int b = sc.nextInt();

        System.out.println(a + " ^ " + b + " = " + calPower(a, b));  
}
}
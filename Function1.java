import java.util.Scanner;
public class Function1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter a 2nd Number : ");
        int num2 = sc.nextInt();
        int sum = add(num1, num2);
        System.out.println("Sum is :" +sum); 
    }
        public static int add(int a,int b)
        { 
            return a+b;
        }
    }

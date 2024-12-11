import java.util.Scanner;
class Readinput
{
	public static void main (String [] args)
	{
		System.out.println ("We are taking input now !!");
		
		int a, b;
		System.out.println ("Enter 1st integer:");
		Scanner s = new Scanner (System.in);
		a = s.nextInt();
		System.out.println ("Enter 2nd integer:");
		b = s.nextInt();
		int sum = a + b;
		System.out.println ("Total is :" + sum);
	}
}
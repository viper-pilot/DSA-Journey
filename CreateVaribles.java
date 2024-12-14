import java.io.*;
import java.util.Scanner;
class CreateVaribles
{
    public static void main (String[] args)
    {
        System.out.println ("Enter a num:");
        Scanner sc = new Scanner (System.in);
        //Local Variable
        int num = sc.nextInt();
        System.out.println ("Num:" +num);
    }
}
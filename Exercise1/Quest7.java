import java.util.*;
public class Quest7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int poscount = 0, negcount = 0, zerocount = 0, number;
        do { 
             System.out.println("Enter a Number");
             number = sc.nextInt();
             if(number>0) poscount++;
             else if (number < 0) negcount++;
             else if (number == 0) zerocount++;
             } 
             while (number != 0);
             System.out.println("Count of Positive Number : " +poscount);
             System.out.println("Count of Negative Number : "+negcount);
             System.out.println("Count of Zero Number : "+zerocount);
    }
}
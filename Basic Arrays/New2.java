//Largest Num
import java.util.*;
public class New2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter a number or size:");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter" + n + "elements:");
        for (int i = 0; i<n ; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The Largest is : " +max);
        }
    }

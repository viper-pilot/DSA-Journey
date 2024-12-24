//Smallest
import java.util.*;
public class New3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of arrays:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
            int min = arr[0];
            for (int i = 0; i<n; i++)
            {
                if (arr[i] < min) min = arr[i];

            }
            System.out.println("Smallest is : " +min);
        }
    }

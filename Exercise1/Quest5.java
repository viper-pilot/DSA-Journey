import java.util.*;
public class Quest5
{
    public static boolean isEligibleVote(int age)
    {
        return age >= 18;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (isEligibleVote(age))
        {
            System.out.println("You can vote !!");
        }
        else
        {
            System.out.println("No !! Can't Vote ");
        }        
    }
}
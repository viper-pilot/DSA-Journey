import java.util.*;

class New1 {
    // Method to find the largest element in the array
    static int findMax(int[] arr) {
        int max = arr[0];  // Assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger element is found
            }
        }
        return max;
    }

    // Method to find the smallest element in the array
    static int findMin(int[] arr) {
        int min = arr[0];  // Assume first element is the smallest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // Update min if a smaller element is found
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Asking the user for input
        try (Scanner scanner = new Scanner(System.in)) { // try with resource is updated in java 7 allows automatic close resources (Prevent resource leaks)
            // Asking the user for input
            System.out.println("Enter the number of elements:");
            int n = scanner.nextInt();
            scanner.nextLine(); // This line consumes the newline character after reading n
            // Initialize the array with the given number of elements
            int[] arr = new int[n];
            // Taking array input from the user
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();  // Read each integer and store it in the array
            }   // Outputting the largest and smallest elements
            System.out.println("The Largest element is: " + findMax(arr));
            System.out.println("The Smallest element is: " + findMin(arr));
            // Close the scanner to avoid resource leak
        }
    }
}

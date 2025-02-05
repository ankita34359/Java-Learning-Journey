import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want: ");
        int number = sc.nextInt();
        
        // Calling the function and displaying the result
        int result = facto(number);
        System.out.println("The factorial of " + number + " is " + result);
    }

    // Creating a function to calculate factorial using a while loop
    public static int facto(int number) {
        // Factorial of 0 or 1 is 1
        if (number < 2) {
            return 1;
        }

        int multiply = 1; // Initialize result to 1
        int i = 2; // Start from 2 (as multiplying by 1 doesn't change the result)
        
        // Using a while loop to calculate factorial
        while (i <= number) {
            multiply = multiply * i; // Multiply the current result by i
            i++; // Increment i for the next iteration
        }
        return multiply; // Return the final result
    }
}

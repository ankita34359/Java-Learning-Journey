import java.util.*;

public class SecMethodForSOEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the alternative method for finding the sum of even numbers");
        System.out.print("Enter the number here: ");
        int num = sc.nextInt();
        int result = evenSum(num);
        System.out.println("The sum till " + num + " is " + result);
    }

    public static int evenSum(int num){

        int i=1;
        int sum=0;

        // Iterate from 1 to num using a while loop
        while (i<=num) {

            // Check if the number is even
            if (i%2==0) {

                // Add the even number to the sum
                sum = sum + i; 
            } 

            // Increment i to avoid infinite loop
            i++; 
        }

        return sum;
    }
}

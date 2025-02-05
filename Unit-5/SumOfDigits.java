import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digits");
        System.out.print("Enter your number here: ");
        int number = sc.nextInt();
        int sum = SOD(number);
        System.out.println("Sum of Digits is: " + sum);
        
    }

    public static int SOD(int number){
        int sum = 0;
        int remainder;
        int quotient;

        while (number>0) {
            // Extract the last digit and add to sum
            remainder = number%10;
            sum = sum + remainder;
            // Remove the last digit from the number
            quotient = number/10;
            number = quotient;   
        }

        return sum;
    }
}

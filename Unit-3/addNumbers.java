import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println("The addition of first and Second Number is " + result);
    }
}

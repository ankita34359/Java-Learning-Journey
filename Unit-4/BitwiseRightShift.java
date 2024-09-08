import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = sc.nextInt();

        // System.out.print("Enter the second number: ");
        // int second_number = sc.nextInt();

        int result = first_number >> 1;

        System.out.println("The bitwise right shift of first_number: " + result);
    }
}

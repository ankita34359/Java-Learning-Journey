import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = sc.nextInt();

        // System.out.print("Enter the second number: ");
        // int second_number = sc.nextInt();

        int result = first_number <<4;

        System.out.println("The bitwise left shift of first_number: " + result);
    }
}

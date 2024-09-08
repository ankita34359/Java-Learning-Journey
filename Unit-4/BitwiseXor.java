import java.util.Scanner;

public class BitwiseXor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second_number = sc.nextInt();

        int result = first_number ^ second_number;

        System.out.println("The bitwise XOR of first_number and Second_number: " + result);
    }

}



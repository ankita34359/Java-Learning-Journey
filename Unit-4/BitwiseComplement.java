import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = sc.nextInt();

        int result = ~(first_number) ;

        System.out.println("The bitwise compliment of first_number: " + result);


    }
}

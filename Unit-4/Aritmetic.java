import java.util.Scanner;

public class Aritmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("The addition of a and b: " + add);
        System.out.println("The substraction of a and b: " + sub);
        System.out.println("The multiply of a and b: " + mul);
        System.out.println("The division of a and b: " + div);
        System.out.println("The modulus of a and b: " + mod);
    }
}

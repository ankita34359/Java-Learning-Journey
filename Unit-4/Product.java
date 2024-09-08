import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of floating a: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of floating b: ");
        float b = sc.nextFloat();

        float product = a*b;

        System.out.println("The product of floating numbers a and b: " + product );
    }
    
}

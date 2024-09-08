import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of triangle: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height of triangle: ");
        float height = sc.nextFloat();

        float area = (1/2)*(base*height);

        System.out.println("The area of triangle: " + area);
    }
}

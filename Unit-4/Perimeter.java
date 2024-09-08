import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side A of rectangle: ");
        int A = sc.nextInt();

        System.out.print("Enter the side B of rectangle: ");
        int B = sc.nextInt();

        System.out.print("Enter the side C of rectangle: ");
        int C = sc.nextInt();

        System.out.print("Enter the side D of rectangle: ");
        int D = sc.nextInt();

        int perimeter = A+B+C+D;

        System.out.println("The perimeter of rectangle: " + perimeter);
    }
}

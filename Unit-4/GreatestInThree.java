import java.util.Scanner;

public class GreatestInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a: ");
        int a = sc.nextInt();

        System.out.print("Enter the b: ");
        int b = sc.nextInt();

        System.out.print("Enter the b: ");
        int c = sc.nextInt();


        if(a>b && a>c){
            System.out.println("Greatest number: " + a);
        }

        else if(b>a && b>c){
            System.out.println("Greatest number: " + b);
        }

        else{
            System.out.println("Greatest number: " + c);
        }
    }
}

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle value: ");
        float principle = sc.nextFloat();

        System.out.print("Enter the rate value: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the time value: ");
        float time = sc.nextFloat();

        float SI = (principle*rate*time)/100;

        System.out.println("The simple interest: " + SI);
    }
}

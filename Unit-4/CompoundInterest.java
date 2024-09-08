import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle value: ");
        float principle = sc.nextFloat();

        System.out.print("Enter the rate value: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the time value: ");
        float time = sc.nextFloat();

        float CI = principle*(1+(rate/100))*time ;

        System.out.println("The compound interest: " + CI);
    }
}

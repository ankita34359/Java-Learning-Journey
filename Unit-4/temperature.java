import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of fahrenheit: ");
        float fah = sc.nextFloat();

        float celcius = (fah-32)*5/9;

        System.out.println("The value in Celcius: " + celcius);
    }
}

import java.util.*;

public class sumOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Sum Of Even Numbers");
        System.out.print("Enter the number till you want sums: ");
        int num = sc.nextInt();

        int result = evenNum(num);
        System.out.println("The sum of even numbers till " + num + " is " + result);

    }

    public static int evenNum(int num){

        int i=2;
        int sum = 0;
        while (i<=num) {
            sum = sum + i;
            i = i+2;   
        }
        return sum;

    }
}

import java.util.Scanner;

public class sumOfOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want sum: ");
        int num = sc.nextInt();
        OddNum(num);
    }

    public static int OddNum(int num){
        int i=1;
        int sum = 0;
        while (i<=num) {
            sum = sum+i;
            System.out.println("The sum is: " + sum);
            i = i+2;
        }
        return 0;
    
        }
}


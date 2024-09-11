import java.util.Scanner;

public class sumOfOddNum {
    public static void main(String[] args) {
        OddNum();
    }

    public static void OddNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want sum: ");
        int num = sc.nextInt();
        int sum = 0;
        int i;

        while (num>=i && num%2!=0) {
            sum = num + sum;
            num++;
        }

    }
}

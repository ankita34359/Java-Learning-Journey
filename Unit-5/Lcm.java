import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Least Common Multiple");
        System.out.print("Enter the first number here: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number here: ");
        int secondNum = sc.nextInt();
        int lcm = lcm(firstNum, secondNum);
        System.out.println("The LCM of " + firstNum + " and " + secondNum + " is "  + lcm);
}

    public static int lcm(int firstNum, int secondNum){

        int i=1;

        while (true) {
            int factor = firstNum*i;
            if(factor % secondNum == 0){
                return factor;
            }
            i++;
            }
    }
}

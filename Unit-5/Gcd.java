import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Greatest Common Divisor");
        System.out.print("Enter the first number here: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number here: ");
        int secondNum = sc.nextInt();
        int gcd = gcd(firstNum, secondNum);

        System.out.println("The gcd of " + firstNum + " and " + secondNum + " is " + gcd);
    }

    // Finding gcd 

    public static int gcd(int firstNum, int secondNum){

        int gcd = 1;
        int i=2;
        int least = least(firstNum, secondNum);
        while (i<=least) {
            if (firstNum%i==0 && secondNum%i==0) {
                gcd = i;    
            }   
            i++; 
        }

        return gcd;
    }

    // Creating another function to find out the least number out of two number

    public static int least(int firstNum, int secondNum){

        if(firstNum<secondNum){
            return firstNum;
        }

        else{
            return secondNum;

        }
    }
}

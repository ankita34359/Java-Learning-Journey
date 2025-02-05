import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in finding prime number or not");
        System.out.print("Enter your number here: ");
        int number = sc.nextInt();

        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println("Prime Number");    
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }


    public static boolean isPrime(int number){

        int i = 2;
        while (i<number) {
            if (number%i==0){
                return false;      
            }
        i++;    
        }
        return true;
    }
}

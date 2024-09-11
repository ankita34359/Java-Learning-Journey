import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {


        // 1.) Print the number from 1 to 10 using while loop

        int num = 1;  // Initialization

        while (num <= 10) { // Condition

            System.out.println(num); // Code to be execute

            num = num + 1;  // Updating the condition
            
        }



        // 2.) Print the number that start from 500 and end at 200 in reverse order.

        int a = 500; // Initialization

        while (a>=200) { // Condition

            System.out.println(a);  // Code to be execute

            a -=1; // Updating the condition
            
        }


        // 3.) Take 5 time input from the user

        Scanner sc = new Scanner(System.in);

        int i = 0; // Initialization

        while (i<5) { // Condition

            System.out.print("Enter the number: "); // Code to be execute

            int b = sc.nextInt();

            System.out.println("The number is " + b);

            i++;  // Updating the condition
            
        }
    }
}

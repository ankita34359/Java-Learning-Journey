import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=60){
            System.out.println("Senior");
        }
        else if(age<60 && age>=20){
            System.out.println("Adult");
        }
        else if(age<20 && age>=13){
            System.out.println("Teenage");
        }
        else if(age<13){
            System.out.println("Child");
        }
    }
}

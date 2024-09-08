import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks>90){
              System.out.println("A grade");
        }

        else if(marks>75 && marks<90){
            System.out.println("B grade");
        }

        else if(marks>60 && marks<75){
            System.out.println("C grade");
        }

        else if(marks>30 && marks<60){
            System.out.println("D grade");
        }

        else if(marks<30){
            System.out.println("E grade");
        }


    }
}

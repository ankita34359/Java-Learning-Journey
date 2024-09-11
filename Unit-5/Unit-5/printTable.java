import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        table();
    }

    public static void table(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want to print table: ");
        int num = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num + "x" + i + "=" + num*i);
            i++;
        }
    }
}

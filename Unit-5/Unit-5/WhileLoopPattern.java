public class WhileLoopPattern {
    public static void main(String[] args) {

        RightHalfPyramid();
        
    }

    public static void RightHalfPyramid(){
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");

        // We will print it by using while loop

        int row = 0;
        while (row<5) { // Condition for rows
            System.out.print("*");
            int column = 0;
            while (column<row) { // Condition for columns
                System.out.print(" *");
                column++;   
            }
            System.out.println(); // Give space
            row++;
        }
    }
}

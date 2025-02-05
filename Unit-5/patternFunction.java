public class patternFunction {
    public static void main(String[] args) {

        //  Calling the function

        LeftHalfPyramid();
        RightHalfPyramid();
        RRightHalfPyramid();
    }

    public static void LeftHalfPyramid(){
        System.out.println("    *");
        System.out.println("   **");
        System.out.println("  ***");
        System.out.println(" ****");
        System.out.println("*****");
    }

    public static void RightHalfPyramid(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

    public static void RRightHalfPyramid(){
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}

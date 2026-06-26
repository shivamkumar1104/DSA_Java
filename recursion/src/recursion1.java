package recursion;
import java.util.*;

public class recursion1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a = ");
//        int a = sc.nextInt();
//        System.out.println("enter b: ");
//        int b = sc.nextInt();
//        System.out.println("power of" + a + "raised to the " + b + " is: " + index(a, b));


        int n = 6;
        System.out.println(stairs(n));

        }
 public static int stairs(int n){
        if(n <= 2) return n;
        return stairs(n-1) + stairs(n-2);
    }



}

//package recursion;
//import java.util.*;
//
//public class recursion1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter base (a): ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter exponent (b): ");
//        int b = sc.nextInt();
//
//        // Changed "pow" to "index" to match your method name below
//        System.out.println("Power of " + a + " raised to the " + b + " is: " + index(a, b));
//    } // Added missing closing brace for main method
//
//    public static int index(int a, int b) {
//        if (b == 0) return 1;
//        return a * index(a, b - 1); // Changed "pow" to "index" here too
//    }
//}
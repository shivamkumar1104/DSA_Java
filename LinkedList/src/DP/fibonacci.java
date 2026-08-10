import java.util.*;

public class fibonacci {
    public static int fib(int n){
        int prev = 1;
        int prev2 = 0;
        

        for(int i = 2; i<= n; i++){
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(fib(25554244));

    }
}



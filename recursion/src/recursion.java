public class recursion {
     public static void printNum(int n) {
        if (n == 0){
            return;

        }
        System.out.println(n);
        printNum(n-1);

    }

 public static int Tiling(int n){

    if(n == 0 || n == 1){
        return 1;
    }
    // verical
   int fnm1 = Tiling(n-1);

    // horizontal
    int fnm2 = Tiling(n-2);

    int totalWays  = fnm1 + fnm2;
    return totalWays;

 }

    public static void main(String[] args) {
        System.out.println(Tiling(4));
        // int n  = 20;
        // printNum(n);
    }}
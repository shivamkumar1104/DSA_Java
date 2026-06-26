import java.util.Arrays;

public class removeDuplicates {
    
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;

        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
        


        public static int friendPairing(int n){
            // choice
            // single
            if(n <= 2) return n;
            return friendPairing(n-1) + (n-1)*friendPairing(n-2);


        
    }

    public static void modifiedBubble(int arr[]){
        int n = arr.length;
    for (int i = 0; i<n-1; i++)
{   
    int swap = 0;
    for(int j = 0; j<n-i-1; j++){
        if(arr[j] > arr[j+1]){
            // swap
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            swap = 1;
        }
    }
    if(swap == 0){
        break;
    }
}
    }
    public static void main(String[] args) {
        int dataa[] = {43,564,4,346,2435};
        modifiedBubble(dataa);
       System.out.println("Sorted array: " + Arrays.toString(dataa));
        }
        // String str = "appnnacollege";
        // boolean map[] = new boolean[26];
        // removeDuplicates(str, 0, new StringBuilder(""), map);
        // System.out.println(friendPairing(3));
    }


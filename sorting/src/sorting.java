import java.util.*;

public class sorting {

////    public static void insertionSortAsc(Integer arr[]) {
////        for(int i = 1; i< arr.length; i++){
////            int curr  = arr[i];
////            int prev = i-1;
//////            finding out the correct position
////            while(prev >=0 && arr[prev] > curr){
////                arr[prev +1] = arr[prev];
////                prev--;
////
////            }
////            arr[prev+1] = curr;
////
////        }
////    }
////
//    public static void insertionSortDesc(Integer arr[]) {
//        for(int i = 1; i< arr.length; i++){
//            int curr  = arr[i];
//            int prev = i-1;
////            finding out the correct position
//            while(prev >=0 && arr[prev] < curr){
//                arr[prev +1] = arr[prev];
//                prev--;
//
//            }
//            arr[prev+1] = curr;
//
//        }
//    }


////counting sort
//public static void countingSort(int arr[]){
//    int largest = Integer.MIN_VALUE;
//    for(int i = 0; i<arr.length; i++){
//        largest = Math.max(largest, arr[i]);
//
//    }
//
//    int count[] = new int[largest+1];
//    for(int i = 0; i<arr.length; i++){
//        count[arr[i]]++;
//    }
//
////    sorting
//    int j = 0;
//    for(int i = 0; i<count.length; i++){
//        while(count[i] > 0) {
//            arr[j] = i;
//            j++;
//            count[i]--;
//        }
//    }
//
//}
//    public static void printArr(int arr[]) {
//        for (int i = 0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//
//        }
//        System.out.println();
//
//    }
//
//
//    public static void main(String[] args) {
//        int arr[] = {5,6,2,4,3};
//        Arrays.sort(arr,0, 5);
//
////        System.out.println("ascending: ");
////        insertionSortAsc(arr);
//        printArr(arr);
//
////        System.out.println("descending: ");
////        insertionSortDesc(arr);
////        printArr(arr);
//
//    }


//}
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }


        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArr(arr);
            }
}



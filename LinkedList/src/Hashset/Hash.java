import java.util.HashSet;
import java.util.Iterator;
public class Hash{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();  
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(3);

        // size
        System.out.println("size of set is " + set.size());
        System.out.println(set);
        // // search - "contain" use hota hai
        // if(set.contains(1)){
        //     System.out.println("set contains 1");

        // }if(!set.contains(5)){
        //     System.out.println("set does not contain 5");
        // }

        // //delete - "remove" use hota hai
        // set.remove(3);
        // if(set.contains(3));
        // {
        //     System.out.println("set does not contain 3");
        // }


        // Iterator
        Iterator it = set.iterator();
        //hasNext fn, next fn, remove fn
        while(it.hasNext()){
            System.out.println(it.next());
        }



        }
    }
   


import java.util.*;

public class Hash {
    public static void main(String[] args) {
        // ek key(string) hai aur uski value(integer) hai
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("hello", 1);
        map.put("hai", 2);
        map.put("hui", 3);
        System.out.println(map);


        map.put("hello", 4);
        System.out.println(map);


        //search
        if(map.containsKey("hello")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }
        //jb value nikalna ho tb
        System.out.println(map.get("hello"));

        int arr[] = {12,14,15};
        for(int i = 0;i<arr.length; i++){
            System.out.println(arr[i]);

        }
        for(int val : arr){
            System.out.println(val);

        }


        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
            //remove
            map.remove("hai");
            System.out.println(map);
            
    }  }



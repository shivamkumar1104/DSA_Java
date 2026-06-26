import java.util.*;
public class Hashing {
    static class HashMap<K, V>{  //generics
        private class Node{
             K key;
             V value;

             public Node(K key, V value){
                this.key = key;
                this.value = value;
             }
        }
        private int n; //n- nodes
        private int N; // N- buckets
        private LinkedList<Node> buckets[];  //N = n.length


        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.n = 0;
            this.buckets = new LinkedList[this.N];
            for(int i = 0; i < this.N; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i; //di
                }
            }
            return -1;
        }

        private void rehash (){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[2*N];
            N = 2*N;
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
            //nodes ko dubara add krna h
            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // data index  //di =-1
            if(di == -1){ //key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            }else{ //key exists
                Node data = buckets[bi].get(di);
                data.value = value;

            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

    }
    
    

    public static void main(String[] args) {
        
    }

    
}

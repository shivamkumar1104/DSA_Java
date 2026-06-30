public class problem {
    
    
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;

            }
            eow = false;

        }
    }

    public static void main(String[] args) {
        String s = "ababa";
        
        
    }

}
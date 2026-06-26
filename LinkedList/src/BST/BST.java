import java.util.*;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
// insert in bst or arrange order of a bst
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
        
        return root;
        }
        if(root.data> val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    // serach in a bst
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;

        }
        if(root.data > key){
            return search(root.left, key);

        }else{
            return search(root.right, key);
        }
    }
        //delete in a bst
        public static Node delete(Node root, int key){
            if(root == null){
                return null;
            }
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.data > key){
                root.left = delete(root.left, key);

            }else if(root.data < key){
                root.right = delete(root.right, key);
            }
            else{//root.data == key
                //case1
               if(root.left == null && root.right == null){
                return null;
            }
            //case2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
            public static Node inorderSuccessor(Node root){
                while(root.left != null){
                    root = root.left;
                }
                return root;
            }
            
        //print in range
        public static void range(Node root, int x, int y){
            if(root == null){
                return;
            }
            if(root.data >= x && root.data <= y){
                range(root.left, x, y);
                System.out.print(root.data + " ");
                range(root.right, x, y);
            }
            else if(root.data >= y){
                range(root.left, x, y);
            }else{
                range(root.right, x, y);
            }
            }
        
    // root to leaf paths
            public static void printPath(ArrayList<Integer> path){
                for(int i = 0; i < path.size(); i++){
                    System.out.print(path.get(i) + "->");
                }
                System.out.println();
            }
    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        // leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }else{ // non-leaf node
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }  
       path.remove(path.size() - 1);

    }
      public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        // inorder(root);
        // System.out.println();
        // if(search(root, 9 )){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }
        // delete(root, 2);
        // inorder(root);

        // range(root, 2, 5);
        rootToLeaf(root, new ArrayList<>());

        }
      }


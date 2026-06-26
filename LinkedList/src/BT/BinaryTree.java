import java.util.*;
public class BinaryTree{

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
    static class BinaryT{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    //preOrder subtree
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + "");
        preOrder(root.left);
        preOrder(root.right);
    }


    //inOrder subtree
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "");
        inOrder(root.right);
    }

    // postOrder subtree
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "");
    }

    // level order traversal
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
           Node currNode = q.remove();
              if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                } 
        }else{
            System.out.print(currNode.data + "");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);

            }
        
    }
}
}
// count of nodes in a  binary tree
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
}
     

// sum of nodes in a binary tree
public static int sumOfNodes(Node root){
    if(root == null){
        return 0;

    }
    int leftSum = sumOfNodes(root.left);
    int rightSum = sumOfNodes(root.right);
    return leftSum + rightSum + root.data;
}

// height of a binary tree
public static int height(Node root){
    if(root == null){
        return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
}

// diameter of a binary tree - O(n^2)
public static int diameterTree(Node root){
    if(root == null){
        return 0;
    }
    int leftDiameter = diameterTree(root.left);
    int rightDiameter = diameterTree(root.right);
    int diameter = height(root.left) + height(root.right);
    return Math.max(diameter, Math.max(leftDiameter, rightDiameter)) + 1;
    
}
// diameter of a binary tree - O(n)

static class TreeInfo{
    int ht;
    int diameter;

    TreeInfo(int ht, int diameter){
        this.ht = ht;
        this.diameter = diameter;
    }
}

public static TreeInfo diameter(Node root){
    if(root == null){
        return new TreeInfo(0, 0);
    }
    TreeInfo left = diameter(root.left);
    TreeInfo right = diameter(root.right);
    int myHeight = Math.max(left.ht, right.ht) + 1;

    int dia1 = left.diameter;
    int dia2 = right.diameter;
    int dia3 = left.ht + right.ht + 1;

    int myDiameter = Math.max(dia3, Math.max(dia1, dia2));
    TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
    return myInfo;

}
// subtree of another tree
public static boolean isIdentical(Node root, Node subRoot){
    if(root == null && subRoot == null){
        return true;
    }
    if(root == null || subRoot == null){
        return false;
    }
    if(root.data == subRoot.data){
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
    return false;
}
public static boolean isSubTree(Node root, Node subRoot){
    if(subRoot == null){
        return true; 
}
    if(root == null){
        return false;
}
    if(root.data == subRoot.data){
        if(isIdentical(root, subRoot)){
            return true;
    }   
}
    return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
}
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryT  tree = new BinaryT();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data); 
        // preOrder(root);
        // System.out.println(root.data);
        // inOrder(root);
        // System.out.println(root.data);
        // postOrder(root);
        // System.out.println(root.data);
        // levelOrder(root);
        // System.out.println(countOfNodes(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameterTree(root));
        System.out.println(diameter(root).diameter);
    }
}
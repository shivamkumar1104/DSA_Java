import java.util.*;

public class LL {

    class Node {
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
        }
    }
    
    // for a linked list that has simple sequence
    Node head;
    Node tail;

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
    
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    
    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); // Added "null" so it looks complete when printed
    }

    public void ReverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        tail = head; // It's a good practice to update your tail pointer when reversing!
        head = prevNode;
    }

    public static void main(String[] args) {
        
        // 1. Using Java's built-in Collection Framework
//        System.out.println("--- Built-in java.util.LinkedList ---");
//        LinkedList<String> list = new LinkedList<String>();
//
//        list.addFirst("a");
//        list.addFirst("is");
//        System.out.println(list);
//        list.addLast("list");
//        System.out.println(list);
//        list.addFirst("this");
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        for(int i = 0; i < list.size(); i++){
//            System.out.print(list.get(i) + " -> ");
//        }
//        System.out.println("null");
        
        // Error fix: You cannot call your custom ReverseIterate() on Java's built-in list.
        // Instead, use the Collections framework to reverse it.
//        Collections.reverse(list);
//        System.out.println(list);
//
        
        // 2. Testing your custom LL class (with integers)
        System.out.println("\n--- Your Custom LL Class ---");
        LL customList = new LL();
        customList.addAtHead(2);
        customList.addAtHead(1);   // List is now 1 -> 2
        customList.addAtTail(3);   // List is now 1 -> 2 -> 3
        
        System.out.print("Original: ");
        customList.display();
        
        // Now you can call your custom method!
        customList.ReverseIterate();
        
        System.out.print("Reversed: ");
        customList.display();
    }
}
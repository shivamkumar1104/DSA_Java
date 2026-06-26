import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class MyQueue{
    // static class queue{
        //queue using array
        // static int arr[];
        // static int size; 
        // static int rear = -1;
        // queue(int n){
        //     arr = new int[n];
        //     this.size = n;
            
        // }
        // public static boolean isEmpty(){
        //     return rear == -1;

        // }
        // public static void add(int data){
        //     if(rear == size-1){
        //         System.out.println("full queue");
        //         return;
        //     }
        //     rear++;
        //     arr[rear] = data;
        // }

        // // dequeue
        // public static int remove(){
        //     if(isEmpty()){
        //         System.out.println("empty queue");
        //         return -1;
        //     }

        //     int front = arr[0];
        //     for(int i = 0; i<rear; i++){
        //         arr[i] = arr[i+1];
        //     }
        //     rear--;
        //     return front;
            
        // }
        // //peak
        // public static int peek(){
        //      if(isEmpty()){
        //         System.out.println("empty queue");
        //         return -1;
        //     }

        //     return arr[0];
            
        // }
    // }

        //queue using circular array
    //     static int arr[];
    //     static int size; 
    //     static int rear = -1;
    //     static int front = -1;
        
    //     queue(int n){
    //         arr = new int[n];
    //         this.size = n;
            
    //     }
    //     public static boolean isEmpty(){
    //         return rear == -1 && front == -1;


    //     }
    //     public static boolean isfull(){
    //         return (rear+1)%size == front;
    //     }
    //     public static void add(int data){
    //         if(isfull())
    //         {
    //             System.out.println("full queue");
    //             return;
    //         }
    //         //1st element add
    //         if(front == -1){
    //             front = 0;
    //         }
    //         rear = (rear+1)%size;
    //         arr[rear] = data;
    //     }

    //     // dequeue
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }

    //         int result = arr[front];
    //         if(rear == front){
    //             rear = front = -1;
    //         }else{

            
    //         front = (front+1)%size;
    //         }
    //         return result;
            
    //     }
    //     //peak
    //     public static int peek(){
    //          if(isEmpty()){
    //             System.out.println("empty queue");
    //             return -1;
    //         }

    //         return arr[front];
            
        // }



    // }

static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
    static class queue{
        static Node head = null;
        static Node tail = null;

           public static boolean isEmpty(){
            return head == null && tail == null;
}

        
        public static void add(int data){
            Node newNode = new Node(data);
            
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
          
        // dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;

            }
            head = head.next;
            return front;
        }
        //peak
        public static int peek(){
             if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
            
        }



    }
    public static void main(String[] args) {
        // queue q = new queue();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }  
    }
    }
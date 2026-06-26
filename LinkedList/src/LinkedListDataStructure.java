class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{

    Node head;
    Node tail;
    int size;
    int  search(int val) {
        if (head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){

        if(tail == null) {
            addAtHead(val);
            return;
        }
        Node temp = new Node(val);
            tail.next = temp;
            tail = temp;
            size++;

    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        head = head.next;
        if(head == null) tail = null;
        size--;

    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for(int i = 0; i< idx; i++){
            temp = temp.next;

        }
        return temp.val;
    }
    void insert(int val, int idx){
        if(idx< 0 || idx> size){
            System.out.println("Invalid index");
            return;
        }
        if(idx == 0) addAtHead(val);
        else if(idx == size) addAtTail(val);
        else{
            Node temp = head;
            for(int i = 0; i< idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;

            }
        }
        void delete(int idx){
        if(idx<0 || idx>= size){
            System.out.println("Invalid index");
            return;
        }
        if(idx == 0){
            deleteAtHead();
            return;
        }
            Node temp = head;
            for(int i = 0; i< idx - 1; i++){
                temp = temp.next;

            }
            temp.next = temp.next.next; // delete
            if(idx == size-1) tail = temp; //we are deleting tail
            size--;
        }
    }
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);

        ll.addAtTail(40); ll.display();
        ll.addAtHead(50); ll.display();

        ll.deleteAtHead(); ll.display();
        ll.deleteAtHead(); ll.display();
        System.out.println(ll.size);
        ll.insert(60,1); ll.display();
        System.out.println(ll.get(1));
        ll.delete(2); ll.display();
    }

}

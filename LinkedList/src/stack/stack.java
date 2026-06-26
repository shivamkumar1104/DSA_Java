
import java.util.*;
public class stack {
//     // } 

    // static class Stack{
    //    static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size() == 0;

    //     }
    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size() -1);
    //         list.remove(list.size() -1);
    //         return top;
    //     }

    //     // peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size() -1);
    //     }

public static void pushAtBottom(int data, Stack<Integer> st){
    if(st.isEmpty()){
        st.push(data);
        return;
    }
    int top = st.pop();
    pushAtBottom(data, st);
    st.push(top);

}


public static void reverse(Stack<Integer> st){
    if(st.isEmpty()){
        return;
    }
    int top = st.pop();
    reverse(st);
    pushAtBottom(top, st);
}

public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    reverse(st);
    while(!st.isEmpty()){
        System.out.println(st.peek());
        st.pop();
    }
}
}

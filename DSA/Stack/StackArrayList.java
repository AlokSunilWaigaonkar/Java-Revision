
import java.util.ArrayList;



public class StackArrayList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        
    }
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public  boolean isEmpty(){
            return list.isEmpty();
        }

        public  void push(int data){
            list.add(data);
        }
        public  int pop(){
            int value = list.get(list.size()-1);
            list.remove(list.size()-1);
            return value;
        }

        public  int peek(){
            return list.get(list.size()-1);
        }

        
    }
        static class StackL{
            static Node  head = null;

            public  boolean isEmpty(){
                return head == null;
            } 
            public void push(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                }
                else{
                    newNode.next = head;
                    head = newNode;
                }
                
            }

            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                return top;
            }
        }
    public static void main(String[] args) {
        StackL sl = new StackL();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        System.out.println("Stack LL implementation");
        while(!sl.isEmpty()){
            System.out.println(sl.peek());
            sl.pop();
        }
    }
}

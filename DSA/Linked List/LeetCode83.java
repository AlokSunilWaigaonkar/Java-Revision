public class LeetCode83 {
    
        public static class Node{
            int data;
            Node next;
    
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node headNode;
        public static Node tailNode;
        public static int size;
    
        public void addFirstNode(int data){
            Node newNode = new Node(data);
            if(headNode == null){
                headNode = tailNode = newNode;
                size=1;
                return;
            }
            newNode.next = headNode;
            headNode = newNode;
            size++;
        }
    
        public void addTailNode(int data){
            Node newNode = new Node(data);
            if(headNode == null){
                headNode = tailNode = newNode;
                size =1;
                return;
            }
            tailNode.next = newNode;
            tailNode = newNode;
            size++;
        }
        public void removeDuplicate(Node headNode){
            Node curr = headNode;
            while(curr!=null &&  curr.next !=null){
                if(curr.data == curr.next.data){
                    System.out.print(curr.data+ " ");
                    curr.next = curr.next.next;
                }
                else{
                    curr = curr.next;
                }
                
            }
        }
        public void printll(){
            Node temp = headNode;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp= temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
        public static void main(String[] args) {
            LeetCode83 ll = new LeetCode83();
            ll.addFirstNode(3);
            ll.addFirstNode(3);
            ll.addFirstNode(2);
            ll.addFirstNode(1);
            ll.addFirstNode(1);
            ll.printll();
            ll.removeDuplicate(headNode);
            ll.printll();
        }
}

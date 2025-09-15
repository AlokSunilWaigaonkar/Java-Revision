

public class LinkedList {
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

    public void add(int index , int data){
        Node newNode = new Node(data);
        if(headNode == null){
            headNode = tailNode = newNode;
            size = 1;
        }
        Node temp = headNode;
        for(int i =0;i<index-1;i++){
            temp =temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void printLL(){
        Node temp = headNode;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
            
        }
        System.out.print("null");
        System.out.println();

    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int value = headNode.data;
            headNode = tailNode = null;
            size=0;
            return value;
        }
        int value = headNode.data;
        headNode = headNode.next;
        size--;
        return value;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int value = headNode.data;
            headNode = tailNode = null;
            size=0;
            return value;
        }
        Node temp = headNode;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next =null;
        tailNode = temp;
        size--;
        return value;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addTailNode(1);
        ll.addTailNode(2);
        ll.addTailNode(3);
        ll.addTailNode(4);
        ll.addTailNode(5);
        ll.printLL();
    }
}

    

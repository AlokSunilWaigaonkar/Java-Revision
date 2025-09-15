

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

    public int recursiveSearch(int key){
        int i=0;
        Node tempNode = headNode;
        return searchHelper(key,i,tempNode);
        
    }
    public int searchHelper(int key ,int index,Node tempNode){
        if(tempNode.data == key){
            return index;
        }
        else if(tempNode.next == null){
            return -1;
        }
        return searchHelper(key, index+1, tempNode.next);
    }
    public int searchHelper(Node heaNode,int key){
        if(headNode == null){
            return -1;
        }
        if(headNode.data == key){
            return 0;
        }
        int idx = searchHelper(heaNode.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
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

    public int itrSearch(int key){
        Node tempNode = headNode;
        int i=0;
        while(tempNode!=null){
            if(tempNode.data == key){
                return i;
            }
            tempNode = tempNode.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = tailNode = headNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        headNode = prev;
    }

    public int deleteNodeFromEnd(int index){
        Node temp = headNode;
        int sz=0;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(sz == index){
            int value = headNode.data;
            headNode=headNode.next;
            return value;
        }

        int i =1;
        int iToFind = sz-index;
        Node prev = headNode;
        
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        
        int value = prev.next.data;
        prev.next = prev.next.next;
        return  value;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addTailNode(1);
        ll.addTailNode(2);
        ll.addTailNode(3);
        ll.addTailNode(4);
        ll.addTailNode(5);
        ll.printLL();
        // ll.reverse();
        // ll.printLL();
        ll.deleteNodeFromEnd(3);
        ll.printLL();
    }
}

    

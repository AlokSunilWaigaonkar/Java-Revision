

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

    public boolean isPalindrome(){
        if(headNode == null || headNode.next == null){
            return true;
        }
        //find mid 
        Node mid = findMid(headNode);
        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr= next;
        }
        Node right = prev;
        Node left = headNode;
        // compare left half and right half
        while(right!=null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void removeCylce(){
        // detect cycle
        boolean isCycle = false;
        Node slow = headNode;
        Node fast = headNode;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle ==false){
            return;
        }

        // Find their meeting point;
        slow = headNode;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle 
        fast.next= null;
    }

    // slow fast approach
    public Node findMid(Node heaNode){
        Node slow = heaNode;
        Node fast = headNode;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static boolean isCycle(){
        Node slow = headNode;
        Node fast = headNode;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
    }

    private Node getMid(Node headNode){
        Node slow = headNode;
        Node fast = headNode.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next =head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node headNode){
        if(headNode == null || headNode.next == null){
            return headNode;
        }
        //find mid 
        Node mid = getMid(headNode);
        //left half and right half merge
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(headNode);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);
    }

    public void zigzagLL(Node headNode){
        //find middle node 
        Node midNode = getMid(headNode);
        //reverse the 2nd half
        Node rightNode = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node curr = rightNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        rightNode = prev;

        // Alternate merging
        Node LH = headNode;
        Node RH = rightNode;
        Node nextL,nextR;
        while(LH!=null && RH!=null){
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;
            RH = nextR;
            LH = nextL;
        };
    }
    public int removeElements(Node head, int val) {
        Node temp = head;
        int count=0; 
        while(temp.next!=null){
            if(temp.next.data == val){
                temp.next = temp.next.next;
                count++;
            }else{
                temp = temp.next;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirstNode(4);
        ll.addTailNode(2);
        ll.addFirstNode(2);
        ll.addFirstNode(8);
        ll.addFirstNode(4);
        ll.addFirstNode(2);
        ll.addFirstNode(3);
        ll.printLL();
        ll.removeElements(headNode, 2);
        ll.printLL();
    }
}

    

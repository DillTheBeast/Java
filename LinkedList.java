public class LinkedList {

    //Stack = Last on First off
    //Queue = First on First off
    Node head;
    Node curr;
    Node placeHolder;

    

    public LinkedList(Node first) {
        this.head = first;
        curr = head;

    }

    public void printList() {
        curr = head;
        while(curr.next != null) {
            System.out.println(curr);
            curr = curr.next;
        }
        System.out.println(curr);
    }

    public void add(Node newNode, int targetIDX) {
        curr = head;
        int currIDX = 0;
        while(currIDX < targetIDX - 1) {
            curr = curr.next;
            currIDX++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }
    
    public void delete(int targetIDX) {
        curr = head;
        Node placeHolder;
        int currIDX = 0;
        while(currIDX < targetIDX - 1) {
            curr = curr.next;
            currIDX++;
        }
        placeHolder = curr.next.next;
        curr.next.next = null;
        curr.next = placeHolder;
    }

    public void append(Node newNode) {
        curr = head;
        
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public boolean spotChecker(int targetIDX) {
        curr = head;
        int currIDX = 0;
        while(currIDX < targetIDX - 1) {
            curr = curr.next;
            currIDX++;
        }
        if(curr.next != null) {
            return false;
        }
        return true;
    }

    public void stack() {
        curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr = null;
    }

    public void queue() {
        curr = head;
        head = curr.next;
        placeHolder = curr.next;
        curr.next = null;
        curr.next.next = placeHolder;
    }
}
public class LinkedList {
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
        while(currIDX < targetIDX -1 ) {
            curr = curr.next;
            currIDX++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }
    
    public void delete(Node deleteNode, int targetIDX) {
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
}
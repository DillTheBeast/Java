public class LinkedList {
    Node head;
    Node curr;
    Node placeHolder;

    public LinkedList(Node first) {
        this.head = first;
        curr = head;

    }

    public void printList() {
        while(curr.next != null) {
            System.out.println(curr);
        }
    }

    public void add(Node newNode, int targetIDX) {
        int currIDX = 0;
        while(currIDX < targetIDX) {
            curr = curr.next;
            currIDX++;
        }
        curr = head;
        newNode.next = curr.next;
        curr = newNode;
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
}
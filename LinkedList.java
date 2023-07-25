public class LinkedList {
    Node head;
    Node curr;
    Node placeHolder;

    public LinkedList(Node first) {
        this.head = first;
        curr = head;

    }

    public void add(Node newNode, int targetIDX) {
        curr = head;
        int currIDX = 0;
        while(currIDX < targetIDX) {
            curr = curr.next;
            currIDX++;
        }
        newNode.next = curr.next;
        curr = newNode;
    }
    
    public void delete(Node deleteNode, int targetIDX) {
        curr = head;
        int currIDX = 0;
        while(currIDX < targetIDX - 1) {
            curr = curr.next;
            currIDX++;
        }
        curr.next = curr.next.next;

    }
}
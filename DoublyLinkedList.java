public class DoublyLinkedList {
    Node head;
    Node curr;
    Node placeHolder;

    public DoublyLinkedList(Node first) {
        this.head = first;
        curr = head;
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
        curr = curr.next.next;
        curr.back = newNode;
    }

    public void delete(Node deleteNode, int targetIDX) {
        curr = head;
        Node placeHolderF;
        Node placeHolderB;
        int currIDX = 0;
        while(currIDX < targetIDX - 1) {
            curr = curr.next;
            currIDX++;
        }
        placeHolderF = curr.next.next;
        curr.next.next = null;
        curr.next = placeHolderF;

        curr = curr.next;
        placeHolderB = curr.back.back;
        curr.back.back = null;
        curr.back = placeHolderB;
    }
}

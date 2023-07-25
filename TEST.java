import java.util.ArrayList;
import java.util.Scanner;

public class TEST {
  public static void main(String[] args) {
    LinkedList myList = new LinkedList(new Node(4));
    myList.add(new Node(5), 1);
    myList.add(new Node(3), 1);
    myList.add(new Node(2), 1);
    myList.append(new Node(7));

    myList.printList();
    }
}

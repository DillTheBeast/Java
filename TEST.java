import java.util.ArrayList;
import java.util.Scanner;

//Uses LinkedList and Node
public class TEST {
  public static void main(String[] args) {
    /*
    LinkedList myList = new LinkedList(new Node(1));
    myList.add(new Node(4), 1);
    myList.add(new Node(3), 1);
    myList.add(new Node(2), 1);
    myList.append(new Node(5));

    myList.printList();
    */
    //Only will work if value in Node is changed back to int

    /* 
    Queue queue = new Queue(3);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(2);
    queue.printQueue();
    System.out.println();
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(5);
    queue.printQueue();
    */
    /*
    Stack stack = new Stack(3);
    stack.push(3);
    stack.push(4);
    stack.push(2);
    stack.pop();
    stack.push(5);
    int thing = stack.peak();
    stack.printStack();
    
    System.out.println("thing " + thing);
    
    //correct exception thrown
    //stack.push(3);
    //stack.pop();

    // System.out.println("top element: " + stack.peak());
    // stack.pop();
    // System.out.println("Top element: " + stack.peak());
    */

    BinarySearchTree tree = new BinarySearchTree();

    tree.add(new BinaryNode(5), tree.rootNode);
    tree.add(new BinaryNode(3), tree.rootNode);
    tree.add(new BinaryNode(8), tree.rootNode);
    tree.add(new BinaryNode(7), tree.rootNode);
    tree.add(new BinaryNode(9), tree.rootNode);
    tree.add(new BinaryNode(4), tree.rootNode);
    tree.add(new BinaryNode(2), tree.rootNode);
    System.out.println();
    tree.printTree(tree.rootNode);
    System.out.println();
    tree.remove(2, tree.rootNode);
    System.out.println();
    tree.printTree(tree.rootNode);
    }
}

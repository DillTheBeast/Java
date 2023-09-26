import java.util.ArrayList;
import java.util.Scanner;

//Uses LinkedList and Node
public class DataStructureTest {
  public static void main(String[] args) {
    /* 
    LinkedList myList = new LinkedList(new Node(1));
    myList.add(new Node(4), 1);
    myList.add(new Node(3), 1);
    myList.add(new Node(2), 1);
    myList.append(new Node(5));
    myList.delete(2);

    myList.printList();
    */
    //Only will work if value in Node is changed back to int

     
    Queue queue = new Queue(3);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(2);
    queue.printQueue();
    System.out.println();
    queue.dequeue();
    queue.dequeue();
    int removed = queue.dequeue();
    System.out.println("Removed Number " + removed);
    queue.enqueue(5);
    queue.printQueue();
    
    /*
    Stack stack = new Stack(3);
    stack.push(3);
    stack.push(4);
    stack.push(2);
    stack.pop();
    stack.push(5);
    int top = stack.peak();
    stack.printStack();
    
    System.out.println("Top " + top);
    
    //correct exception thrown
    //stack.push(3);
    //stack.pop();

    // System.out.println("top element: " + stack.peak());
    // stack.pop();
    // System.out.println("Top element: " + stack.peak());
    */
/*
    BinarySearchTree tree = new BinarySearchTree();
    //BinaryNode test = new BinaryNode();

    tree.add(5, tree.rootNode);
    tree.add(4, tree.rootNode);
    tree.add(4, tree.rootNode);
    tree.add(2, tree.rootNode);
    tree.add(8, tree.rootNode);
    tree.add(9, tree.rootNode);

    
    //System.out.println();
    tree.printTree(tree.rootNode);
    //System.out.println();
    tree.remove(tree.rootNode, 2);
    tree.remove(tree.rootNode, 8);
    System.out.println();
    tree.printTree(tree.rootNode);
    */
    }
}

public class Node {
    int value;
    Node next;
    Node back;

    public Node(int value){
        this.value = value;
    }
    

    public String toString(){
        return String.valueOf(value);
    }

}
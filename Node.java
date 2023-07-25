public class Node {
    String value;
    Node next;

    public Node(String value){
        this.value = value;
    }
    

    public String toString(){
        return String.valueOf(value);
    }

}
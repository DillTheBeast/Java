public class Queue {
    int[] queue;
    int size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
    }

    public void enqueue(int addNum) {
        if(queue[size] != 0)
        throw new IllegalStateException("The queue is already full");
    }

    public void dequeue() {

    }

    public void peek() {

    }

    public void poll() {

    }
}

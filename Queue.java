public class Queue {
    int[] queue;
    int size;
    int sizeCount = 0;
    int placeHolder;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
    }

    public void printQueue() {
        for(int i = 0; i < sizeCount; i++) {
            System.out.println(queue[i]);
        }
    }

    public void enqueue(int addNum) {
        if(sizeCount == size) {
            throw new IllegalStateException("The queue is already full");
        }
        queue[sizeCount] = addNum;
        sizeCount++;
    }

    public int dequeue() {
        if(sizeCount == 0) {
            throw new IllegalStateException("There is no queue");
        }
        placeHolder = queue[0];
        for(int i = 1; i < sizeCount; i++) {
            queue[i-1] = queue[i];
        }
        sizeCount--;
        return placeHolder;
    }

    public Integer peek() {
        if(sizeCount == 0) {
            return null;
        }
        return queue[0];
    }

    public Integer poll() {
        if(sizeCount == 0) {
            return null;
        }
        return dequeue();
    }
}

public class Stack {
    int[] stack;
    int size;
    int sizeCount;
    int placeHolder;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        sizeCount = 0;
    }

    public void printStack() {
        for(int i = sizeCount; i > 0; i--) {
            System.out.println(stack[i - 1]);
        }
    }

    public void push(int addNum) {
        if(sizeCount == size) {
            throw new IllegalStateException("The stack is already full");
        }
        stack[sizeCount] = addNum;
        sizeCount++;
    }

    public int pop() {
        if(sizeCount == 0) {
            throw new IllegalStateException("There is no items in the stack");
        }
        sizeCount--;
        placeHolder = stack[sizeCount];
        stack[sizeCount] = 0;
        return placeHolder;
    }

    public Integer peak() {
        if(sizeCount == 0) {
            return null;
        }
        return stack[sizeCount-1];
    }
}

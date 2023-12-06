public class Stack {

    // Don't need to be final
    private final int[] arr;
    private final int size;
    private int topElement;

    // Constructor
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        topElement = -1;
    }

    // Add new element to stack
    public void push(int element) {
        // Check if stack is full
        if(!isFull()) {
            arr[++topElement] = element;
        } else {
            System.out.println("Stack ist voll");
        }
    }

    // Remove element from stack
    public void pop() {
        // Check if stack is empty
        if(!isEmpty()) {
            topElement--;
        } else {
            System.out.println("Stack ist leer");
        }
    }

    public boolean isEmpty() {
        return topElement <= -1;
    }

    public boolean isFull() {
        return topElement == size-1;
    }

    public int showTop() {
        if(isEmpty()) {
            return -1;
        } else {
            return arr[topElement];
        }
    }
}

package Review5;

public class StackUsingArray {
    int arr[];
    int top;
    int size;

    public StackUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // push
    void push(int data) {

        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;

        }
        top++;
        arr[top] = data;
    }

    // pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    // peek
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // isEmpty
    boolean isEmpty() {
        return top == -1;
    }

    // isFull
    boolean isFull() {
        return top == size - 1;
    }// display

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

class Main {

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
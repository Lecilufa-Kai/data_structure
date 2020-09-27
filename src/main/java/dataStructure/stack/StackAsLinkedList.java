package dataStructure.stack;

public class StackAsLinkedList {

    StackNode top;

    static class StackNode {
        int data;
        StackNode previous;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public synchronized void push(int data) {
        StackNode newNode = new StackNode(data);

        if (top == null) {
            top = newNode;
        } else {
            StackNode previousNode = top;
            top = newNode;
            newNode.previous = previousNode;
        }
        System.out.println(data + " pushed to stack");

    }

    public synchronized Integer pop() {
        Integer popped = null;

        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = top.data;
            top = top.previous;
        }

        return popped;
    }

    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println("\n************************\n");

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
    }
}

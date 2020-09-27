package dataStructure.queue;

public class QueueAsLinkedList {

    QueueNode top;
    QueueNode bottom;

    static class QueueNode {
        int data;
        QueueNode up;

        QueueNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return bottom == null;
    }

    public synchronized void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);


        if (top == null) {
            top = newNode;
            bottom = newNode;
        } else {
            QueueNode secondTop = top;
            secondTop.up = newNode;
            top = newNode;
        }
        System.out.println(data + " pushed to Queue");


    }

    public synchronized Integer dequeue() {
        Integer popped = null;

        if (bottom != null) {
            popped = bottom.data;
            bottom = bottom.up;
        }

        return popped;
    }

    public static void main(String[] args) {

        QueueAsLinkedList sll = new QueueAsLinkedList();

        sll.enqueue(10);
        sll.enqueue(20);
        sll.enqueue(30);

        System.out.println("\n************************\n");

        System.out.println(sll.dequeue() + " popped from Queue");
        System.out.println(sll.dequeue() + " popped from Queue");
        System.out.println(sll.dequeue() + " popped from Queue");
        System.out.println(sll.dequeue() + " popped from Queue");
        System.out.println(sll.dequeue() + " popped from Queue");

    }
}

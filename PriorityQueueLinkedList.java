public class PriorityQueueLinkedList {
    public class Node {
        Node next;
        int data;
        int priority;

        public Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    Node front;
    Node rear;

    public PriorityQueueLinkedList() {
        front = null;
        rear = null;
    }

    public void enqueue(int data, int priority) {
        Node newnode = new Node(data, priority);
        if (front == null || newnode.priority < front.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            Node temp = front;
            while (temp.next != null && temp.next.priority <= newnode.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + " " + temp.priority);
            temp = temp.next;
        }
    }

}

class Main {
    public static void main(String[] args) {
        PriorityQueueLinkedList obj = new PriorityQueueLinkedList();
        obj.enqueue(20, 1);
        obj.enqueue(15, 3);
        obj.enqueue(9, 1);
        obj.display();
    }
}
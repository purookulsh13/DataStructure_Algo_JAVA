
public class Singly_CircularLinkedList {
    Node head;
    Node tail;

    public Singly_CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = head;
        }
    }

    public void insert_atBeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            newnode.next = head;
        }
        Node temp = head;
        newnode.next = temp;
        head = newnode;
        tail.next = head;
    }

    public void insert_atEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            newnode.next = head;
        } else {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }

    }

    public void delete_atBeg() {
        if (head == null && tail == null) {
            System.out.println("CircularLinkedList is Empty");
        }
        head = head.next;
        tail.next = head;

    }

    public void delete_atEnd() {
        if (head == null && tail == null) {
            System.out.println("CircularLinkedList is Empty");
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node temp = head;
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }

}

class Main {
    public static void main(String args[]) {
        Singly_CircularLinkedList cl = new Singly_CircularLinkedList();
        cl.insert_atBeg(1);
        cl.insert_atBeg(100);
        cl.insert_atBeg(2);
        cl.insert_atBeg(3);
        cl.insert_atEnd(9);
        cl.insert_atEnd(8);
        cl.delete_atBeg();
        cl.delete_atEnd();
        cl.delete_atEnd();
        cl.display();
    }
}
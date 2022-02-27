public class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insert_atBeg(int data) {

        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

    }

    public void insert_atEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void delete_atBeg() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void delete_atEnd() {
        Node temp = head;

        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        } else if (temp.next == null) {
            temp = temp.next;
            temp.next = null;
            return;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

}

class Main {
    public static void main(String args[]) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert_atBeg(2);
        list.insert_atBeg(4);
        list.insert_atBeg(6);
        list.insert_atBeg(8);
        // list.display();
        list.insert_atEnd(9);
        list.insert_atEnd(3);
        // list.display();
        list.delete_atBeg();
        list.delete_atBeg();
        list.delete_atEnd();
        list.display();

    }
}
class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
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
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class Main {
    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.insert_atBeg(2);
        l.insert_atBeg(4);
        l.insert_atBeg(6);
        l.insert_atBeg(8);
        l.insert_atEnd(9);
        l.insert_atEnd(3);
        // l.display();
        // l.delete_atBeg();
        l.delete_atBeg();
        l.delete_atEnd();
        l.display();

    }
}
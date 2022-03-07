// import java.util.*;
// import java.lang.*;

class Stack_01 {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 3, 2, 7, 4 };
        int n = arr.length;

        stack obj1 = new stack();

        int a_max = Integer.MAX_VALUE;
        int b_max = Integer.MIN_VALUE;
        int a_min = Integer.MAX_VALUE;
        int b_min = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] * arr[j] > a_max * b_max) {
                    a_max = arr[i];
                    b_max = arr[j];
                }
        obj1.push(a_max, b_max);

        for (int i = 10; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < a_min) {
                    b_min = a_min;
                    a_min = arr[i];
                }
            }
        obj1.push(a_min, b_min);

        obj1.display();

    }
}

class stack {
    class NodeS {
        int data1;
        int data2;
        NodeS next;

    }

    NodeS top;

    stack() {
        this.top = null;
    }

    public void push(int data1, int data2) {
        NodeS temp = new NodeS();
        // if (temp == null) {
        // System.out.println("Stack is Overflow");
        // return;
        // }
        temp.data1 = data1;
        temp.data2 = data2;
        temp.next = top;
        top = temp;
    }

    public void display() {
        if (top == null)
            System.out.println("Stack is Empty");
        else {
            NodeS temp = top;
            while (temp != null) {
                System.out.println(temp.data1 + " " + temp.data2);
                temp = temp.next;
            }
        }
    }
}

/*
Print ith Node

For a given a singly linked list of integers and a position 'i', 
print the node data at the 'i-th' position.
Note :
Assume that the Indexing for the singly linked list always starts from 0.

If the given position 'i',  is greater than the length of the given singly linked list, 
then don't print anything.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list 
separated by a single space.

The second line contains the value of 'i'. It denotes the position in the given singly linked list.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list 
and hence, would never be a list element.
Output format :
For each test case, print the node data at the 'i-th' position of the linked list(if exists).

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
i  >= 0
Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
2
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
9 8 4 0 7 8 -1
3
Sample Output 2 :
3
0

*/
public class FindNode_LL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public FindNode_LL() {
        this.head = null;
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void FindiNode(int k) {
        int n = 0;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            n++;
        }
        temp = head;
        if (n >= k) {
            for (n = 0; n < k; n++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

}

class Main {
    public static void main(String args[]) {
        FindNode_LL fl = new FindNode_LL();
        fl.insert(2);
        fl.insert(5);
        fl.insert(6);
        fl.insert(10);
        fl.insert(9);
        fl.insert(11);
        fl.insert(26);
        int i = 0;
        fl.FindiNode(i);
    }
}

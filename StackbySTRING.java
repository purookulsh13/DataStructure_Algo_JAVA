import java.util.*;

class StackbySTRING {
    public static String reverse(String str) {
        if (str == null) {
            return str;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }
        int k = 0;
        while (!stack.isEmpty()) {
            ch[k++] = stack.pop();
        }

        return String.copyValueOf(ch);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        stack obj1 = new stack();
        int n = s.nextInt();
        try {
            while (n != 0) {
                String str = s.next();
                String sub = str.substring(0, 1);
                String rem = str.substring(1);
                String temp = reverse(rem);
                sub = sub + temp;

                obj1.push(sub);
                n--;
            }
            obj1.display();
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
        s.close();
    }

}

class stack_13 {
    class NodeS {
        String Name;
        NodeS next;

    }

    NodeS top;

    stack() {
        this.top = null;
    }

    public void push(String Name) {
        NodeS temp = new NodeS();
        temp.Name = Name;
        temp.next = top;
        top = temp;
    }

    public void display() {
        if (top == null)
            System.out.println("Stack is Empty");
        else {
            NodeS temp = top;
            while (temp != null) {
                System.out.println("Inside the Stack : " + temp.Name);
                temp = temp.next;
            }
        }
    }
}

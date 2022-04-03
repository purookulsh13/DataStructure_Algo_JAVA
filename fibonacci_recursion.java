public class fibonacci_recursion {
    static int x = 0, y = 1, count = 0;

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }

    private static void printFibonacci(int n) {
        System.out.print(x + ", ");
        int temp = y;
        y = x + y;
        x = temp;
        if (++count == n)
            return;
        printFibonacci(n);
    }

}

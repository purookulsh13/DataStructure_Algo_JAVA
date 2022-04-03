public class raisepower_recursion {
    public static void main(String[] args) {
        int num = 10;
        int pow = 3;
        int res = findPow(num, pow);
        System.out.println(res);
    }

    private static int findPow(int a, int b) {
        if (b == 0)
            return 1;
        return (a * (findPow(a, b - 1)));
    }

}

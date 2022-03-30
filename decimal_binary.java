import java.util.Scanner;

class decimal_binary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter decimal no : ");
        int num = s.nextInt();
        System.out.println("Binary : " + binary(num));
        s.close();
    }

    static int binary(int n) {
        if (n == 0)
            return 0;
        else
            return ((n % 2) + 10 * binary(n / 2));
    }
}
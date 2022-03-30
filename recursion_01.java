
/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
*/
import java.util.Scanner;

public class recursion_01 {
    static int power(int x, int y) {
        int temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    /* Program to test function power */
    public static void main(String[] args) {
        // int x = 2;
        // int y = 3;
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.printf("%d", power(x, y));
        s.close();
    }
}

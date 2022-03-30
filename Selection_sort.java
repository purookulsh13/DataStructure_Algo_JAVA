import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();
        int flag = arr[0];

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (flag > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        System.out.println(Arrays.toString(arr));
        s.close();
    }
}

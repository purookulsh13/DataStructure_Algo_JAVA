import java.util.Arrays;
import java.util.Scanner;

public class Changing_Int_arrayvariable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = s.nextInt();
        System.out.println(Arrays.toString(arr));
        changes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changes(int[] arr){
        arr[1] = 13;
    }
}

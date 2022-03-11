import java.util.Arrays;
import java.util.Scanner;

public class swap_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[5];
//        int[] ar = {1,5,3,4,2};
        for(int i=0;i<5;i++)
            ar[i] = s.nextInt();
        swap(ar,1,4);
        System.out.println(Arrays.toString(ar));
    }

    static void swap(int[] arr,int swap_pos1,int swap_pos2){
        int temp = arr[swap_pos1];
        arr[swap_pos1] = arr[swap_pos2];
        arr[swap_pos2] = temp;

    }
}

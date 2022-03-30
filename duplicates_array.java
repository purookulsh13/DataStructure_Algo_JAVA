
/*
    Write a program to find whether the array of integers contains a duplicate number. 
    if yes print the location where duplicate numbers are found.
*/
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        duplicates_array d = new duplicates_array();
        System.out.println("Size of the array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements inside the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        d.FindDuplicates(arr);
        s.close();
    }

}

public class duplicates_array {
    public void FindDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(j);
            }
        }
    }

}
import java.util.*;

public class Sort_String {
    public static void main(String args[]) {

        String str = "The quick brown fox Jump over the laggy little dog";
        int length = str.length();
        String arr[] = str.split("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].length() == arr[j + 1].length() && arr[j].compareTo(arr[y + 1] > 0)) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (String temp : arr) {
            System.out.println(temp);
        }

    }
}

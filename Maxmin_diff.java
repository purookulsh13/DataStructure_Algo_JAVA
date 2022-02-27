public class Maxmin_diff {
    public static void main(String args[]) {
        int arr[] = { 20, 10, 40, 50, 45 };
        int max_value = arr[0];
        int min_value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
            } else if (arr[i] < min_value) {
                min_value = arr[i];
            }
        }
        System.out.println("max_value in array is = " + max_value);
        System.out.println("min_value in array is = " + min_value);
        System.out.println("Difference between Max_value and Min_value is = " + (max_value - min_value));

    }

}

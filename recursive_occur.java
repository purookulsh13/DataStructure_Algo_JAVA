/*
Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and 
print all the  occurrence(index) of search value(7) by holding the index in a result array .
Do it recursively 
The prototype of the method is as follows:-
public static int[] res(int arr[], int current index, int search_value)
{
	// set of statements;
}
*/
public class recursive_occur {
    public static int[] sol(int arr[], int curr_ind, int s_val, int count) {
        if (curr_ind == arr.length) {
            int[] arr_occur = new int[count];
            return arr_occur;
        }
        if (arr[curr_ind] == s_val) {
            int arr_occur[] = sol(arr, curr_ind + 1, s_val, count + 1);
            arr_occur[count] = curr_ind;
            return arr_occur;
        } else {
            int arr_occur[] = sol(arr, curr_ind + 1, s_val, count);
            return arr_occur;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 4, 7, 7 };
        int[] res = sol(arr, 0, 7, 0);
        if (res.length == 0) {
            return;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }
    }
}

public class TwoDIm_String {
    public static void main(String[] args) {
        String[][] arr = {
                {"Puroo", "GLA", "MORENA"},
                {"Sanjay", "Merchant", "Indore"},
                {"Neeraj", "IT", "Chandigarh"}
        };

        for (int row=0;row<arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

    }
}

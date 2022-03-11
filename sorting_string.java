import java.util.*;

public class sorting_string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] str = new String[n];
        for(int a=0;a<str.length;a++)
            str[a] = s.next();

        for(int i=0;i<str.length;i++)
            for(int j=i+1;j< str.length;j++){
                if(str[i].length() > str[j].length()){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }

//        System.out.println(Arrays.toString(str));
        for (String j : str)
            System.out.println(j);
    }
}

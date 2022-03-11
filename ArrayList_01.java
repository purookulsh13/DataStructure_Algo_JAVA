import java.util.ArrayList;
//import java.util.Scanner;

public class ArrayList_01 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        int n = s.nextInt();
//        for(int i=0;i<n;i++)
//            list.add(s.nextInt());
//
//        System.out.println(list);
//
        list.add(45);
        list.add(450);
        list.add(23);
        list.add(2432);
        list.add(3);
        list.add(229);
        list.add(199);
        list.add(99999);
        list.add(454937);
        list.add(282);
        list.add(2842);
        list.add(100);

        System.out.println(list);
        System.out.println(list.contains(199));  //Check the given number is present in arraylist or not.
        System.out.println(list.isEmpty());      //Check the given arraylist is empty or not.
        System.out.println(list.get(4));         //Provide the given index element.
        System.out.println(list.remove(5)); //delete the given index number element.
//        System.out.println(list);
        list.set(0,13);                          //Change the given index value to given element.
        System.out.println(list);



    }
}


/*
Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. 
Now write a program to 
(a) find the average marks obtained in each subject. 
(b) find the average marks obtained by every student.                                                                                                               
(c) find the number of students who have scored below 50 in their average.                                                                          
(d) display the scores obtained by every student.
*/
import java.util.Scanner;

public class ClassMarks {
    public void Averagemarks_student(int arr[][]) {
        int sum = 0, avg;
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + " student average marks  : ");
            for (int j = 0; j < 5; j++) {
                sum = sum + arr[i][j];
            }
            avg = sum / 5;
            System.out.println(avg);
        }

    }

    public void Averagemarks_subject(int arr[][]) {
        int sum = 0, avg;
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " subject average marks  : ");
            for (int j = 0; j < 4; j++) {
                sum = sum + arr[j][i];
            }
            avg = sum / 4;
            System.out.println(avg);
        }

    }

    public void FindBelow50(int arr[][]) {
        int sum = 0, count = 0, avg;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sum = sum + arr[i][j];
            }
            avg = sum / 5;
            if (avg < 50)
                count++;
        }
        System.out.println("Total number of students below 50 : " + count);

    }

    public void display(int arr[][]) {
        System.out.println("Obtained Marks by every student : ");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + " student : ");
            for (int j = 0; j < 5; j++) {
                System.out.println("In " + (j + 1) + " subject : " + arr[i][j]);
            }
        }
    }

}

class Main {
    public static void main(String args[]) {
        ClassMarks c = new ClassMarks();
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[4][5];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the marks for " + (i + 1) + " : ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        c.Averagemarks_student(arr);
        c.Averagemarks_subject(arr);
        c.FindBelow50(arr);
        // c.display(arr);
        s.close();
    }
}

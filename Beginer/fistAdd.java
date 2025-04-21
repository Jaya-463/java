package Beginer;

import java.util.*;
public class fistAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];
        int totalMarks = 0;

        // Taking input for 5 subjects (Subject 1 to 5)
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        // Calculating percentage
        double percentage = (totalMarks / 500.0) * 100;

        // Displaying result
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
        
         

    }
    
}

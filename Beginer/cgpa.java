package Beginer;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = 3;
        double[] marks = new double[subjects];
        double totalGradePoints = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            double gradePoint = marks[i] / 10;
            totalGradePoints += gradePoint;
        }

        double cgpa = totalGradePoints / subjects;
        System.out.println("Your CGPA is: " + cgpa);

        sc.close();
    }
}
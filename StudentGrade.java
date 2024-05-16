package com.codtech;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject name: ");
            String subjectName = scanner.nextLine();
            student.addSubject(subjectName);
        }

        for (Subject subject : student.getSubjects()) {
            System.out.print("Enter grades for " + subject.getName() + " (separated by spaces): ");
            String[] grades = scanner.nextLine().split(" ");
            for (String grade : grades) {
                student.addGrade(subject.getName(), Double.parseDouble(grade));
            }
        }

        double overallAverageGrade = student.calculateOverallAverageGrade();
        System.out.println("Overall average grade: " + overallAverageGrade);
        System.out.println("Overall letter grade: " + student.getLetterGrade(overallAverageGrade));
    }
}
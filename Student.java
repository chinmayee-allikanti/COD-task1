package com.codtech;
import java.util.ArrayList;
import java.util.List;



class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName) {
        subjects.add(new Subject(subjectName));
    }

    public void addGrade(String subjectName, double grade) {
        for (Subject subject : subjects) {
            if (subject.getName().equals(subjectName)) {
                subject.addGrade(grade);
                return;
            }
        }
        System.out.println("Subject not found");
    }

    public double calculateOverallAverageGrade() {
        if (subjects.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (Subject subject : subjects) {
            sum += subject.calculateAverageGrade();
            count++;
        }
        return sum / count;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getLetterGrade(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


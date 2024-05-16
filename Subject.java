package com.codtech;
import java.util.ArrayList;
import java.util.List;


class Subject {
    private String name;
    private List<Double> grades;

    public Subject(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getName() {
        return name;
    }
}




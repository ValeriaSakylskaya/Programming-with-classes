package com.task;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    private ArrayList<Student> students;
    Scanner scanner = new Scanner(System.in);

    Students(){
        students = new ArrayList<>(10);
        fillArrayStudents();
    }

    private void fillArrayStudents(){
        String fullName;
        String group;
        int[] academicPerformance = new int[5];
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Enter the fullname student");
            fullName = scanner.nextLine();
            System.out.println("Enter the group student");
            group = scanner.nextLine();
            System.out.println("Enter the academic performance student");
            for( int j = 0 ; j < academicPerformance.length; j++) {
                academicPerformance[j] = Integer.parseInt(scanner.nextLine());
            }
            students.set(i, new Student(fullName, group, academicPerformance));
        }
    }
    public   void getExcellentStudents(){
        for (int i = 0; i < students.size(); i++) {
            if(checkAcademicPerformance(students.get(i).getAcademicPerformance()))
               System.out.println(students.get(i).toString());
        }
    }

    private boolean checkAcademicPerformance(int[] Excellent) {
        boolean result = true;
        for (int i : Excellent) {
            if (Excellent[i] != 9 || Excellent[i] != 10)
                result = false;
        }
        return result;
    }
}

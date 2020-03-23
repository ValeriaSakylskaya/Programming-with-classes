package com.task;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     /*   3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
     номеров групп студентов, имеющих оценки, равные только 9 или 10.*/
        ArrayList<Student> students = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        String fullName;
        String group;
        int[] academicPerformance = new int[5];
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Enter the fullname student");
            fullName = scanner.nextLine();
            System.out.println("Enter the group student");
            group = scanner.nextLine();
            System.out.println("Enter the academic performance student");
            for (int j = 0; j < academicPerformance.length; j++) {
                academicPerformance[j] = Integer.parseInt(scanner.nextLine());
            }
            students.add(i, new Student(fullName, group, academicPerformance));
        }


    }

    public void getExcellentStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (isGoodPerformance(students.get(i).getAcademicPerformance()))
                System.out.println(students.get(i).toString());
        }
    }

    private boolean isGoodPerformance(int[] grades) {
        boolean result = true;
        for (int i : grades) {
            if (grades[i] != 9 || grades[i] != 10)
                result = false;
        }
        return result;
    }
}

package com.task;

public class Student {
    private String FullName;
    private String Group;
    private int[] AcademicPerformance = new int[5];


    Student () {}
    Student(String FullName, String Group, int[] AcademicPerformance) {
        this.FullName = FullName;
        this.Group = Group;
        this.AcademicPerformance = AcademicPerformance;
    }

    public int[] getAcademicPerformance() {
        return AcademicPerformance;
    }

    public String getFullName() {
        return FullName;
    }

    public String getGroup() {
        return Group;
    }

    public boolean ExcellentStudents(int[] Excellent) {
        boolean result = true;
        for (int i : Excellent) {
            if (Excellent[i] != 9 || Excellent[i] != 10) {
                result = false;
            }}
            return result;

    }
    public static Builder newBuilder() {
        return new Student().new Builder();
    }
    public  class Builder {
        private Builder() {

        }
        public  Builder setAcademicPerformance (int[] academicPerformance)
        {
            Student.this.AcademicPerformance = academicPerformance;
            return  this;
        }
        public  Builder setFullName (String FullName)
        {
            Student.this.FullName = FullName;
            return  this;
        }
        public  Builder setGroup (String group)
        {
            Student.this.Group = group;
            return  this;
        }
    }
}

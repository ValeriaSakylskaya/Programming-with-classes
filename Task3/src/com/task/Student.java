package com.task;

public class Student {
    private String fullName;
    private String group;
    private int[] academicPerformance = new int[5];

   public Student() {}
   public Student(String FullName, String Group, int[] AcademicPerformance) {
        this.fullName = FullName;
        this.group = Group;
        this.academicPerformance = AcademicPerformance;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroup() {
        return group;
    }


    public static Builder newBuilder() {
        return new Student().new Builder();
    }

    public  class Builder {

        private Builder() {
        }

        public  Builder setAcademicPerformance (int[] academicPerformance) {
            Student.this.academicPerformance = academicPerformance;
            return  this;
        }

        public  Builder setFullName (String FullName) {
            Student.this.fullName = FullName;
            return  this;
        }

        public  Builder setGroup (String group) {
            Student.this.group = group;
            return  this;
        }
    }

    @Override

    public String toString(){
       return this.fullName + this.group + this.academicPerformance.toString();
    }
}

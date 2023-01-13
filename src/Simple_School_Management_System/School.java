package Simple_School_Management_System;

import java.util.Arrays;

public class School {
    private  int number;
    private  String name;
    private Teacher[] teachers;
    private Student[] students;

    private int countTeacher;
    private int countStudent;


    public School() {
        teachers = new Teacher[100];
        students = new Student[100];
        countTeacher = 0;
        countStudent = 0;
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents()   {
        return students;
    }

    public double getTotalMoneyEarned() {
        double sum = 0;
        for (int i = 0; i < countStudent;i++) {
            sum += students[i].getFeesPaid();
        }
        return 0.0;
    }

    public double getTotalMoneySpent() {
        double sum = 0;
        for (int i = 0;  i < countTeacher;i++) {
            sum += teachers[i].getSalaryEarned();

        }
        return sum;
    }


    public void addTeacher(Teacher teacher) {
        teachers[countTeacher++] = teacher;
    }

    public void addStudent(Student student) {
        students[countStudent++] = student;

    }

    public String getName() {
        return name;
    }

    public  int getNumber(){
        return  number;
    }
}


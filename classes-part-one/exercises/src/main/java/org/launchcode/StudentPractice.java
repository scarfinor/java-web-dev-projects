package org.launchcode;

import java.util.ArrayList;

 class StudentPractice {
    public static void main(String[] args){
        //insantiate your org.launchcode.Student class below
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("Richard", 12345,1,4.0);
        Student student1 = new Student("Jeff", 23456,1,4.0);
        students.add(student);
        students.add(student1);
        Teacher teacher = new Teacher("Shawn", "Coolie", "Full Stack Web Development", 6);
        Course course = new Course("Full Stack Web Development", teacher, students);
    }
}

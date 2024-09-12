package org.launchcode;

import java.util.ArrayList;

class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;

        public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
            this.topic = topic;
            this.instructor = instructor;
            this.enrolledStudents = enrolledStudents;
        }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

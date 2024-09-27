package org.launchcode;

class Teacher {
   private String name;
   private String lastName;
   private String subject;
   private int yearsTeaching;

    public Teacher (String name, String lastName, String subject, int yearsTeaching) {
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
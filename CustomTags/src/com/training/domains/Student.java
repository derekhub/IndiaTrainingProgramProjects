package com.training.domains;

public class Student implements Comparable<Student> {

    private long id;
    private String name;
    private double mark;
    private String department;

    public Student() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Student otherObj) {

        if (this.mark > otherObj.mark)
            return 1;
        if (this.mark < otherObj.mark)
            return 1;

        return 0;
    }

}

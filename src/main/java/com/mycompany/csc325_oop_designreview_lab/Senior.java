package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{

    int credits;
    public Senior(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits(){
        return credits;
    }



    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + getGpa() +
                ", credits=" + getCredits() +
                '}';
    }
}

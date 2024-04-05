package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    int credits;
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits(){
        return credits;
    }



    @Override
    public String toString() {
        return "Freshman{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + getGpa() +
                ", credits=" + getCredits() +
                '}';
    }

}

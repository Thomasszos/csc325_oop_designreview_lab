package com.mycompany.csc325_oop_designreview_lab;

public class StudentFactory {
    public Student createStudent(String name, short age, int credits){
        if(credits < 85){
            return new Freshman(name, age, credits);
        } else if(credits>=85) {
            return new Senior(name, age, credits);
        } else {
            return new Student(name, age);
        }
    }

    public Student createStudent(String name, short age){
        return new Student(name, age);
    }
}

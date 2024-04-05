/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{ //Uses human
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors
    double gpa;

    public Student(String name, short age){ //My student constructor using human
        super(name, age);
        //this.gpa = gpa;
    }

    public Student(String name, short age, double gpa){ //My student constructor using human
        super(name, age);
        this.gpa = gpa;
    }


	// ToDo 3: Add a field for GPA and create a setter and a getter

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' + // Assuming getName() is accessible from Human
                ", age=" + getAge() + // Assuming getAge() is accessible from Human
                ", gpa=" + gpa +
                '}';
    }



    // ToDo 4: Add comments to your code
}

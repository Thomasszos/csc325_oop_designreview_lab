/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class
		StudentFactory factory = new StudentFactory();

		Student std = factory.createStudent("James", (short)20);
		// ToDo 11: Add a toString method for the Senior class

		Student freshman = factory.createStudent("James", (short)20, 12); // name, age, credits

	 	Senior senior = new Senior("John", (short)30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
	 	Scanner gpaScan = new Scanner(System.in);
		 System.out.println("Student 1 GPA: ");
		 std.setGpa(gpaScan.nextDouble());

	 System.out.println("Student 2 GPA: ");
	 freshman.setGpa(gpaScan.nextDouble());

	 System.out.println("Student 3 GPA: ");
	 senior.setGpa(gpaScan.nextDouble());

	 	System.out.println(std);

		System.out.println(freshman);

		System.out.println(senior);

		// ToDo 13: add comments and explain your code

	}

}


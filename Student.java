package com.prokarma;

import java.util.*;

public class Student {
	public static void main(String[] args) {
		double highestScore = 0;
		double studentScore = 0;
		String studentName = "";
		String HighestStudentName = "";
		
		double count = 0;
		double totalStudents = 0;
		double secondhighestscore = 0;
		String Secondhighestname = " ";
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the total number of students: ");
		totalStudents = input.nextDouble();
		
		while ( count < totalStudents ) 
		{
		System.out.print("Enter Student Name: ");
		studentName = input.next();
		System.out.print("Enter Student Score: ");
		studentScore = input.nextDouble();
		count++;

		if(studentScore > highestScore) 
		{
		secondhighestscore = highestScore;
		highestScore = studentScore;
		Secondhighestname = HighestStudentName;
		HighestStudentName = studentName;
		}
		else {}
		} 
		System.out.println(HighestStudentName + " has the highest score of " + highestScore); 
		
		}
	}


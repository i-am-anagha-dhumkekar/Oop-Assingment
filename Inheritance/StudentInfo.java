package com.nissan.App;

import java.util.Scanner;

import com.nissan.bean.Grad;
import com.nissan.bean.Undergrad;

public abstract class StudentInfo {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		try {
			System.out.println("Eneter Student Name");
			String stdName=input.nextLine();
			
			System.out.println("Eneter Student ID");
			int stdId=input.nextInt();
			
			System.out.println("Eneter Student Grad");
			double grad=input.nextDouble();
			
			System.out.println("Eneter Student Age");
			int stdAge=input.nextInt();
			
			System.out.println("Eneter Student Address");
			String stdAdress=input.next();
			Grad s1=new Grad(stdAdress, stdAge, grad, stdAge, stdAdress);
			if(s1.isPassed(grad)) {
			System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");

			}
			
			
		
			
		}
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
	public abstract  void isPassed();

}

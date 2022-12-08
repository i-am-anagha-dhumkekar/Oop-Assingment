package com.nissan.bean;



public class Undergrad extends Student{

	   public Undergrad(String stdName,int stdId,double stdGrad,int Age,String Address) {
		super(stdName,stdId,stdGrad,Age,Address);
	   }
	

	@Override
	public boolean isPassed(double stdGrad) {
		if(stdGrad>70) {
			return true;
		}
		else 
			return false;
		
	}

}


package com.nissan.bean;

public class Grad extends Student{

	
	public Grad(String stdName2, int stdId2, double stdGrad, int age, String address) {
		super(stdName2, stdId2, stdGrad, age, address);
	}

	@Override
	public boolean isPassed(double stdGrad) {
		if(stdGrad>80)
			return true;
		return false;
	}



}

package com.nissan.bean;
public abstract class Student {
	
			
			private String stdName;
			private int stdId;
			private double grad;
			private int stdAge;
			private String  stdAddress;
			
	
	public Student(String stdName2, int stdId2, double stdGrad, int age, String address) {
				this.stdName=stdName2;
				this.stdId=stdId2;
				this.grad=stdGrad;
				this.stdAge=age;
				this.stdAddress=address;
			}




	public abstract  boolean isPassed(double grad);

	}



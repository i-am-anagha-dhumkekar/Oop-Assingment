package com.nissan.app;

import com.nissan.bean.Cat;
import com.nissan.bean.Dog;
import com.nissan.bean.MyAnimals;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.saySomething();
		
		Dog d=new Dog();
		d.saySomething();
		
		MyAnimals m=new MyAnimals();
		int temp=m.getBodyTemp();
		System.out.println(temp);

	}

}

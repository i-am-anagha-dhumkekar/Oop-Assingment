package com.nissan.bean;

public class MyAnimals extends Animals implements Imammals{

	/*public void setBodyTemp(int BodyTemp)
	{
		this.BodyTemp=BodyTemp;
	}*/
	@Override
	public int getBodyTemp() {
		return BodyTemp;
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
	}

}

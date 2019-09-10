package com.example.service;

public class Test1 extends Test {

	int i=10;
	
	

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		Test t = new Test1();
		System.out.println(t.i);
		System.out.println(t.getI());
	}

}

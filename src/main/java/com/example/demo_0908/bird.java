package com.example.demo_0908;

public class bird extends Animal {

	public bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sleep() {
		System.out.println(this.getName() + "正在睡覺~~");
	}

	public void old() {
		System.out.println("今年是" + this.age + "歲。");
	}
	
	public void flying() {
		System.out.println("正在飛行~~");
	}
}

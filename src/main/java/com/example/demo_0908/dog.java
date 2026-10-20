package com.example.demo_0908;

public class dog {
	private String name;
	private String color = "White";
	private int age;

	public dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sleep() {
		System.out.println("正在睡覺~~");
	}
	public void barking() {
		System.out.println("正在吠叫~~");
	}
}

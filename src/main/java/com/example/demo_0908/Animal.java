package com.example.demo_0908;

public class Animal {
	private String name;
	private String color = "White";
	protected int age;

	public Animal() {
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

	public void sleep() {
		System.out.println(name + "正在睡覺~~");
	}
	public void eat() {
		System.out.println(name + "正在吃飯~~");
	}
}

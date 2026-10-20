package com.example.demo_0908;

public class Vector {
	private double x;
	private double y;

	public Vector() {
		this.x = 0;
		this.y = 0;
	}

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vector add(Vector other) {
		return new Vector(this.x + other.x, this.y + other.y);
	}

	public Vector add(Vector v1, Vector v2) {
		return new Vector(v1.x + v2.x, v1.y + v2.y);
	}

	public Vector mutiply(double scalar) {
		return new Vector(this.x * scalar, this.y * scalar);
	}

	public Vector mutiply(double scalar, Vector vector) {
		return new Vector(vector.x * scalar, vector.y * scalar);
	}

	public double dot(Vector other) {
		return this.x * other.y + this.y * other.x;
	}

	public double dot(Vector v1, Vector v2) {
		return v1.x * v2.y + v1.y * v2.x;
	}

	public double absolute() {
		return 
	}
}

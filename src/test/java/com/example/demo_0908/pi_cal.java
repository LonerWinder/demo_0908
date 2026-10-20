package com.example.demo_0908;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class pi_cal {

	int STEP = 10000000;
	int inside = 0;
	Random random = new Random(12345);

	public double generate_coordinate() {
		return random.nextDouble();
	}

	public double radius() {
		double x = generate_coordinate();
		double y = generate_coordinate();
		return Math.sqrt(x * x + y * y);
	}

	@Test
	public void calculator() {
		for (int i = 0; i < STEP; i++) {
			if (radius() <= 1) {
				inside++;
			}
		}
		double pi = inside * 4.0 / STEP;
		double accurate = Math.abs(pi / Math.PI);
		System.out.printf("重複次數：%d%n", STEP);
		System.out.printf("園內次數：%d%n", inside);
		System.out.printf("預估圓周率：%f%n", pi);
		System.out.printf("準確率：%f%n", accurate);
		inside = 0;
	}
}

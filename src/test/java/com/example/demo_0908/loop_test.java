package com.example.demo_0908;

import java.util.Scanner; // Required to import the class
import org.junit.jupiter.api.Test;
import java.util.Random;

public class loop_test {
	@Test
	public void loop() {
		Random random = new Random();
		int answer = random.nextInt(100);
		int up = 99;
		int low = 0;
		int number = 100;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("請輸入 %2d ~ %2d 數字。%n", low, up);
			number = sc.nextInt();
			if (up < number || low > number) {
				System.out.printf("數字不再範圍內，");
				continue;
			}
			if (number == answer) {
				System.out.printf("你猜對了！答案是 %2d！%n", answer);
				break;
			}
			System.out.printf("你猜錯了！", answer);
			if (number > answer) {
				up = number;
				System.out.printf("答案比你猜得還小。%n");
				continue;
			}
			low = number;
			System.out.printf("答案比你猜得還大。%n");
			continue;
		}
		sc.close();
	}
}

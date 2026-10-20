package com.example.demo_0908;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Scanner;
@SpringBootTest
class Demo0908ApplicationTests {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("今天是星期三，請輸入天數：");
		int date = scanner.nextInt();
		String[] weeks = {"一","二","三","四","五","六","日"};
		System.out.println(date + "天後，是星期" + weeks[(date+2)%7]);
		scanner.close();
	}

}

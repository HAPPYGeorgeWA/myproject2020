package com.HG;

public class Scoring {

	public static void main(String[] args) {
		Student stu1 = new Student("George",80,90);
		int avg = stu1.average();
		if (avg <=60) {
			System.out.print("I am sorry");
		}else {
			System.out.println("Congradulation");
		}
		stu1.print();
	}
}

package org.javaturk.oopj.ch05;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// 2.SORU : denklemKökleri, 3.SORU:fizzBuzz
		// denklemKökleri();
		fizzBuzz();
	}

	public static void denklemKökleri() {
		Scanner input = new Scanner(System.in);
		System.out.println("(ax^2+bx+c) ikinci dereceden bir denklemdir.\n" + "Denklemdeki sabitleri sirayla girin");

		System.out.println("a degerini girin : ");
		double a = input.nextInt();
		System.out.println("b degerini girin : ");
		double b = input.nextInt();
		System.out.println("c degerini girin : ");
		double c = input.nextInt();

		// Deltanın (diskriminantın) değerine göre denklem kökleri farklı değerler
		// alacak
		// Önce delta tanımla
		double delta = (b * b) - (4 * a * c);

		if (delta > 0) {
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			System.out.println("The roots are:" + " x1= " + x1 + " and " + " x2= " + x2);
		}
		if (delta < 0) {
			System.out.println("Denklemin gerçel kökü yoktur.");
		}
		if (delta == 0) {
			double x = ((-b) / (2 * a));
			System.out.println("The roots are: " + " x1= " + x + " and " + " x2= " + x);
		}

	}

	public static void fizzBuzz() {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				System.out.println("Fizz Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}

	}

}

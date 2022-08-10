package org.javaturk.oopj.ch05.loop;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		//4.SORU: Girilen bir sayının asal sayı olup olmadığını belirleyen program 
		//5.SORU: Girilen bir sayıya kadar kaç tane asal sayı olduğunu hesaplayan program
		//6.SORU: Monte Carlo yöntemini kullanarak Pi sayısını hesaplayan bir program
		
		//4.SORU:asalSayı(), 5.SORU:sayıyaKadarAsalSayı(),6.SORU:monteCarlo()
		
		//asalSayı();
		sayıyaKadarAsalSayı();
		//monteCarlo();
	}
	
	
	
	public static void asalSayı() {
		Scanner input = new Scanner (System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayı = input.nextInt();
		
		
		
		if (sayı == 1)
			System.out.println("Girilen sayı asal sayı değildir.");
		else if (sayı >=0 && sayı == 2)
			System.out.println("Girilen sayı asal sayıdır.");
		else if (sayı >=0 && sayı == 3)
			System.out.println("Girilen sayı asal sayıdır.");
		else if (sayı >=0 && sayı == 5)
			System.out.println("Girilen sayı asal sayıdır.");
		else if (sayı >=0 && sayı == 7)
			System.out.println("Girilen sayı asal sayıdır.");

		
		else if (sayı >=0 && sayı % 2 == 0 )
			System.out.println("Girilen sayı asal sayı değildir. 1'den sonraki en küçük böleni 2'dir. ");
		else if (sayı >=0 && sayı % 3 == 0 )
			System.out.println("Girilen sayı asal sayı değildir. 1'den sonraki en küçük böleni 3'tür.");
		else if (sayı >=0 && sayı % 5 == 0  )
			System.out.println("Girilen sayı asal sayı değildir. 1'den sonraki en küçük böleni 5'tir.");
		else if (sayı >=0 && sayı % 7 == 0 )
			System.out.println("Girilen sayı asal sayı değildir. 1'den sonraki en küçük böleni 7'dir.");
		else if (sayı >=0 && sayı % 1 == 0 && sayı % sayı == 0 )
			System.out.println("Girilen sayı asal sayıdır çünkü bölenleri 1 ve kendisidir.");
		else 
			System.out.println("Girilen sayı asal sayı değildir.");		
	}
	
	

	
	public static void sayıyaKadarAsalSayı() {
		int n = 100;
		for(int i =1; i<=n ; i++) {			
			if (i == 1)
				System.out.println(i + " " + "asal sayı değildir.");
			else if (i >=0 && i == 2)
				System.out.println(i + " " + "asal sayıdır.");
			else if (i >=0 && i == 3)
				System.out.println(i + " " + "asal sayıdır.");
			else if (i >=0 && i == 5)
				System.out.println(i + " " + "asal sayıdır.");
			else if (i >=0 && i == 7)
				System.out.println(i + " " + "asal sayıdır.");
			else if (i >=0 && i % 2 == 0 )
				System.out.println(i + " " + "asal sayı değildir. 1'den sonraki en küçük böleni 2'dir. ");
			else if (i >=0 && i % 3 == 0 )
				System.out.println(i + " " + "asal sayı değildir. 1'den sonraki en küçük böleni 3'tür.");
			else if (i >=0 && i % 5 == 0  )
				System.out.println(i + " " + "asal sayı değildir. 1'den sonraki en küçük böleni 5'tir.");
			else if (i >=0 && i % 7 == 0 )
				System.out.println(i + " " + "asal sayı değildir. 1'den sonraki en küçük böleni 7'dir.");
			else if (i >=0 && i % 1 == 0 && i % i == 0 )
				System.out.println(i + " " + "asal sayıdır çünkü bölenleri 1 ve kendisidir.");
			else
				System.out.println(i + " " + "asal sayı değildir.");
	
		}
	}
	
	
	
	
	public static void monteCarlo() {
		
	}
	
	
	
	

	
}

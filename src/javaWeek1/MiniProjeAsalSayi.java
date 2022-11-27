package javaWeek1;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);
		
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Sayi asal Degildir.");
			return;
		}
		
		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}
		
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayi Asaldir.");
		}
		else {
			System.out.println("Sayi asal Degildir.");
		}
		
	}

}

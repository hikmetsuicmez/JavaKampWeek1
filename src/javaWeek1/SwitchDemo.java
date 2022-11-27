package javaWeek1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		
		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("Iyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldiniz");
			break;
		}

	}

}
package miniProject2;

import java.util.Scanner;

public class danZprijmu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Vyber si svoj status");

		int vyberStatusu;
		int prijem;
		double vysledok;
		
		System.out.println("1-Slobodny/a, 2-Zenaty/Vydata");
		vyberStatusu = scan.nextInt();

		while (vyberStatusu > 2) {
			System.out.println("Vyber len z operacii 1 az 2");
			vyberStatusu = scan.nextInt(); // Vybera moznost 1 az 2

		}

		System.out.println("Napis svoj rocny prijem");
		prijem = scan.nextInt();

		if (vyberStatusu == 1 && prijem <= 11000) {
			vysledok = 0.15 * prijem;
			System.out.println("001 Tvoja dan z prijmu je : " + vysledok + "Eur");
		}

		else if (vyberStatusu == 1 && prijem <= 22000 ) {
			vysledok = 0.22 * prijem;

			System.out.println("002 Tvoja dan z prijmu je : " + vysledok + "Eur");
		}

		else if (vyberStatusu == 1 && prijem > 22000) {
			vysledok = 0.31 * prijem;

			System.out.println("003 Tvoja dan z prijmu je : " + vysledok + "Eur");
		}

		else if (vyberStatusu == 2 && prijem <= 16000) {
			vysledok = 0.15 * prijem;
			System.out.println("Tvoja dan z prijmu pre status neslobodny/a je: " + vysledok + "Eur");
		} else if (vyberStatusu == 2 && prijem > 16000 && prijem <= 36000) {
			vysledok = 0.22 * prijem;

			System.out.println("Tvoja dan z prijmu pre neslobodny/a je : " + vysledok + "Eur");

		} else if (vyberStatusu == 2 && prijem > 36000) {
			vysledok = 0.31 * prijem;
			System.out.println("Tvoja dan z prijmu pre neslobodny/a je: " + vysledok + "Eur");
		}

		else {System.out.println("Zla hodnota");}
		/*
		 * else if (vyberStatusu==0) { System.out.println("Zadal si inu hodnotu");}
		 */

	}

}

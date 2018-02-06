package Games;

import java.util.Random;
import java.util.Scanner;

public class PointNumber {

	public static final int EXIT = 0;
	public static final String END_THANKS = "Dziêkujê za grê :) Dozobaczenia... ";

	public static void PointNumberStart() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int randNumber;
		int userNumber;

		do {
			randNumber = random.nextInt(10);
			System.out.println("Wcisnij na klawiaturze liczbê: " + randNumber);

			while ((userNumber = input.nextInt()) != randNumber) {
				if (userNumber != randNumber) {
					System.out.println("ERROR!!! Sróbuj jeszcze raz.");
				}
			}

			System.out.printf("Gratulacje. \n\n");
			System.out.printf("Koniec wciœnij 0. \nKontynuacja wprowadz 1.");

		} while (input.nextInt() != PointNumber.EXIT);

		input.close();
	}

}

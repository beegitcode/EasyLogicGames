package Games;

import java.util.Random;
import java.util.Scanner;

public class PointNumber {

	public static final int EXIT = 0;
	public static final String END_THANKS = "Dzi�kuj� za gr� :) Dozobaczenia... ";

	public static void PointNumberStart() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int randNumber;
		int userNumber;

		do {
			randNumber = random.nextInt(10);
			System.out.println("Wcisnij na klawiaturze liczb�: " + randNumber);

			while ((userNumber = input.nextInt()) != randNumber) {
				if (userNumber != randNumber) {
					System.out.println("ERROR!!! Sr�buj jeszcze raz.");
				}
			}

			System.out.printf("Gratulacje. \n\n");
			System.out.printf("Koniec wci�nij 0. \nKontynuacja wprowadz 1.");

		} while (input.nextInt() != PointNumber.EXIT);

		input.close();
	}

}

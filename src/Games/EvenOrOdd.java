package Games;

import java.util.Random;
import java.util.Scanner;

public class EvenOrOdd {

	public static void everOrOddStart() {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int evenOrOddNumber;
		boolean userAnswer;

		do {
			evenOrOddNumber = random.nextInt(100);
		

			System.out.println("Czy podana liczba jest parzysta? " + evenOrOddNumber);

			System.out.printf("Prawda znaczy true, fa�sz znaczy false. \ntrue czy false???\n");

			userAnswer = input.nextBoolean();
			
			if (userAnswer == ((evenOrOddNumber % 2) == 0)) {
				System.out.println("Brawo!!!\n");

			} else {
				System.out.println("Niestety :( odpowiedz niepoprawna.");
			}
			System.out.printf("Koniec wci�nij 0. \nKontynuacja wprowadz 1.\n");

		} while (input.nextInt() != 0);

		input.close();
	}

}

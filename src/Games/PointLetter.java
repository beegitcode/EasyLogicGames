package Games;

import java.util.Random;
import java.util.Scanner;

public class PointLetter {

	public static void pointLetterStart() {

		String alphabet = "A•BC∆DE FGHIJKL£MN—O”PQRSåTUVWXYZØè";
		String fullalphabet = alphabet + alphabet.toLowerCase();
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			String userLetter;

			char randLetter = fullalphabet.charAt(random.nextInt(70));
			String randLetterString = Character.toString(randLetter);// Konwersja char na String
			System.out.println("Wcisnij na klawiaturze liczbÍ: " + randLetter);

			while (!((userLetter = input.nextLine()).equals(randLetterString))) {
				System.out.printf("B≥πd! SrÛbuj jeszcze raz.");

			}
			System.out.println("Gratulacje. ");
		}

		input.close();

	}

}

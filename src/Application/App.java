
package Application;

import java.util.Scanner;

import Games.EvenOrOdd;
import Games.GuessNumber;
import Games.PointLetter;
import Games.PointNumber;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybierz grê: ");
		for (Options options : Options.values()) {
			System.out.println(options);
		}

		Options option = Options.createFromInt(sc.nextInt());

		switch (option) {
		case EXIT:
			break;
		case EVEN_OR_ODD:
			EvenOrOdd.everOrOddStart();
			break;
		case POINT_NUMBER:
			PointNumber.PointNumberStart();
			break;
		case POINT_LETTER:
			PointLetter.pointLetterStart();
			break;
		case GUESS_NUMBER:
			GuessNumber.guesNumberStart();
			break;
//		default:
//			System.out.println("Podano b³êdn¹ wartoœæ");// Ju¿ siê nigdy nie wykona.
		}

		sc.close();
		System.out.println(PointNumber.END_THANKS);

	}

}

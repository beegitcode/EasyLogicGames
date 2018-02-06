
package Application;

import java.util.Scanner;

import Games.EvenOrOdd;
import Games.GuessNumber;
import Games.PointLetter;
import Games.PointNumber;

public class App {

	public static final int EVEN_OR_ODD = 0;
	public static final int POINT_NUMBER = 1;
	public static final int POINT_LETTER = 2;
	public static final int GUESS_NUMBER = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybierz gr�: ");
		System.out.println("0 - Parzysta nieparzysta.");
		System.out.println("1 - Wska� liczb�.");
		System.out.println("2 - Wska� liter�.");
		System.out.println("3 - Odgadnij liczb�.");

		int option = sc.nextInt();

		switch (option) {
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
		default:
			System.out.println("Podano b��dn� warto��");
		}

		sc.close();
		System.out.println(PointNumber.END_THANKS);

	}

}

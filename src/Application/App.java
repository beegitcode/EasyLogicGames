
package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Games.EvenOrOdd;
import Games.GuessNumber;
import Games.PointLetter;
import Games.PointNumber;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybierz grê: ");

		Options.printAllOptions();
		boolean condition = true;
		while (condition) {
			try {
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
				}
				condition = false;
			} catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
				System.out.println("Ups coœ posz³o nie tak \nMo¿liwe dostêpne opcje gry to: ");
				Options.printAllOptions();
				System.out.println("Try again :) hihihi - wprowadz jedn¹ z powy¿szych opcji drogi kolego..");
				sc.nextLine();
			} 
		}
		sc.close();
		System.out.println(PointNumber.END_THANKS);

	}

}

import java.util.Random;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int userNumber;
		int evenOrOddNumber;
		boolean userAnswer;

		do {
			evenOrOddNumber = random.nextInt(100);

			System.out.println("Czy podana liczba jest parzysta? " + evenOrOddNumber);
				
			System.out.printf("Prawda znaczy true, fa³sz znaczy false. \ntrue czy false???\n");

			userAnswer = input.nextBoolean();

			if (userAnswer == ((evenOrOddNumber % 2) == 0)) {
				System.out.println("Brawo!!!\n");

			} else {
				System.out.println("Niestety :( odpowiedz niepoprawna.");
			}
			System.out.printf("Koniec wciœnij 0. \nKontynuacja wprowadz 1.\n");
			
		} while (input.nextInt() != GuessLetter.EXIT);
		System.out.println(GuessLetter.END_THANKS);
		
		input.close();
	}

}

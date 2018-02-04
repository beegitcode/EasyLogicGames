import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int randNumber;
		int userNumber;

		randNumber = random.nextInt(100);
		System.out.println("Zgadnij liczbê  od  0  do 100 ");
		userNumber = -1;
		while (userNumber != randNumber) {

			userNumber = input.nextInt();
			if (userNumber > randNumber) {
				System.out.println("Podana liczba jest za du¿a spróbuj jeszcze raz");
			} else if (userNumber < randNumber) {
				System.out.println("Podana liczna jest za ma³a spróbuj jeszcze raz");
			}

		}

		System.out.println("Gratulacje uda³o siê...");
		System.out.println(PointNumber.END_THANKS);

		input.close();
	}

}

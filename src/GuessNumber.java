import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int randNumber;
		int userNumber;

		randNumber = random.nextInt(100);
		System.out.println("Zgadnij liczb�  od  0  do 100 ");
		userNumber = -1;
		while (userNumber != randNumber) {

			userNumber = input.nextInt();
			if (userNumber > randNumber) {
				System.out.println("Podana liczba jest za du�a spr�buj jeszcze raz");
			} else if (userNumber < randNumber) {
				System.out.println("Podana liczna jest za ma�a spr�buj jeszcze raz");
			}

		}

		System.out.println("Gratulacje uda�o si�...");
		System.out.println(PointNumber.END_THANKS);

		input.close();
	}

}

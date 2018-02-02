import java.util.Random;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int userNumber;
		int evenOrOddNumber;
		boolean userAnswer;

		evenOrOddNumber = random.nextInt(100);

		System.out.println("Czy podana liczba jest parzysta? " + evenOrOddNumber);

		System.out.println("ODP" + ((evenOrOddNumber % 2) == 0));

		userAnswer = input.nextBoolean();

		if (userAnswer == ((evenOrOddNumber % 2) == 0)) {
			System.out.println("Brawo");

		} else {
			System.out.println("Buu");
		}

//				System.out.println("Rozwi¹zanie: ");
//				if ((evenOrOddNumber % 2) == 0) {
//					System.out.println("Podana liczba jest parzysta");
//		
//				} else {
//					System.out.println("Podana liczba jest nieparzysta");
//				}

		input.close();
	}

}

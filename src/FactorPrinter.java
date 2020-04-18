
public class FactorPrinter {

	public static void main(String[] args) {
		printFactors(6);
		printFactors(32);
		printFactors(10);
		printFactors(-1);
	}

	public static void printFactors(int number) {

		if (number < 1) {
			System.out.print("Invalid Value");
		} else {
			int tempNumber = 1;
			while (tempNumber <= number) {
				if (number % tempNumber == 0) {
					System.out.print(tempNumber);
					System.out.print(" ");
				}
				tempNumber += 1;
			}
		}
		System.out.println();

	}

}


public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));

	}

	public static int getEvenDigitSum(int number) {
		int retVal = -1;
		int tmpVal=0;

		if (number >= 0) {
			retVal = 0;
			while (number > 0) {
				tmpVal = number % 10;
				if (tmpVal % 2 == 0) {
					retVal += tmpVal;
				}
				number /= 10;
			}
		}

		return retVal;
	}

}

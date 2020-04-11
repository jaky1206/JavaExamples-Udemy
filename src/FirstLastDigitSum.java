
public class FirstLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
	}

	public static int sumFirstAndLastDigit(int number) {
		int retVal = -1;

		if (number >= 0) {
			retVal = 0;
			retVal += number % 10;
			while (number > 0) {
				if (String.valueOf(number).length()  == 1) {
					retVal += number;
				}
				number /= 10;
			}
		}

		return retVal;
	}

}

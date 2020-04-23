
public class NumberToWords {

	public static void main(String[] args) {

		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(123));
		System.out.println(getDigitCount(-12));
		System.out.println(getDigitCount(5200));

		System.out.println(reverse(-121));
		System.out.println(reverse(1212));
		System.out.println(reverse(1234));
		System.out.println(reverse(100));

		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		numberToWords(-12);
	}

	public static int getDigitCount(int number) {
		int returnValue = -1;

		if (number >= 0) {
			returnValue = String.valueOf(number).length();
		}

		return returnValue;
	}

	public static int reverse(int number) {
		int returnValue = 0;
		int tempDigit = 0;
		boolean isNegative = number < 0;

		if (isNegative) {
			number = Math.abs(number);
		}

		while (number > 0) {
			tempDigit = number % 10;
			returnValue = (returnValue * 10) + tempDigit;
			number /= 10;
		}

		return isNegative ? (returnValue * -1) : returnValue;
	}

	public static void numberToWords(int number) {
		StringBuilder stringToBePrinted = new StringBuilder();

		if (number == 0) {
			stringToBePrinted.append("Zero");
		}
		else if (number > 0) {

			int tempDigit = -1;
			int digitCount = getDigitCount(number);
			number = reverse(number);
			int digitCountAfterReversal = getDigitCount(number);
			
			while (number > 0) {

				if (tempDigit >= 0) {
					stringToBePrinted.append(" ");
				}
				tempDigit = number % 10;

				switch (tempDigit) {
				case 0:
					stringToBePrinted.append("Zero");
					break;
				case 1:
					stringToBePrinted.append("One");
					break;
				case 2:
					stringToBePrinted.append("Two");
					break;
				case 3:
					stringToBePrinted.append("Three");
					break;
				case 4:
					stringToBePrinted.append("Four");
					break;
				case 5:
					stringToBePrinted.append("Five");
					break;
				case 6:
					stringToBePrinted.append("Six");
					break;
				case 7:
					stringToBePrinted.append("Seven");
					break;
				case 8:
					stringToBePrinted.append("Eight");
					break;
				case 9:
					stringToBePrinted.append("Nine");
					break;
				default:
					stringToBePrinted.append("Invalid Value");
					break;
				}
				number /= 10;
			}

			if (digitCountAfterReversal != digitCount) {
				for (int i = 0; i < (digitCount - digitCountAfterReversal); i++) {
					stringToBePrinted.append(" Zero");
				}
			}

		} else {
			stringToBePrinted.append("Invalid Value");
		}

		System.out.println(stringToBePrinted.toString());
	}
}

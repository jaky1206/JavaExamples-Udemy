
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(5));
		System.out.println(isPerfectNumber(-1));
	}

	public static boolean isPerfectNumber(int number) {
		boolean returnValue = false;
		int tempNumber = 1;
		int sumOfPositiveDivisors = 0;

		if (number >= 1) {
			while (tempNumber < number) {
				if (number % tempNumber == 0) {
					sumOfPositiveDivisors += tempNumber;
				}
				tempNumber += 1;
			}
		}

		if (tempNumber == sumOfPositiveDivisors) {
			returnValue = true;
		}

		return returnValue;
	}

}

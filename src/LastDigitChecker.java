
public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
	}

	public static boolean isValid(int x) {
		if (x >= 10 && x <= 1000) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasSameLastDigit(int x, int y, int z) {
		boolean returnValue = false;

		if (isValid(x) && isValid(y) && isValid(y)) {
			x = x % 10;
			y = y % 10;
			z = z % 10;

			if (x == y || y == z || x == z) {
				returnValue = true;
			}
		}

		return returnValue;
	}

}

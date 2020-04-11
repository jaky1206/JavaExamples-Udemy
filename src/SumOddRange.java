
public class SumOddRange {
	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));

	}

	public static boolean isOdd(int number) {
		if (number > 0) {
			return (number % 2 != 0);

		} else {
			return false;
		}
	}

	public static int sumOdd(int start, int end) {
		int result = -1;
		if (start <= end && start > 0 && end > 0) {
			result = 0;
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					result += i;
				}
			}
		}

		return result;
	}
}

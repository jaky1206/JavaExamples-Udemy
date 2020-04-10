public class TeenNumberChecker {
	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));

	}

	public static boolean hasTeen(int x, int y, int z) {
		if (isTeen(x) || isTeen(y) || isTeen(z)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isTeen(int a) {
		if (a >= 13 & a <= 19) {
			return true;
		} else {
			return false;
		}
	}
}

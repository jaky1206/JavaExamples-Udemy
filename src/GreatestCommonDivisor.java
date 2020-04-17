
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));
	}

	public static int getGreatestCommonDivisor(int first, int second) {
		int returnValue = -1;
		int tempValue = 1;

		if (first >= 10 && second >= 10) {
			while (tempValue <= first && tempValue <= second) {
				if ((first % tempValue == 0) && (second % tempValue == 0)) {
					returnValue = tempValue;
				}
				tempValue += 1;
			}
		}

		return returnValue;
	}

}


public class FlourPacker {

	public static void main(String[] args) {

		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
		System.out.println(canPack(2, 2, 11));
		System.out.println(canPack(-3, 2, 12));

		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(4, 18, 19));
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		boolean returnValue = false;

		if ((bigCount * 5) + smallCount == goal) {
			returnValue = true;
		} else if ((bigCount * 5) + smallCount > goal) {
			if (goal - (bigCount * 5) > 0) {
				if (smallCount - (goal - (bigCount * 5)) >= 0) {
					returnValue = true;
				}
			} else {
				for (int i = 1; i <= bigCount; i++) {
					if (((i * 5) + smallCount) - goal >= 0 && (i * 5) <= goal) {
						returnValue = true;
						break;
					}
				}
			}
		}

		return returnValue;
	}
}

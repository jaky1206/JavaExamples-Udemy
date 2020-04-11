
public class SharedDigit {

	public static void main(String[] args) {

		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));

	}

	public static boolean hasSharedDigit(int x, int y) {
		
		boolean returnValue = false;
		int tmpDigit = 0;
		
		if ((x >=10 && x <= 99) && (y >=10 && y <= 99)) {
			while(x > 0) {
				tmpDigit = x %10;
				if(String.valueOf(y).indexOf(String.valueOf(tmpDigit)) != -1) {
					returnValue = true;
					break;
				}
				x /= 10;
			}
		} 
		return returnValue;
	}

}

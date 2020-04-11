
public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}

	public static boolean isPalindrome(int number) {
		number = Math.abs(number);
		int num = number;
		int reverse = 0;
		int lastDigit = 0;
		while (num > 0) {
			lastDigit = num % 10;
			reverse *= 10;
			reverse = reverse + lastDigit;
			num /= 10;
		}
		return (reverse ==  number);
	}

}

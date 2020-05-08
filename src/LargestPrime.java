
public class LargestPrime {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(1));
		System.out.println(getLargestPrime(2));
		System.out.println(getLargestPrime(16));
	}

	public static int getLargestPrime(int number) {
		// Initialize the maximum prime
		// factor variable with the
		// lowest one
		int maxPrime = -1;

		if (number > 0) {
			// Print the number of 2s
			// that divide n
			while (number % 2 == 0) {
				maxPrime = 2;

				// equivalent to n /= 2
				number >>= 1;
			}

			// n must be odd at this point,
			// thus skip the even numbers
			// and iterate only for odd
			// integers
			for (int i = 3; i <= Math.sqrt(number); i += 2) {
				while (number % i == 0) {
					maxPrime = i;
					number = number / i;
				}
			}

			// This condition is to handle
			// the case when n is a prime
			// number greater than 2
			if (number > 2)
				maxPrime = number;
		}

		return maxPrime;
	}

}

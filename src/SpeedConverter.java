public class SpeedConverter {
	public static void main(String[] args) {
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		double result = (double) -1;
		if (kilometersPerHour >= 0) {
			result = kilometersPerHour * 0.6215;
		}
		return Math.round(result);
	}

	public static void printConversion(double kilometersPerHour) {
		long result = toMilesPerHour(kilometersPerHour);
		if (result >= 0) {
			System.out.println(kilometersPerHour + " km/h = "+ result +" mi/h");
		} else {
			System.out.println("Invalid Value");
		}
	}
}

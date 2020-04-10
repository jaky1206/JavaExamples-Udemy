
public class MinutesToYearsDaysCalculator {
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}

	public static void printYearsAndDays(long minutes) {
		long years = 0;
		long days = 0;
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			years = (minutes / (60 * 24)) / 365;
			days = (minutes / (60 * 24)) % 365;
			System.out.println(String.format("%d min = %d y and %d d", minutes, years, days));
		}
	}
}


public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));
	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static int getDaysInMonth(int month, int year) {
		int returnValue = -1;
		if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
			switch (month) {
			case 2:
				if (isLeapYear(year)) {
					returnValue = 29;
				} else {
					returnValue = 28;
				}
				break;
			case 4:
				returnValue = 30;
				break;
			case 6:
				returnValue = 30;
				break;
			case 9:
				returnValue = 30;
				break;
			case 11:
				returnValue = 30;
				break;
			default:
				returnValue = 31;
				break;
			}
		}
		return returnValue;
	}
}

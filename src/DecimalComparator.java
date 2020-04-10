
public class DecimalComparator {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, -3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

	}

	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		if((String.valueOf(x).substring(String.valueOf(x).lastIndexOf('.'), String.valueOf(x).length())).length() <=4) {
			x = Double.parseDouble(String.format("%.03f", x));
		}
	
		if((String.valueOf(y).substring(String.valueOf(y).lastIndexOf('.'), String.valueOf(y).length())).length() <=4) {
			y = Double.parseDouble(String.format("%.03f", y));
		}
		
		if((String.valueOf(x).substring(String.valueOf(x).lastIndexOf('.'), String.valueOf(x).length())).length() >4) {
			x = Double.parseDouble(String.valueOf(x).substring(0, String.valueOf(x).lastIndexOf('.')+4));	
		}
		if((String.valueOf(y).substring(String.valueOf(y).lastIndexOf('.'), String.valueOf(y).length())).length() >4) {
			y = Double.parseDouble(String.valueOf(y).substring(0, String.valueOf(y).lastIndexOf('.') + 4));
		}
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}
}

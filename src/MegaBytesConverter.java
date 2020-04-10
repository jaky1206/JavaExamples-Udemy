
public class MegaBytesConverter {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");

		} else {
			int rMB = kiloBytes / 1024;
			int rKB = kiloBytes % 1024;

			System.out.println(String.format("%d KB = %d MB and %d KB", kiloBytes, rMB, rKB));
		}
	}

}

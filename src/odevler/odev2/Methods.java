package odevler.odev2;

public class Methods {
	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int aranacak = 5;
		boolean varMi = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == aranacak) {
				varMi = true;
				break;
			}
		}

		String message = "Say� ";
		if (varMi) {

			mesajVer(message + "bulundu: " + aranacak);
		} else {
			System.out.println(message + "bulunamad�: " + aranacak);
		}
	}

	public static void mesajVer(String message) {
		System.out.println(message);
	}
}

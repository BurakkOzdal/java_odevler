package odevler.hafta2;

public class Variables {
	public static void main(String[] args) {
		int sayi = toplam(4, 0, 4);
		System.out.println(sayi);

	}

	public static int toplam(int... numbers) {
		int toplam = 0;
		for (int number : numbers) {
			toplam += number;
		}
		return toplam;
	}
}

package odevler.odev2;

public class ParametreliMethot {
	
	public static void main(String[]args) {
		String message="bugün hava çok güzel";
		String newMessage=mesajVer();
				
		System.out.println(newMessage);
		
		int toplam=topla(1, 4);
		System.out.println(toplam);
		
	}
	public static void ekle() {
		System.out.println("eklendi");
			
		}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int topla(int a, int b) {
		return a+b;
	}
	
	public static String mesajVer() {
		return "Selamlar";
	}
	
}
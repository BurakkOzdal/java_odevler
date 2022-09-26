package odevler.odev2.classes.reCapDemo;

public class ReCapMain {
	
	public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int topla = dortIslem.topla(7, 8);
        System.out.println(topla);

        int cikar = dortIslem.cikar(8, 7);
        System.out.println(cikar);

        int carp = dortIslem.carp(7, 8);
        System.out.println(carp);

        int bol = dortIslem.bol(7, 8);
        System.out.println(bol);

    }

}

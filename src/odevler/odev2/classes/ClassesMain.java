package odevler.odev2.classes;

public class ClassesMain {
	
	public static void main(String[]args) {
	
	// reference Type
	CustomerManager customerManager=new CustomerManager();
	customerManager.name="mehmet";
	CustomerManager customerManager2 = new CustomerManager();
    customerManager2.name ="Ahmet";

    customerManager = customerManager2;

	customerManager.Add();
	customerManager.Remove();
	customerManager.Update();
	

     // value type

     int sayi1 = 10;
     int sayi2 = 20;
     sayi1 = sayi2;
     sayi2 = 100;
     System.out.println(sayi1);

     // Reference type Array
     int[]sayilar1 = new int[]{1,2,3};
     int[]sayilar2 = new int[]{4,5,6};
     sayilar2 = sayilar1;
     sayilar1[0] = 10;
     System.out.println(sayilar2[0]);
	
	}

}

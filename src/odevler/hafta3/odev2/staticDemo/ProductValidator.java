package odevler.hafta3.odev2.staticDemo;

public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok çalıştı!!");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı!!");
    }

    public static boolean isValid(Product product){
        return product.price > 0 && !product.name.isEmpty();
    }
}

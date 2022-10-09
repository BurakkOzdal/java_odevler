package odevler.hafta3.odev2.staticDemo;

public class Main {
    public static void main(String[] args){
        Product product=new Product();
        product.name="şl";
        product.price=10000;

        ProductManager manager=new ProductManager();
        manager.add(product);
    }
}

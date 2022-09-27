package odevler.odev2.constructor;

public class Constructor {
    public static void main(String[]args){
        ProductConstructor product = new ProductConstructor(1,"Laptop","Gaming",10000,10);

        System.out.println(product.getDescription() );
    }
}

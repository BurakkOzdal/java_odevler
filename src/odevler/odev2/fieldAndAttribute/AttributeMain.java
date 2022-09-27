package odevler.odev2.fieldAndAttribute;

public class AttributeMain {
    public static void main(String[]args){
        Product product =new Product();
        product.id=1;
        product.name="Laptop";
        product.description="Monster Gaming";
        product.price=10000;
        product.unitsInStock=10;

        ProductManager manager=new ProductManager();
        manager.Add(product);

    }
}

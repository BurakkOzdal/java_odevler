package odevler.hafta3.odev2.polimorfizm;

public class Main {
    public static void main(String[] args) {
        CustomerManager manager=new CustomerManager(new DatabaseLogger());
        manager.Add();
    }
}

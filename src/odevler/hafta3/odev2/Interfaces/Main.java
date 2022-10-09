package odevler.hafta3.odev2.Interfaces;

public class Main {
    public static void main(String[] args){
        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}

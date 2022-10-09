package odevler.hafta3.odev2.abstracts.demo;

public class Main {
    public static void main(String[] args){
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}

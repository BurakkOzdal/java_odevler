package odevler.hafta3.odev2.abstracts.demo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        this.databaseManager.getData();
    }
}

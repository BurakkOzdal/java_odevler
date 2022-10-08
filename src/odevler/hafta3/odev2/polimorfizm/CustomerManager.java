package odevler.hafta3.odev2.polimorfizm;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void Add(){
        this.logger.Log("Müşteri Eklendi...");
    }
}

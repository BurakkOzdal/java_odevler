package odevler.hafta3.odev2.Interfaces;

public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal=customerDal;
    }

    public void add(){
        this.customerDal.add();
    }
}

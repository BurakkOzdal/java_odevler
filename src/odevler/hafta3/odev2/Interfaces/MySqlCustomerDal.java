package odevler.hafta3.odev2.Interfaces;

public class MySqlCustomerDal implements CustomerDal{
    @Override
    public void add() {
        System.out.println("Mysql");
    }
}

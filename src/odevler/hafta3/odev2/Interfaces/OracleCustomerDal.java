package odevler.hafta3.odev2.Interfaces;

public class OracleCustomerDal implements CustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle");
    }
}

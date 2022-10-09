package odevler.hafta3.odev2.abstracts.demo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi SQL Server");
    }
}

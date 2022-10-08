package odevler.hafta3.odev2.polimorfizm;

public class DatabaseLogger extends BaseLogger{

    public  void Log(String message){
        System.out.println("Logged to DB "+message);
    }
}

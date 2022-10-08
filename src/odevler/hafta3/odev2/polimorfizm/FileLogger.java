package odevler.hafta3.odev2.polimorfizm;

public class FileLogger extends BaseLogger{

    public  void Log(String message){
        System.out.println("Logged to file "+message);
    }
}

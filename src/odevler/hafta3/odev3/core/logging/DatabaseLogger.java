package odevler.hafta3.odev3.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message+" DB loglandı...");
    }
}

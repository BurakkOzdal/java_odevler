package odevler.hafta3.odev3.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message+" Dosyaya loglandı...");
    }
}

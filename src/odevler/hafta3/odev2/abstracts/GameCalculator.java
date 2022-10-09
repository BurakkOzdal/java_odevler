package odevler.hafta3.odev2.abstracts;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}

package odevler.hafta3.odev2.abstracts;

public class GamerManager {
    private GameCalculator gameCalculator;

    public GamerManager(GameCalculator gameCalculator){
        this.gameCalculator=gameCalculator;
    }

    public void play(){
        this.gameCalculator.hesapla();
    }
}

package odevler.hafta3.odev2.abstracts;

public class Main {
    public static void main(String[] args){

        GamerManager gamerMan=new GamerManager(new ManGameCalculator());
        gamerMan.play();

        GamerManager gamerWoman=new GamerManager(new WomanGameCalculator());
        gamerWoman.play();

    }
}

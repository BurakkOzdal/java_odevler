package odevler.hafta3.odev2.overriding;

public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar*1.18;
    }

    //Bir methodun ezilmesini engellemek istersek public final şeklinde imzalamamız gerekmekte.
}

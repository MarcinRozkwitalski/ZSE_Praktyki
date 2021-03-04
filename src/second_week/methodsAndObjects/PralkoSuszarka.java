package second_week.methodsAndObjects;

interface Suszarka {
    void suszaniePranie();
}

interface Pralka {
    void pranieBawelny();
    void praniePoscieli();
    void pranieCiuchow();
}


public class PralkoSuszarka implements Pralka, Suszarka {

    private int czas;
    private int temperatura;
    private int wirowanie;
    
    @Override
    public void suszaniePranie() {
        czas = 135;
        temperatura = 50;
        wirowanie = 1000;
        wlacz();
    }

    @Override
    public void pranieBawelny() {
        czas = 65;
        temperatura = 30;
        wirowanie = 600;
        wlacz();
    }

    @Override
    public void praniePoscieli() {
        czas = 80;
        temperatura = 50;
        wirowanie = 1200;
        wlacz();
    }

    @Override
    public void pranieCiuchow() {
        czas = 120;
        temperatura = 60;
        wirowanie = 1000;
        wlacz();
    }

    private void wlacz() {
        System.out.println("Wlaczamy pralkoSuszarke " +
                            " ustawiamy temperature na: " + temperatura
                            + " stopni, wirowanie: " + wirowanie +
                            "obrotów i czas trwania na: " + czas + "minut");
    }

    public static void main(String[] args) {
        PralkoSuszarka pralkoSuszarka = new PralkoSuszarka();

        Suszarka suszarka = pralkoSuszarka;
        Pralka pralka = pralkoSuszarka;

        suszarka.suszaniePranie();
        pralka.pranieBawelny();
        pralka.pranieCiuchow();
        pralka.praniePoscieli();
    }
}

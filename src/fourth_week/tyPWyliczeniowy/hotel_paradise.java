package fourth_week.tyPWyliczeniowy;


import java.util.Scanner;

public class hotel_paradise {

    public void dane() {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Witamy na stronie Hotelu Paradajs. \n" + "Cieszymy się, że wybrał/a Pan/i nasz hotel. W ofercie mamy wiele do zaoferawania, ale zacznijmy od kwestii organizacyjnych");
        System.out.println("Prosimy podać dane osobowe: ");
        System.out.print("Imię: ");
        String imie = skaner.next();
        System.out.print("Nazwisko: ");
        String nazwisko = skaner.next();

        String email;
        do {
            System.out.print("E-mail: ");
            email = skaner.next();
        } while (!email.contains("@"));

        int nr;
        do {
            System.out.print("Numer telefonu: ");
            nr = skaner.nextInt();
        } while (nr <= 99999999);

        System.out.print("Adres: ");
        String adres = skaner.next();

        String poczta;
        do {
            System.out.print("Kod pocztowy: ");
            poczta = skaner.next();
        } while (!poczta.contains("-"));

        System.out.print("Miasto: ");
        String miasto = skaner.next();


    }

    public int pokoje(int cena) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Proszę wybrać rodzaj pokoju: ");
        System.out.println("Jednoosobowy - 100zł/doba");
        System.out.println("Dwuosobowy - 200zł/doba");
        System.out.println("Trzyosobowy - 250zł/doba");

        String osoby = skaner.next();

        switch (osoby) {
            case "Jednoosobowy":
                cena = cena + 100;
                System.out.println("Wybrałeś/aś pokój jednoosobowy");
                break;
            case "Dwuosobowy":
                cena = cena + 200;
                System.out.println("Wybrałeś/aś pokój dwuosobowy");
                break;
            case "Trzyosobowy":
                cena = cena + 250;
                System.out.println("Wybrałeś/aś pokój trzyosobowy");
                break;
        }

        System.out.print("Wybierz ile dni (1-7) chcesz spędzić w naszym cudownym hotelu: ");
        String dni = skaner.next();
        switch (dni) {
            case "1":
                cena = cena * 1;
                break;
            case "2":
                cena = cena * 2;
                break;
            case "3":
                cena = cena * 3;
                break;
            case "4":
                cena = cena * 4;
                break;
            case "5":
                cena = cena * 5;
                break;
            case "6":
                cena = cena * 6;
                break;
            case "7":
                cena = cena * 7;
                break;
        }

        System.out.println("Czy interesuje Pana/Panią wersja all inclusive za dodatkowe 500zł (Tak/Nie)?");
        String odp = skaner.next();
        if (odp.equals("Tak")) {
            cena = cena + 500;
        }

        System.out.println(cena + " zł");

        return cena;

    }

    public void platnosc() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Płatność karta/gotówka?");
        String kasa = skaner.next();

        switch (kasa) {
            case "gotówka":
                System.out.println("Wybrałeś/aś płatność gotówką.");
                break;
            case "karta":
                System.out.println("Wybrałeś/aś płatność kartą.");
                break;
        }
    }

    public static void main(String[] args) {
        hotel_paradise hotel_paradise = new hotel_paradise();

        hotel_paradise.dane();
        hotel_paradise.platnosc();

        int cena = 0 ;
        System.out.println("CENA =" + hotel_paradise.pokoje(cena));
    }
}
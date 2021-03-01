package first_week.basics;

import java.util.Scanner;

public class lekcja_basics {

    public static void main(String[] args) {

        // Zadanie 1
        Scanner skaner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int liczba = skaner.nextInt();

        if (liczba > 0){
            System.out.println("Liczba jest większa od 0.");
        }
        else{
            if (liczba < 0){
                System.out.println("Liczba jest mniejsza od 0.");
            }
            else{
                System.out.println("Liczba jest równa 0.");
            }
        }

        // Zadanie 2
        System.out.print("Wprowadź pierwszą liczbę: ");
        int Liczba1 = skaner.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int Liczba2 = skaner.nextInt();
        System.out.print("Wprowadź trzecią liczbę: ");
        int Liczba3 = skaner.nextInt();

        if (Liczba1 > Liczba2){
            if (Liczba1 > Liczba3){
                System.out.println("Najwększą liczbą jest liczba pierwsza: " + Liczba1 + ".");
            }
            else{
                System.out.println("Najwększą liczbą jest liczba trzecia: " + Liczba3 + ".");
            }
        }
        else{
            if (Liczba2 > Liczba3){
                System.out.println("Najwększą liczbą jest liczba druga: " + Liczba2 + ".");
            }
            else{
                System.out.println("Najwększą liczbą jest liczba trzecia: " + Liczba3 + ".");
            }
        }

        // Zadanie 3
        System.out.print("Podaj login: ");
        String login = skaner.next();
        System.out.print("Podaj hasło: ");
        String haslo = skaner.next();

        String loginPrawidlowy = "Login321";
        String hasloPrawidlowy = "haseło";

        if (loginPrawidlowy.equals(login)){
            if (hasloPrawidlowy.equals(haslo)){
                System.out.println("Pomyślnie zalogowano.");
            }
            else{
                System.out.println("Nieprawidłowe hasło.");
            }
        }
        else{
            System.out.println("Nie znaleziono użytkownika.");
        }

        //Zadanie 4
        System.out.print("Wprowadź pierwszą liczbę: ");
        int jeden = skaner.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int dwa = skaner.nextInt();
        System.out.print("Wprowadź trzecią liczbę: ");
        int trzy = skaner.nextInt();

        if (jeden > dwa){
            if (dwa > trzy){
                System.out.println("Kolejność malejąca.");
            }
            else{
                System.out.println("Brak kolejności.");
            }
        }
        else {
            if (jeden < dwa) {
                if (dwa < trzy) {
                    System.out.println("Kolejność rosnąca.");
                }
                else {
                    System.out.println("Brak kolejności.");
                }
            }
            else {
                System.out.println("Brak kolejności.");
            }
        }

        // Zadanie 5
        System.out.print("Wprowadź pierwszą liczbę: ");
        float Liczba11 = skaner.nextFloat();
        System.out.print("Wprowadź drugą liczbę: ");
        float Liczba12 = skaner.nextFloat();
        System.out.print("Którą operację chcesz wykonać? (+, -, *, /): ");
        char dzialanie = skaner.next().charAt(0);
        float wynik;

        if (dzialanie == 43){ // 43, ponieważ taką liczbę ma dodawanie w tabeli ASCII, dla reszty analogicznie
            wynik = Liczba11 + Liczba12;
            System.out.println("Wynik dodawania wynosi: " + wynik);
        }
        else{
            if (dzialanie == 45){
                wynik = Liczba11 - Liczba12;
                System.out.println("Wynik odejmowania wynosi: " + wynik);
            }
            else{
                if (dzialanie == 42){
                    wynik = Liczba11 * Liczba12;
                    System.out.println("Wynik mnożenia wynosi: " + wynik);
                }
                else{
                    if (dzialanie == 47){
                        wynik = Liczba11 / Liczba12;
                        System.out.println("Wynik dzielenia wynosi: " + wynik);
                    }
                    else{
                        System.out.println("Wprowadzono błędny znak.");
                    }
                }
            }
        }


    }
}

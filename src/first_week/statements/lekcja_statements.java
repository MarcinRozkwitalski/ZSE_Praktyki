package first_week.statements;

import java.util.Scanner;

public class lekcja_statements {

    /*
    postać instrukcji warunkowej IF oraz ELSE:
    (musi istnieć IF przed ELSE):

    if (warunek){
        zrobCos1;
        zrobCos2;
        ...
        zrobCosX;
    }
    else{
        zrobCosInnego1;
        zrobCosInnego2;
        ...
        zrobCosInnegoX;
    }
     */

    /*
    if (warunek){
        zrobCos1;
        zrobCos2;
        ...
        zrobCosX;
    }
    else{
        zrobCosInnego1;
        zrobCosInnego2;
        ...
        zrobCosInnegoX;
    }
    if (warunek){
        zrobCos1;
        zrobCos2;
        ...
        zrobCosX;
    }
    else{
        zrobCosInnego1;
        zrobCosInnego2;
        ...
        zrobCosInnegoX;
    }
    if (warunek){
        zrobCos1;
        zrobCos2;
        ...
        zrobCosX;
    }
    else{
        zrobCosInnego1;
        zrobCosInnego2;
        ...
        zrobCosInnegoX;
    }
     */

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        boolean stan = false;

        if(stan){
            System.out.println("Wykonała się instrukcja IF.");
        }
        else{
            System.out.println("Wykonała się instrukcja ELSE.");
        }

        System.out.print("Podaj swój wiek: ");
        int wiek = skaner.nextInt();

        if(wiek >= 18){
            System.out.println("Jesteś pełnoletni!");
        }
        else{
            System.out.println("Jesteś niepełnoletni!");
        }

        System.out.println("Podaj liczbę: ");
        int liczba = skaner.nextInt();

        if(10 < liczba && liczba < 20){
            System.out.println("Liczba mieści się w zakresie.");
        }
        else{
            System.out.println("Liczba NIE mieści się w zakresie.");
        }

        System.out.print("Podaj liczbę całkowitą A: ");
        int a = skaner.nextInt();

        System.out.print("Podaj liczbę całkowitą B: ");
        int b = skaner.nextInt();

        if(a > b){
            System.out.println("A jest większe od B.");
        }
        if(a < b){
            System.out.println("A jest mniejsze od B.");
        }
        if(a == b){
            System.out.println("A jest równe B.");
        }

        if(a > b){
            System.out.println("A jest większe od B.");
        }
        else {
            if (a < b) {
                System.out.println("A jest mniejsze od B.");
            }
            else {
                System.out.println("A jest równe B.");
            }
        }

        char charA = 'A';
        char charB = 'B';

        if (charA > charB){
            System.out.println("charA ma większą wartość od charB w tabeli ASCII.");
        }
        else{
            System.out.println("charA ma mniejszą wartość od charB w tabeli ASCII.");
        }

        String hello = "hello";
        String world = "world";

        if(hello.equals(world)){
            System.out.println("hello jest równe world");
        }
        else {
            System.out.println("hello nie jest równe world");
        }

        System.out.print("Podaj swój wybór (1, 2): ");
        int x = skaner.nextInt();

        switch (x){
            case 1:
                System.out.println("Przypadek pierwszy.");
                break;
            case 2:
                System.out.println("Przypadek drugi.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;
        }

        System.out.print("Podaj swój wybór (1, 2, A, B): ");
        String y = skaner.next();

        switch (y){
            case "1":
                System.out.println("Przypadek pierwszy.");
                break;
            case "2":
                System.out.println("Przypadek drugi.");
                break;
            case "A":
                System.out.println("Przypadek A.");
                break;
            case "B":
                System.out.println("Przypadek B.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;
        }

        System.out.print("Podaj swój wybór (1, 2, A, B): ");
        char z = skaner.next().charAt(0);

        switch (z){
            case '1':
                System.out.println("Przypadek pierwszy.");
                break;
            case '2':
                System.out.println("Przypadek drugi.");
                break;
            case 'A':
                System.out.println("Przypadek A.");
                break;
            case 'B':
                System.out.println("Przypadek B.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;
        }
    }

}

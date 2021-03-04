package second_week.methodsAndObjects;

import java.util.Scanner;

public class MetodyLekcja {

    static int addNumbers(int number1, int number2, int number3) {
        return number1 + number2 +number3;
    }

    static String getName() {
        return "Wojtek";
    }

    static void printSomething() {
        System.out.println("\nSomething");
    }

    static void printSomethingIfNumberIsBig (int number) {
        if ( number < 10) {
            return;
        }
        System.out.println("Something wupluwam się bo liczba była wieksza od 10");
    }

    static boolean isLegal (int someAge) {
        return someAge >= 16;
    }

    public static void main(String[] args) {
    //    System.out.println("Wywołanie metody Dodawania");
//
    //    int suma = addNumbers(5,6,2);
//
    //    System.out.println("Wynik to: " + suma);
//
    //    System.out.println("Przykładowe Imie: " + getName());
//
    //    printSomething();
//
//
    //    Scanner skaner = new Scanner(System.in);
//
//
    //    System.out.println("Podaj Przykladowa liczba od 0 do 100");
    //    int liczba = skaner.nextInt();printSomethingIfNumberIsBig(liczba);

        int someAge = 16;
        boolean result = isLegal(someAge);

        System.out.println("Age" + someAge + " is Legal \n That statement is: " + result);

    }

}

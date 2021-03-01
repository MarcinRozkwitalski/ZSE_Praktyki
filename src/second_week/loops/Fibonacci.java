package second_week.loops;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner liczba_przejsc = new Scanner(System.in);

        int number;

        int fibonacci1 = 0;
        int fibonacci2 = 1;

        // 0 1 1 2 3 5 8 13 21 34 .....
        int fibonacci3 = 0;

        System.out.println("Podaj ile liczb ciagu fibonacciego chcesz wypisac");
        number = liczba_przejsc.nextInt();

        //The number 2,147,483,647



    System.out.println(fibonacci1);
        System.out.println(fibonacci2);

        for ( int i = 3; i <= number; i++){
            fibonacci3 = fibonacci1 + fibonacci2;
            System.out.println(fibonacci3);

            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;

            // po pierwszym  1 = 1   2 = 1     po drugim  1= 1  2=2   po trzecim  1 = 2 2= 3
        }

    }
}

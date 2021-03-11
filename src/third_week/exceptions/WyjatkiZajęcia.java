package third_week.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiZajęcia {

    public static void isNotNegative(int b) throws Exception {

        if ( b<0 ){
            throw new Exception();
        }
    }

    public static void main(String[] args) {


        int i = 1;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Podaj Liczbe A: ");
                int A = scanner.nextInt();

                System.out.println("Podaj Liczbe B: ");
                int B = scanner.nextInt();
                System.out.println("liczba a: " + A + "  Liczba B :" + B);

                isNotNegative(B);

                System.out.println(A / B);

                break;

            } catch (ArithmeticException przezOsieniedzieli) {
                System.out.println("Nie dzielimy przez 0");
            } catch (InputMismatchException zlyTypDanychWyjatek) {
                System.out.println("Podano Zły typ danych :(");
            } catch (Exception exception) {
                System.out.println(" B nie było liczba Dodatnia");
            }
        }
    }


    }




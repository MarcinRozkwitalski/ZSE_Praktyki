package fourth_week.tyPWyliczeniowy;

import java.util.Scanner;

public class Sprawdzanie {

    public static void main(String[] args) {
        System.out.println("podaj string:");
        Scanner scanner = new Scanner(System.in);
        java.lang.String string = scanner.nextLine();

        if (string.equals("mam spacje"))
            System.out.println("siema");
        else
            System.out.println("nie siema");
    }
}

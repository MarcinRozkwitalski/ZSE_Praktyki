package first_week.basics;

public class lekcja_basics {




    // to jest nasza metoda głowna
    public static void main(String[] args) {

        // liczby calkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        // Dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawnanie wynik: " + sum );

        // Odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie wynik: " + sum);

        // Mnożenie zmiennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie wynik: " + sum);

        // Dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("Dzienie B przez 2: " + sum);

        sum = myIntC / 2;
        System.out.println("Dzienie C = 77 przez 2: " + sum);

        // float / double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;

        System.out.println(sumDouble);




        // znaki ( characters )

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("mOJA ULUBIONA LITERKA TO: " + myCharA);
        System.out.println("moj ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to : " + sumChar);


        // string  ciagi znakow  slowa i wyrazy
        String myStringA = "Marcin";
        String myStringB = "lubi placki";
        String myStringC = " z dzemem.";

        System.out.println(myStringA + "\n\n\n\n\n" + myStringB + myStringC);


        // boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);







    }
}

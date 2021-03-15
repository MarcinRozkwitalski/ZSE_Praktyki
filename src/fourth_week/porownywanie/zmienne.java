package fourth_week.porownywanie;

public class zmienne {

    public static void main(String[] args) {

        System.out.println("10 == 10: " + (10 == 10)); //int == int
        System.out.println("10 != 10: " + (10 != 10)); //int != int
        System.out.println("true == true: " + (true == true)); //boolean == boolean
        System.out.println("true != true: " + (true != true)); //boolean != boolean
        System.out.println("true == false: " + (true == false)); //boolean == boolean
        System.out.println("true != false: " + (true != false)); //boolean != boolean
        System.out.println("'a' == 'a': " + ('a' == 'a')); //char == char
        System.out.println("'a' != 'a': " + ('a' != 'a')); //char != char
        System.out.println("Tak == Tak: " + ("Tak" == "Tak")); //String == String
        System.out.println("Tak != Tak: " + ("Tak" != "Tak")); //String != String


        System.out.println("10 == 1 + 2 + 3 + 4: " + (10 == 1 + 2 + 3 + 4));
        System.out.println("4 + 6 + 8 == 3 + 7 + 9: " + (4 + 6 + 8 == 3 + 7 + 9));

        System.out.println("3 * 4 + 2 != 14: " + (3 * 4 + 2 != 14));

        System.out.println("(8 + 2)/(4 * 5) == 0.5: " + ((8.0 + 2.0)/(4.0 * 5.0) == 0.5));
        System.out.println("(8 + 2)*(4 / 5) == 8.0: " + ((8.0 + 2.0)*(4.0 / 5.0) == 8.0));

        //System.out.println("10 == 10" + 10 == 10);

        System.out.println("0.3 == 0.1 + 0.2: " + (0.3 == 0.1 + 0.2));
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        System.out.println("0.3 == 0.1 + 0.2: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.000001));

    }

}

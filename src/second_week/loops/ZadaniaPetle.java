package second_week.loops;

public class ZadaniaPetle {

    public static void main(String[] args) {

       int i;

       System.out.println("Pierwsza Petla");

       // czyrtelniejszy sposob zapisu
       for ( i = 10; i >= 0 ; i = i-5 ) {
           System.out.println("I to = " + i);
       }

       // inny sposob zapisu
       for ( i = 10; i >= 0 ; i-=5 ) {
           System.out.println("I to = " + i);
       }

       System.out.println("Druga  Petla");
       for ( int number1 = 0, number2 = 9; number1 <= 9; number1++,number2-- ) {
           System.out.println("NUMBER1 = " + number1 + " " + "Number2 = " + number2);
       }

          System.out.println("Trzecia  Petla");
       int x = 0;//    int y = 0;

       while (x != 10) {
           x++;
           System.out.println(x);
       }

       while ( x < 20) {
           x+=2;
           System.out.println(x +" " + y);
       }


        int numberC = 6;

       do {
           System.out.println("Zmienna =" + numberC);
           numberC++;
       } while ( numberC < 12);
           System.out.println("Tabliczka Mnozenia");

       for (int i = 1; i < 11; i++) {
           System.out.println(i + " przejscie pętli");
           for ( int j = 1; j < 11; j++) {
               System.out.println(" [i:" + i + "]" + "j:" + j + "]\t" + i +"*" + j + " = " + i *j + "\t");
           }
       }

       for ( int x = 0 ; x <= 20 ; x++) {
           for ( int y = 0 ; y <=5; y ++) {
               System.out.println(" x+y = " + (x+y) );
           }
       }

        int sum = 0;

        for ( int zadanie1 = 1; zadanie1 < 11 ; zadanie1++){
           sum = sum + zadanie1;
        }

        System.out.println(sum);








    }


}

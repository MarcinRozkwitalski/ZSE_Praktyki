package second_week.multiArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lekcja_multiArrays {

    public static void main(String[] args) {

        //tablica dwuwymiarowa
        int[][] twoDarray = new int[10][20]; //10 * 20 = 200 elementów w takiej tablicy

        //tablica trójwymiarowa
        int[][][] threeDarray = new int[5][10][20]; //5 * 10 * 20 = 1000 elementów w takiej tablicy

//        twoDarray[0][0] = 1;
//
//        System.out.println("twoDarray = " + twoDarray[0][0]);

//        int[][] array2 = new int[10][10];
//        int value = 0;
//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < 10; j++){
//                array2[i][j] = value;
//                value = value + 2;
//                System.out.print(array2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][][] array3 = new int[3][3][3];
//        int value2 = 0;
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                for (int n = 0; n < 3; n++){
//                    array3[i][j][n] = value2;
//                    value2 += 3;
//                    System.out.print("[" + i + "][" + j + "][" + n + "] = " + array3[i][j][n] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

//        System.out.println("Wypisywanie tablicy: ");
//        String[] owoce = new String[3];
//        owoce[0] = "Mango";
//        owoce[1] = "Banan";
//        owoce[2] = "Smoczy owoc";
//        System.out.println(Arrays.toString(owoce));
//        System.out.println(owoce[0] + ", " + owoce[1] + ", " + owoce[2]);
//
//        System.out.println("Wypisywanie listy: ");
//        ArrayList<String> lista_owocow = new ArrayList<>();
//        lista_owocow.add("Mango");
//        lista_owocow.add("Banan");
//        lista_owocow.add("Smoczy owoc");
//        System.out.println(lista_owocow);


        //Stworzenie listy
        ArrayList<String> lista_owocow2 = new ArrayList<>();
        lista_owocow2.add("Truskawka");
        lista_owocow2.add("Banan");
        lista_owocow2.add("Smoczy owoc");
        lista_owocow2.add("Jabłko");
        System.out.println(lista_owocow2);

        //Dodanie nowego obiektu do listy aby dodac nowy obiekt do
        lista_owocow2.add(1, "Maracuja");
        System.out.println(lista_owocow2);

        //Usuwanie obiektu z listy
        lista_owocow2.remove("Banan");
        lista_owocow2.remove(2);
        System.out.println(lista_owocow2);

        //Nadpisywanie obiektów w liście
        lista_owocow2.set(0, "Arbuz");
        System.out.println(lista_owocow2);

        //Sortowanie listy
        Collections.sort(lista_owocow2);
        System.out.println(lista_owocow2);

        //Czyszczenie listy
        lista_owocow2.clear();
        System.out.println(lista_owocow2);

    }

}

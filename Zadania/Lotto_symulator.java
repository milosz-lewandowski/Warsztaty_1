package Zadania;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lotto_symulator {
    public static void main(String[] args) {
        System.out.println("Witaj w LOTTO!");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Wprowadź " + (i + 1) + " liczbę (od 1 do 49):");
            String l = scanner.nextLine();
            try {
                int x = Integer.parseInt(l);
                if (checkIf(arr, x) == true){
                    System.out.println("Podawałeś już tą liczbę!");
                    i--;
                }
                else if (x < 1){
                    System.out.println("Podałeś za małą liczbę!");
                    i--;
                }
                else if (x > 49){
                    System.out.println("Podałeś za dużą liczbę!");
                    i--;
                }
                arr[i] = x;

            } catch (Exception e){
                System.out.println("To nie jest liczba!");
                i--;
            }


        }
        int[] sorted = arr;
        Arrays.sort(sorted);
        System.out.println("Postawiłeś na liczby: " + Arrays.toString(sorted));
        Random r = new Random();
        int[] toogled = new int[6];
        for (int i = 0; i < toogled.length; i++){
            int a = r.nextInt(49)+1;
            if (checkIf(toogled, a) == true) {
                i--;
            }
            toogled[i] = a;
        }
        Arrays.sort(toogled);
        System.out.println("Liczby, które padły w losowaniu to: " + Arrays.toString(toogled));
        int trafione = 0;
        for (int i = 0; i < toogled.length; i++){
            for (int c : sorted){
                if (toogled[i] == c){
                    trafione++;
                }
            }
        }
        if (trafione >= 3) System.out.println("Brawo, trafiłeś trójkę, lub lepiej");
        else System.out.println("Niestety, nic nie wygrałeś, musisz trafić minimum 3 :c");



    }
    static boolean checkIf(int[] tab, int szukana){
        for (int a : tab){
            if (a == szukana){
                return true;
            }

        }
        return false;

    }
}
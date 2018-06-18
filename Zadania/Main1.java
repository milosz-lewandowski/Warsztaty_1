package Zadania;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Random r = new Random();
        int rand = r.nextInt(99) +1;
        Scanner scanner = new Scanner(System.in);
        String liczba = "";
        int q = 1;
        int l = 0;
        while (l != rand) {
            System.out.println("Wpisz liczbę od 1 do 100: ");
            liczba = scanner.nextLine();
            try {
                l = Integer.parseInt(liczba);
                if (l < rand) {
                    System.out.println("Za mało!");
                    q++;
                }
                else if (l > rand) {
                    System.out.println("Za dużo!");
                    q++;
                }
            }
            catch (Exception e){
                System.out.println("To nie liczba! Musisz podać liczbę...");
            }



        }
        System.out.println("Zgadłeś przy " + q + " próbie");

    }
}
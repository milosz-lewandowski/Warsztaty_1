package Zadania;

import java.util.Scanner;

public class Gra_w_zgadywanie_liczb {
    public static void main(String[] args) {
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w maks 10 próbach \n" +
                "Musisz mi udzielać wskazówek wpisując dokładnie \"za dużo\", \"za mało\", lub \"zgadłeś\" \n" +
                "Kliknij enter jak będziesz gotowy!");
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 1000;
        int guess;
        String resp ="";
        int loop = 0;

        while (resp != "zgadłeś") {
            guess = ((max - min)/2)+min;
            System.out.println("Zgaduję " + guess);
            resp = scanner.nextLine();
            if (resp == "za dużo"){
                max = guess;
                loop++;
            }
            else if (resp == "za mało"){
                min = guess;
                loop++;
            }
            else {
                System.out.println("Błędne polecenie");
            }

        }


    }
}
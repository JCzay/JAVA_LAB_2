import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void metoda1(int[] x){
        int a = 40;
        for (int i = 0; i <= 19; i++){
            x[i] = a;
            a--;
        }
    }

    public static void metoda2(int[] x){
        for (int i = 0; i <= 19; i++) {
            System.out.println(x[i]);
        }
    }

    public static void metoda3(String[] x){
        System.out.println("\nPodpunkt B z zadania drugiego\nWpisz dowolne wyrazy:");
        Scanner scan = new Scanner(System.in);
        for ( int i = 0; i <= 5; i++){
            x[i] = scan.next();
        }
    }

    public static void metoda4(String[] x){
        for (int i = 5; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }

    public static void metoda5(String imie){
        System.out.println(imie);
    }

    public static void metoda5(String imie, String nazwisko){
        System.out.println(imie + " " + nazwisko);
    }

    public static void metoda5(String imie, String nazwisko, int wiek){
        System.out.println(imie + " " + nazwisko + " " + wiek + " lat");
    }

    public static int metoda6(int a, int b){
        return a + b;
    }

    public static int metoda6(int a, int b, int c){
        return a + b + c;
    }



    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int[] zadanie1a = new int[20];
        metoda1(zadanie1a);
        System.out.println("Podpunkt B z zadania pierwszego: ");
        metoda2(zadanie1a);


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] zadanie2a = new String[6];
        metoda3(zadanie2a);
        System.out.println("\nPodpunkt C z zadania drugiego: ");
        metoda4(zadanie2a);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        System.out.println("Podpunkt A z zadania trzeciego: ");
        metoda5("Julian");
        System.out.println("Podpunkt B z zadania trzeciego: ");
        metoda5("Julian", "Czaja");
        System.out.println("Podpunkt C z zadania trzeciego: ");
        metoda5("Julian", "Czaja", 23);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */


        int zadanie4a = metoda6(1, 2);
        int zadanie4b = metoda6(3, 4, 5);
        System.out.println("Podpunkt C z zadania czwartego: " + (metoda6(1, 2) + metoda6(3,4,5)));

    }


    }





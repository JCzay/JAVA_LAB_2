import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        // Ćwiczenie 1
        // Mój numer indeksu: 57652

        for(int k = 100; k > 0; k--) {
            if ( k % 2 == 0) {
                System.out.println(k);
            }

        }
        System.out.println("Wszystkie powyższe liczby są podzielne przez ostatni numer mojego indeksu");

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        // Ćwiczenie 2

        System.out.println("Podaj 5 wybranych przez Ciebie liczb: ");
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[5];

        for (int z = 0; z < 5; z++){
            tab[z] = scan.nextInt();
        }

        for (int liczba : tab){
            System.out.println(liczba + 11);
        }

        System.out.println("Wszystkie podane przez Ciebie liczby zostały zwiększone dokładnie o 11!");


    }
}

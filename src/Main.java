public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        // Ćwiczenie 1
        // Mój numer indeksu to: 57652

        int i = 1000;
        do {
            System.out.println(i);
            if (i % 52 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 52");
            }
        } while (--i > 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        // Ćwiczenie 2
        // a)

        int[] tab = new int[5];

        tab[0] = 1;
        tab[1] = 11;
        tab[2] = 111;
        tab[3] = 1111;
        tab[4] = 11111;

        int j = 0;
        while (j<5){
            System.out.println("Element tablicy int = " + tab[j]);
            j++;
        }

        // b)

        double[] tab1 = new double[5];

        tab1[0] = 99.99;
        tab1[1] = 88.88;
        tab1[2] = 77.77;
        tab1[3] = 66.66;
        tab1[4] = 55.55;

        int k = 0;
        while(k<5){
            System.out.println("Element tablicy double = " + tab1[k]);
            k++;
        }

        // c)

        String[] tab2 = new String[5];

        tab2[0] = "K";
        tab2[1] = "E";
        tab2[2] = "L";
        tab2[3] = "U";
        tab2[4] = "J";


        int z = 4;
        while(z>=0){
            System.out.println(tab2[z]);
            z--;
        }



    }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


}

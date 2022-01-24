public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        // Zadanie 1
        // a)
        // przedział liczb od 100 do 15

        System.out.println("\nPrzedział liczb od 100 do 15");

        for(int i = 100;i<=100;i--){
        System.out.println(i);
            if (i == 15) break;
        }

        // b)

        System.out.println("\nPrzedział liczb podzielnych przez 3 z przedziału od 0 do 1000");

        for(int i = 0; i<=1000; i++){
            if (i%3!=0) continue;
            System.out.println(i);
        }

        // c)

        System.out.println("\nPrzedział liczb od 0 do 440");

        for(int i = 0;i<=555;i++){
            System.out.println(i);
            if (i == 440) return;
        }









    }
}

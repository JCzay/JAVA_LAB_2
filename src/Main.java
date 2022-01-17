import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // Zadanie 1
    // Podpunkt B z zadania pierwszego

    public static void metoda1(ArrayList<String> x) {
        for (String y : x) {
            System.out.println(y);
        }
        System.out.println("Wielkość listy: " + x.size());
    }

    public static void main(String[] args) {

        // Podpunkt A z zadania pierwszego

        System.out.println("Podaj 5 wybranych przez Ciebie nazw zwierząt: ");
        ArrayList<String> zwierzeta = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            zwierzeta.add(scan.next());
        }

        System.out.println("Wyświetlenie nazw zwierząt wpisanych z klawiatury: ");
        metoda1(zwierzeta);

        // Podpunkt C z zadania pierwszego

        zwierzeta.remove(zwierzeta.size() - 1);
        zwierzeta.remove(zwierzeta.size() - 1);
        System.out.println("Wyświetlenie nazw zwierząt po usunięciu dwóch ostatnich wpisanych z klawiatury oraz dodanie trzech innych nazw: ");
        zwierzeta.add("Małpa");
        zwierzeta.add("Rekin");
        zwierzeta.add("Żyrafa");
        metoda1(zwierzeta);

        // Podupunkt D z zadania pierwszego

        System.out.println("Wyświetlenie odwrotne nazw zwierząt z podpunktu C przy pomocy metody z podpunktu B: ");
        Collections.sort(zwierzeta, Collections.reverseOrder());
        metoda1(zwierzeta);

        // Zadanie 2

        System.out.println("Podaj 10 losowych liczb: ");
        Set<Integer> liczby = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            liczby.add(scan.nextInt());
        }

        // Wyświetlenie przy pomocy foreach

        System.out.println(liczby);
        for (Integer a : liczby) {
            System.out.println(a);
        }


    }

}
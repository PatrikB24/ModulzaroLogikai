
package modulzaro0608logikai;


public class Modulzaro0608Logikai {

public static char[] palya; //pálya állapota
public static char[] jelek;
    public static void main(String[] args) {
 
        jatek();
    }

    private static void jatek() {
        kezdoAllapot(); // Kezdőállapot inicializálása
        kiirPalya(); // Kiírjuk a kezdőállapotot
        System.out.println("");
     //   while (!vege()) { // Amíg nincs vége a játéknak
           lepes(); // Lépés végrehajtása
            kiirPalya(); // Kiírjuk az új állapotot
    }

    private static void kezdoAllapot() {
    palya = new char[]{'X', 'X', 'X', ' ', 'O', 'O', 'O'};
}

    private static void kiirPalya() {
         for (int i = 0; i < palya.length; i++) {
        System.out.print(palya[i] + " ");
        if ((i + 1) % 3 == 0) { 
            System.out.print("");
        }
    }
    
}

    private static void lepes() {
 int uresIndex = -1; // Az üres hely indexe
        char jatekosJel; // A jelenlegi játékos jelének tárolására

        // Meghatározzuk az üres hely indexét
        for (int i = 0; i < palya.length; i++) {
            if (palya[i] == ' ') {
                uresIndex = i;
                break;
            }
        }

        // A játékos jelének kiválasztása
        if (palya[uresIndex - 1] == 'X') {
            jatekosJel = 'X';
        } else {
            jatekosJel = 'O';
        }

        // Lépés irányától függően megváltoztatjuk a pálya állapotát
        if (uresIndex - 1 >= 0) { // Balra lépés
            palya[uresIndex] = palya[uresIndex - 1];
            palya[uresIndex - 1] = ' ';
        } else if (uresIndex + 1 < palya.length) { // Jobbra lépés
            palya[uresIndex] = palya[uresIndex + 1];
            palya[uresIndex + 1] = ' ';
        }
    }
    }




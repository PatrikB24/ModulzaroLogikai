
package modulzaro0608logikai;


public class Modulzaro0608Logikai {

public static char[] palya; //pálya állapota
    
    public static void main(String[] args) {
 
        jatek();
    }

    private static void jatek() {
        kezdoAllapot(); // Kezdőállapot inicializálása
        kiirPalya(); // Kiírjuk a kezdőállapotot
   //     while (!vege()) { // Amíg nincs vége a játéknak
   //         lepes(); // Lépés végrehajtása
   //         kiirPalya(); // Kiírjuk az új állapotot
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
}



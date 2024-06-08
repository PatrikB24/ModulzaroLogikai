
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
        while (!vege()) { // Amíg nincs vége a játéknak
           lepes(); // Lépés végrehajtása
            kiirPalya(); // Kiírjuk az új állapotot
            System.out.println("");
    }
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
        for (int i = 0; i < palya.length - 1; i++) {
            if (palya[i] == 'X' && palya[i + 1] == ' ') {
                palya[i] = ' ';
                palya[i + 1] = 'X';
                return;
            } else if (palya[i] == ' ' && palya[i + 1] == 'O') {
                palya[i] = 'O';
                palya[i + 1] = ' ';
                return;
            }
        }
    }

    private static boolean vege() {
        char[] vegsoAllapot = {'O', 'O', 'O', ' ', 'X', 'X', 'X'};
        for (int i = 0; i < palya.length; i++) {
            if (palya[i] != vegsoAllapot[i]) {
                return false;
            }
        }
        return true;
    }



}
    
   
    
    
    
    
    




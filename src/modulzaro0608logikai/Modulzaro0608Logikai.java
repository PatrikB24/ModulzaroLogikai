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
            //if(vege()){
            // break;}
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

        boolean xLepett = false;
        boolean oLepett = false;

        for (int i = 0; i < palya.length - 1; i++) {
            if (palya[i] == 'X' && palya[i + 1] == ' ' && palya[i + 2] == 'O') {
                palya[i] = ' ';
                palya[i + 1] = 'X';
                xLepett = true;
                break;
            }
            else {
            break;}
        }

        for (int i = palya.length - 1; i > 1; i--) {
            if (palya[i] == 'O' && palya[i - 1] == ' ' && palya[i - 2] == 'X') {
                palya[i] = ' ';
                palya[i - 1] = 'O';
                oLepett = true;
                break;
            }
        }

        if (xLepett) {
            for (int i = 0; i < palya.length - 1; i++) {
                if (palya[i] == 'X' && palya[i + 1] == 'O' && palya[i + 2] == ' ') {
                    palya[i] = ' ';
                    palya[i + 2] = 'X';
                    break;
                }
            }
        }

        if (oLepett) {
            for (int i = palya.length - 1; i > 0; i--) {
                if (palya[i] == 'O' && palya[i - 1] == 'X' && palya[i - 2] == ' ') {
                    palya[i] = ' ';
                    palya[i - 2] = 'O';
                    break;
                }
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

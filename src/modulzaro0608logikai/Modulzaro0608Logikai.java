package modulzaro0608logikai;

public class Modulzaro0608Logikai {

    public static char[] palya; //pálya állapota
    public static char[] jelek;
/*MODULZÁRÓ LOGIKAI FELADAT: BEK PATRIK*/
    public static void main(String[] args) {
        
        megoldasKiirva();
        jatek();
    }

    private static void jatek() {
        System.out.println("A feladatleírás alapján a kód: ");
        kezdoAllapot(); // Kezdőállapot inicializálása
        kiirPalya(); // Kiírjuk a kezdőállapotot
        System.out.println("");
        while (!vege()) { // Amíg nincs vége a játéknak
            lepes(); // Lépés végrehajtása
            kiirPalya(); // Kiírjuk az új állapotot
            System.out.println("");
            if (vege()) {
                break;
            }
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
            if (palya[i] == 'X' && palya[i + 1] == ' ' && palya[i + 2] == 'O' && i >= 0 && palya[i - 1] != 'O') {
                palya[i] = ' ';
                palya[i + 1] = 'X';
                return;
            } else if (palya[i] == ' ' && palya[i + 1] == 'O') {
                palya[i] = 'O';
                palya[i + 1] = ' ';
                return;
            } else if (palya[i] == 'X' && palya[i + 1] == 'O' && i < palya.length - 2 && palya[i + 2] == ' ') {
                palya[i] = ' ';
                palya[i + 2] = 'X';
                return;
            } else if (i >= 2 && palya[i] == 'O' && palya[i - 1] == 'X' && palya[i - 2] == ' ') {
                palya[i] = ' ';
                palya[i - 2] = 'O';
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

    private static void megoldasKiirva() {
        System.out.println("A feladatleírás alapján a következő megoldást kellene kiírnia a konzolnak: ");
        System.out.println("XXX_OOO");
        System.out.println("XX_XOOO");
        System.out.println("XXOX_OO");
        System.out.println("XXOXO_O");
        System.out.println("XXO_OXO");
        System.out.println("X_OXOXO <-- itt akadtam el a kódban, az index out of bounds miatt, nem tudtam más feltételt adni, mert ha kivettem a -1 != O feltételt, akkor borult az elötte lévő sorrend");
        System.out.println("_XOXOXO");
        System.out.println("OX_XOXO");
        System.out.println("OXOX_XO");
        System.out.println("OXOXOX_");
        System.out.println("OXOXO_X");
        System.out.println("OXO_OXX");
        System.out.println("O_OXOXX");
        System.out.println("OO_XOXX");
        System.out.println("OOOX_XX");
        System.out.println("OOO_XXX");
    }

}

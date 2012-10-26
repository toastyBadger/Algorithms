
import sorting.QuickSort;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MrKnyaz
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[] A = {1, 2, 7, 6, 2, 9, 10, 2, 11};
        QuickSort.sort(A);
        for (int ii = 0; ii < A.length; ii++) {
            System.out.print(A[ii] + " ");
        }
        System.out.println();
*/
        String[] s = {"NNNNN","NNNNN","NNNNN","NNNNN","NNNNN"};
        IncubatorEasy.maxMagicalGirls(s);
    }
}

class IncubatorEasy {

    static int[] isMagical;
    static int[] isProtected;
    static int max = 0;
    static String[] loveGlobal;
    static int girlsNum;

    private static void makeMagical(int girl) {
        for (int i = 0; i < girlsNum; i++) {
            if (loveGlobal[girl].charAt(i) == 'Y') {
                isProtected[i] = 1;
                makeMagical(i);
            }
        }
    }

    private static void selectGirls(int[] excludedGirls) {
        for (int i = 0; i < girlsNum; i++) {
            if (excludedGirls[i] != 1) {
                excludedGirls[i] = 1;
                isMagical[i] = 1;
                makeMagical(i);
                selectGirls(excludedGirls);
                countMax();
                isMagical[i] = 0;
                excludedGirls[i] = 0;
            }
        }
    }

    private static void countMax() {
        int counter = 0;
        for (int i = 0; i < girlsNum; i++) {
            if (isMagical[i] == 1 && isProtected[i] == 0) {
                counter++;
            }
        }
        if (counter > max) {
            max = counter;
        }
    }

    public static int maxMagicalGirls(String[] love) {
        girlsNum = love.length;
        loveGlobal = love;
        int[] excludedGirls = new int[girlsNum];
        for (int i = 0; i < girlsNum; i++) {
            isMagical = new int[girlsNum];
            isProtected = new int[girlsNum];
            excludedGirls[i] = 1;
            isMagical[i] = 1;
            selectGirls(excludedGirls);
            countMax();
            isMagical[i] = 0;
            excludedGirls[i] = 0;
        }
        return max;
    }
}
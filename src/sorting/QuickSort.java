/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author MrKnyaz
 */
public class QuickSort {

    private static void quickSort(int[] A, int low, int high) {
        for (int ii=0;ii<A.length;ii++)
            System.out.print(A[ii]+" ");
        System.out.println();
        int i = low;
        int j = high;
        int x = A[(low + high) / 2];
        do {
            while (A[i] < x) {
                ++i;
            }
            while (A[j] > x) {
                --j;
            }
            if (i <= j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (low < j) {
            quickSort(A, low, j);
        }
        if (i < high) {
            quickSort(A, i, high);
        }
    }

    public static void sort(int[] A) {
        quickSort(A, 0, A.length-1) ;
    }
}

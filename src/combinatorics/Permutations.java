/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package combinatorics;

/**
 *
 * @author Knyazev Alexander <aknyazev@kkb.kz>
 */
public class Permutations {
    
    int[] arr;
    int counter;
    
    public Permutations(int[] arr) {
        this.arr = arr;
        permutate(arr.length);
        System.out.println(counter);
    }
    
    private void permutate(int n) {
        for (int i = arr.length - n; i < arr.length; i++) {
            exch(arr.length-n, i);
            permutate(n-1);
            exch(arr.length-n, i);
        }
        if (n==0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            counter++;
            System.out.println();
        }
    }
    
    private void exch(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

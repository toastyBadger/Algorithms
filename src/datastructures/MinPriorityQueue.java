/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Knyazev Alexander <aknyazev@kkb.kz>
 */
public class MinPriorityQueue<T extends Comparable> {

    private T[] pq;
    private int N = -1;

    public MinPriorityQueue(int size) {
        pq = (T[]) new Comparable[size];
    }

    private void sink(int i) {
        while (2 * i + 1 <= N) {
            int index = 2 * i + 1;
            if (index + 1 <= N && pq[index].compareTo(pq[index + 1]) > 0) {
                index = index + 1;
            }
            if (pq[i].compareTo(pq[index]) > 0) {
                T temp = pq[index];
                pq[index] = pq[i];
                pq[i] = temp;
                i = index;
            } else {
                break;
            }
        }
    }

    private void swim(int i) {
        while (i > 0) {
            int index = (i - 1) / 2;
            if (pq[i].compareTo(pq[index]) < 0) {
                T temp = pq[index];
                pq[index] = pq[i];
                pq[i] = temp;
                i = index;
            } else {
                break;
            }
        }
    }

    public void add(T item) {
        N++;
        pq[N] = item;
        swim(N);
    }

    public void add(T[] array) {
        pq = array;
        N = array.length - 1;
        for (int i = N; i >= 0; i--) {
            sink(i);
        }
    }

    public T popMin() {
        T result = pq[0];
        if (N >= 0) {
            pq[0] = pq[N--];
            pq[N + 1] = null;
            sink(0);
        }
        return result;
    }

    public void write() {
        for (int i = 0; i <= N; i++) {
            System.out.print(pq[i] + " ");
        }
        System.out.println();
    }
}

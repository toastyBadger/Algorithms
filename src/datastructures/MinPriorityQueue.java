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

    private List<T> pq;

    public MinPriorityQueue(int size) {
        pq = new ArrayList(size);
    }
    
    private void sink(int i) {
        
    }
}

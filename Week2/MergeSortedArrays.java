package Week2;

import java.util.Collections;
import java.util.LinkedList;

/**
 * You are given an array of k linked list, 
 * each linked list is sorted in ascending order.
 * Merge all the linked list into one sorted linked list and return it.
 * 
 * Example 1:
 * Input: lists[[1,4,5],[1,3,4][2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 */

public class MergeSortedArrays {

    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<>();
        listA.add(1);
        listA.add(4);
        listA.add(5);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(1);
        listB.add(3);
        listB.add(4);

        LinkedList<Integer> listC = new LinkedList<>();
        listC.add(2);
        listC.add(6);

        LinkedList<LinkedList<Integer>> k = new LinkedList<>();
        k.add(listA);
        k.add(listB);
        k.add(listC);

        System.out.println(mergedSortedArrays(k));
    }

    public static LinkedList<Integer> mergedSortedArrays(LinkedList<LinkedList<Integer>> lists) {
        LinkedList<Integer> mergedList = new LinkedList<>();
    
        for(LinkedList<Integer> list : lists) {
            for(Integer num : list) {
                mergedList.add(num);
            }
        }
    
        Collections.sort(mergedList);
    
        return mergedList;
    }
    
}

package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/**
 * Write a program that accepts sets of three numbers, and 
 * prints the second-maximum number amount the three.
 * 
 * Input:
 *  - First line contains the number of triples, N.
 *  - The next N lines which follow each have three space separated integers.
 * 
 * Output:
 * For each of the N triples, output one new line which contains 
 * the second-maximum integer among the three.
 */
public class SecondMaxOfThreeNumbers {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(15);
        set2.add(5);

        Set<Integer> set3 = new HashSet<>();
        set3.add(100);
        set3.add(999);
        set3.add(500);

        System.out.println(secondMaxOfThreeNumbers(set1));
        System.out.println(secondMaxOfThreeNumbers(set2));
        System.out.println(secondMaxOfThreeNumbers(set3));
    }

    public static int secondMaxOfThreeNumbers(Set<Integer> n) {
        int secondMax = 0;
        List<Integer> ls = new ArrayList<>(n);
        Collections.sort(ls);

        secondMax = ls.get(1);

        return secondMax;
    }
}

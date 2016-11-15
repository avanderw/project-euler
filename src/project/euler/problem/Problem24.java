package project.euler.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
 *
 * 012 021 102 120 201 210
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 *
 * @author cp318674
 */
public class Problem24 extends AProblem {

    @Override
    public String answer() {
        List<String> numbers = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7","8","9");
        List<String> permutations = permutate(numbers, numbers.size());
        Collections.sort(permutations);
        System.out.println(permutations.get(999_999));
        System.out.println(permutations.size() +" "+ numbers.size());
        return "0";
    }
    
    // Heap's algorithm
    public List<String> permutate(List<String> numbers, Integer length) {
        List<String> permutations = new ArrayList<>();
        if (length == 1) {
            return Arrays.asList(numbers.toString());
        }
        else {
            String tmp;
            for (int i = 0; i < length -1; i++) {
                permutations.addAll(permutate(numbers, length-1));
                if (length % 2 == 0) {
                    tmp = numbers.get(i);
                    numbers.set(i, numbers.get(length-1));
                    numbers.set(length-1, tmp);
                } else {
                    tmp = numbers.get(0);
                    numbers.set(0, numbers.get(length-1));
                    numbers.set(length-1, tmp);
                }
            }
            permutations.addAll(permutate(numbers, length-1));
        }
        
        return permutations;
    }

}

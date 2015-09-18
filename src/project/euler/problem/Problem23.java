package project.euler.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import project.euler.Utilities;

/**
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means
 * that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all
 * integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number
 * that cannot be expressed as the sum of two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 *
 * @author cp318674
 */
public class Problem23 extends AProblem {

    @Override
    public String answer() {
        List<Long> abundantNumbers = new ArrayList<>();
        
        for (Long i = 1L; i < 28123; i++) {
            if (Utilities.sumProperDividors(i) > i) {
                abundantNumbers.add(i);
            }
        }

        //System.out.println(abundantNumbers);
        
        Set<Long> sumAbundantNumbers = new HashSet<>();
        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int j = i; j < abundantNumbers.size(); j++) {
                sumAbundantNumbers.add(abundantNumbers.get(i) + abundantNumbers.get(j));
            }
        }
        
        //System.out.println(sumAbundantNumbers);

        Long sum = 0L;
        for (Long i = 1L; i < 28123; i += 1) {
            if (!sumAbundantNumbers.contains(i)) {
                sum += i;
            }
        }
        
        return sum+"";
    }

}

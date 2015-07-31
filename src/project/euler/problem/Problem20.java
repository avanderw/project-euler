package project.euler.problem;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 *
 * @author cp318674
 */
public class Problem20 extends AProblem {

    @Override
    public String answer() {
        BigInteger number = new BigInteger("99");
        BigInteger factorial = new BigInteger("100");

        while (number.intValue() > 0) {
            factorial = factorial.multiply(number);
            number = number.subtract(BigInteger.ONE);
        }

        Long sum = 0L;
        String digits = factorial.toString();
        for (int i = 0; i < digits.length(); i++) {
            sum += new Integer("" + digits.charAt(i));
        }

        return "" + sum;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author cp318674
 */
public class Utilities {
    
    public static Long countDivisors(Long number) {
        Long divisors = 0L;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                divisors += 2;
            }
        }
        return divisors;
    }
    
    public static Long sumProperDividors(Long number) {
        Integer divisor = 1;
        Integer halfNumber = (int) Math.ceil(number / 2);
        Long sum = 0L;

        while (divisor <= halfNumber) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }

        return sum;
    }
}

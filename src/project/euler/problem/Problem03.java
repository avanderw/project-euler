/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

import java.util.List;
import project.euler.PrimeNumberUtil;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. <br/>
 * What is the largest prime factor of the number 600851475143?
 *
 * @author cp318674
 */
public class Problem03 extends AProblem {

    @Override
    public String answer() {
        Long number = 600851475143L;
        Integer maxPrime = 0;
        List<Integer> primes = PrimeNumberUtil.allPrimesUnder(10000);
        while (number != 1) {
            for (Integer prime : primes) {
                if (number % prime == 0) {
                    number /= prime;
                    maxPrime = Math.max(prime, maxPrime);
                    break;
                }
            }
        }

        return "" + maxPrime;
    }
}

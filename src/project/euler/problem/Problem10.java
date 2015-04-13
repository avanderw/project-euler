/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

import java.util.ArrayList;
import java.util.List;
import project.euler.PrimeNumberUtil;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * @author cp318674
 */
public class Problem10 extends AProblem {

    @Override
    public String answer() {
        List<Integer> allPrimes = PrimeNumberUtil.allPrimesUnder(2_000_000);
        Long sum = 0L;
        for (Integer prime : allPrimes) {
            sum += prime;
        }       
        
        return String.valueOf(sum);
    }
}

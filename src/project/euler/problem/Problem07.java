/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

import project.euler.PrimeNumberUtil;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. What is the 10 001st prime number?
 *
 * @author cp318674
 */
public class Problem07 extends AProblem {

    @Override
    public String answer() {

        return "" + PrimeNumberUtil.primeNumber(10_001);
    }
}

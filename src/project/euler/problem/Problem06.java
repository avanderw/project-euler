/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is the smallest positive number that is evenly divisible by all of the numbers from 1
 * to 20?
 *
 * @author cp318674
 */
public class Problem06 extends AProblem {

    @Override
    public String answer() {
        long sumSquares = 0;
        long squareSum = 0;
        for (int i = 1; i < 101; i++) {
            sumSquares += (i * i);
            squareSum += i;
        }
        squareSum *= squareSum;
        return "" + (squareSum - sumSquares);
    }
}

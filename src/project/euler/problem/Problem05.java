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
public class Problem05 extends AProblem {

    @Override
    public String answer() {
        Long currentNumber = 0L;
        Boolean notDivisible = true;
        while (notDivisible) {
            currentNumber += 20L;
            notDivisible = !(
                    currentNumber % 11 == 0 &&  
                    currentNumber % 13 == 0 && 
                    currentNumber % 14 == 0 && 
                    currentNumber % 16 == 0 && 
                    currentNumber % 17 == 0 && 
                    currentNumber % 18 == 0 && 
                    currentNumber % 19 == 0 && 
                    currentNumber % 20 == 0);
        }
        return "" + currentNumber;
    }
}

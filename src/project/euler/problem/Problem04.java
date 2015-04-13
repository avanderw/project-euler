/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.<br/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author cp318674
 */
public class Problem04 extends AProblem {

    @Override
    public String answer() {
        Integer maxPalindrome = 0;

        for (Integer i = 999; i > 900; i--) {
            for (Integer j = 999; j > 900; j--) {
                if (isPalindrome(i * j)) {
                    maxPalindrome = Math.max(i * j, maxPalindrome);
                }
            }
        }

        return "" + maxPalindrome;
    }

    private Boolean isPalindrome(Integer number) {
        return number.toString().equals(new StringBuilder("" + number).reverse().toString());
    }

}

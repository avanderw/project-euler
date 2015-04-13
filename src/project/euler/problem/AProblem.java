/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

/**
 *
 * @author cp318674
 */
public abstract class AProblem implements IProblem {
    
    @Override
    public String toString() {
        Long start = System.currentTimeMillis();
        String result = answer();
        return this.getClass().getSimpleName() + ": " + result + " [" + (System.currentTimeMillis()- start) + " ms]";
    }
    
}

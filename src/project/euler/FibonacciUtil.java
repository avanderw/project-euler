package project.euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FibonacciUtil {
    public static List<Integer> generateFibonacciRangeUnderFixed(Integer upperLimit) {
        List<Integer> range = new ArrayList();
        Integer firstNumber = 1;
        Integer secondNumber = 2;
        Integer swapNumber;
        
        range.add(firstNumber);
        while (secondNumber < upperLimit) {
            range.add(secondNumber);
            
            swapNumber = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = swapNumber;
        }
        
        return range;
    }
    
    public static List<Integer> generateFibonacciRangeUnder(Integer upperLimit) {
        List<Integer> range = new ArrayList();
        Integer firstNumber = 1;
        Integer secondNumber = 2;
        
        range.add(firstNumber);
        while (secondNumber < upperLimit) {
            range.add(secondNumber);
            
            firstNumber = secondNumber;
            secondNumber = firstNumber + secondNumber;
        }
        return range;
    }
    
    public static void main(String[] args) {
        List<Integer> range = generateFibonacciRangeUnder(1_000_000);
        System.out.println(range.size() == 29);
        System.out.println(range.get(range.size()-1) == 832040);
        System.out.println(range);
    }
}

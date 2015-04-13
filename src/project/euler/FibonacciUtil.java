package project.euler;

import java.util.ArrayList;
import java.util.List;

public class FibonacciUtil {
    public static List<Integer> generateFibonacciRangeUnder(Integer upperLimit) {
        List<Integer> range = new ArrayList();
        Integer firstNumber = 1;
        Integer secondNumber = 2;
        Integer tmpHolder;
        
        range.add(firstNumber);
        while (secondNumber < upperLimit) {
            range.add(secondNumber);
            
            tmpHolder = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = tmpHolder;
        }
        return range;
    }
}

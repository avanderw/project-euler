package project.euler.problem;

/**
 * 
 * @author cp318674
 */
public class Problem14 extends AProblem {

    @Override
    public String answer() {
        
        Integer longestChain = 0;
        Integer longestStartNum = 0;
        
        for (int i = 1_000_000; i > 800_000; i--) {
            Integer length = collatzLength(i);
            if (length > longestChain) {
                longestStartNum = i;
                longestChain = length;
            }
        }
        return "" + longestStartNum;
    }
        
        public Integer collatzLength(Integer startNum) {
        Long runningNum = new Long(startNum);
        Integer count = 1;
        
        while (runningNum > 1) {
            if (runningNum % 2 == 0) {
                runningNum = evenFunction(runningNum);
            } else {
                runningNum = oddFunction(runningNum);
            }
            count++;
        }
        
        return count;
    }
    
    private Long evenFunction(Long n) {
        return n / 2;
    }
    
    private Long oddFunction(Long n) {
        return 3 * n + 1;
    }
}

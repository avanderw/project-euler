package project.euler.problem;

import java.math.BigInteger;

/**
 *
 * @author cp318674
 */
public class Problem16 extends AProblem {

    @Override
    public String answer() {
        BigInteger power = new BigInteger("2");
        power = power.pow(1_000);
        
        Integer sum = 0;
        String value = power.toString();
        for (int i = 0; i < value.length();i++) {
            sum += Integer.parseInt(""+value.charAt(i));
        }

        return ""+sum;
    }
}

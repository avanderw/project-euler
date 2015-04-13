package project.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cp318674
 */
public class PrimeNumberUtil {

    public static List<Integer> allPrimesUnder(Integer number) {
        List<Integer> allNumbers = new ArrayList<>(number);
        for (Integer i = 0; i < number; i++) {
            allNumbers.add(i < 2 ? null : i);
        }

        Long sqRoot = (long)Math.floor(Math.sqrt(number));
        for (Integer i = 2; i < sqRoot; i++) {
            if (allNumbers.get(i) != null) {
                for (Integer j = i * i; j < number; j += i) {
                    allNumbers.set(j, null);
                }
            }
        }

        allNumbers.removeAll(Collections.singleton(null));
        return allNumbers;
    }

    public static Integer primeNumber(int idx) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);

        Integer number = 3;

        while (idx > primes.size() && idx != primes.size()) {
            Integer test = number + 2;
            Integer halfTest = (int) Math.floor(test * .5);
            Boolean isPrime = true;
            for (Integer foundPrime : primes) {
                if (foundPrime > halfTest) {
                    break;
                }
                if (test % foundPrime == 0) {
                    isPrime = false;
                    break;
                }
            }

            number = test;
            if (isPrime) {
                primes.add(number);
            }
        }

        return number;
    }
}

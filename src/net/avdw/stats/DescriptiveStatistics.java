package net.avdw.stats;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author cp318674
 */
public class DescriptiveStatistics {

    public static Double calcMean(List<Double> sample) {
        Double sum = 0.0;
        for (Double a : sample) {
            sum += a;
        }

        return sum / sample.size();
    }

    public static Double calcVariance(List<Double> sample) {
        Double mean = calcMean(sample);
        Double temp = 0.0;
        for (Double a : sample) {
            temp += (mean - a) * (mean - a);
        }
        
        return temp / sample.size();
    }
    
    public static Double calcStdDev(List<Double> sample) {
        return Math.sqrt(calcVariance(sample));
    }

    public static Double calcMedian(List<Double> sample) {
        Collections.sort(sample);
        if (sample.size() % 2 == 0) {
            return (sample.get(sample.size() / 2 - 1) + sample.get(sample.size() / 2)) / 2;
        } else {
            return sample.get(sample.size() / 2);
        }
    }
}

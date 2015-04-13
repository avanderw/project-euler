/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * A Pythagorean triplet is a set of three natural numbers, a &lt; b &lt; c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * @author cp318674
 */
public class Problem09 extends AProblem {

    @Override
    public String answer() {
        String value = "";

        List<Triple> triplets = pythagoreanTriplets(500);
        for (Triple triplet : triplets) {
            if (triplet.sum() == 1000) {
                value = triplet.product() + "";
            }
        }

        return value;
    }

    private List<Triple> pythagoreanTriplets(int limit) {
        List<Triple> result = new ArrayList<>(limit);
        for (int x = 1; x < limit; ++x) {
            int xx = x * x;
            int y = x + 1;
            int z = y + 1;
            while (z <= limit) {
                int zz = xx + y * y;
                while (z * z < zz) {
                    ++z;
                }
                if (z * z == zz && z <= limit) {
                    result.add(new Triple(x, y, z));
                }
                ++y;
            }
        }
        return result;
    }

    class Triple {

        public int x, y, z;

        public Triple(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int sum() {
            return x + y + z;
        }

        public int product() {
            return x * y * z;
        }

        @Override
        public String toString() {
            return String.format("{%d, %d, %d}", x, y, z);
        }
    }
}

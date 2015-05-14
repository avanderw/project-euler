package project.euler.problem;

/**
 *
 * @author cp318674
 */
public class Problem15 extends AProblem {

    @Override
    public String answer() {
        int size = 20;
        long[][] matrix = new long[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                long above = row - 1 >= 0 ? matrix[row - 1][col] : 1;
                long left = col - 1 >= 0 ? matrix[row][col - 1] : 1;
                matrix[row][col] = above + left;
            }
        }

        return ""+matrix[size-1][size-1];
    }
}

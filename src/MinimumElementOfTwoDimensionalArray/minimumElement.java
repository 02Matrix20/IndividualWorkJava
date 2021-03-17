package MinimumElementOfTwoDimensionalArray;

public class minimumElement {
    public static void main(String[] args) {

        int[][] matrix = {{2, 1, 8, 45}, {3, 9, 4, 43}};

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }

            }
            System.out.println("Min = " + min);


        }

    }
}

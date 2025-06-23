public class Module5ArrayTest {

    public static void main(String[] args) {
        double[][] doubleArray = {
            {3.5, 2.4, 7.8},
            {4.1, 9.9, 1.2},
            {6.7, 3.3, 5.5}
        };

        int[][] intArray = {
            {3, 5, 1},
            {4, 8, 6},
            {2, 7, 9}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest in double[][] at: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest in double[][] at: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
        System.out.println("Largest in int[][] at: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest in int[][] at: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
    }

    public static int[] locateLargest(double[][] arrayParam) {
        int[] position = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] position = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] position = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] position = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }
}

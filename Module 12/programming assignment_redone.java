//Colby King Module 3 assignment June 8, Redo 7/28

public class PyramidPattern {
    public static void main(String[] args) {
        printPyramid();
    }
    
    public static void printPyramid() {
        int rows = 7; // Number of rows in the pyramid
        
        for (int i = 0; i < rows; i++) {
            // Calculate spaces for centering the pyramid
            for (int k = 0; k < (rows - i - 1) * 2; k++) {
                System.out.print(" ");
            }
            
            // Print ascending powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            
            // Print descending powers of 2 (excluding the peak)
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int)Math.pow(2, j) + " ");
            }
            
            // Add spacing to push @ to the right
            for (int k = 0; k < (rows - i - 1) * 4; k++) {
                System.out.print(" ");
            }
            
            // Print @ at the right end
            System.out.println("@");
        }
    }
}
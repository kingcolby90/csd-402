public class Main {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
            System.out.print("   ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
            System.out.print(num + " ");
                num *= 2;
            }

            num /= 2;
            for (int j = i - 1; j >= 0; j--) {
                num /= 2;
                System.out.print(num + " ");
            }
            
            System.out.println(" @");
        }
    }
}
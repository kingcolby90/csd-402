public class Ckingmodule4 {
    
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int)(sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void printArray(String label, short[] array) {
        System.out.print(label + ": ");
        for (short value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String label, int[] array) {
        System.out.print(label + ": ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String label, long[] array) {
        System.out.print(label + ": ");
        for (long value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String label, double[] array) {
        System.out.print(label + ": ");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        short[] shortArray = {3, 5, 7};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        printArray("Short Array", shortArray);
        System.out.println("Average (short): " + average(shortArray));
        System.out.println();

        printArray("Int Array", intArray);
        System.out.println("Average (int): " + average(intArray));
        System.out.println();

        printArray("Long Array", longArray);
        System.out.println("Average (long): " + average(longArray));
        System.out.println();

        printArray("Double Array", doubleArray);
        System.out.println("Average (double): " + average(doubleArray));
        System.out.println();
    }
}


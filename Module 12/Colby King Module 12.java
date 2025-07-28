//Colby King Module 12 assignment 7/27/2025
public class AutoServiceCalculator {

    // Standard service charge
    public static double yearlyService() {
        return 100.0;
    }

    // Standard service charge and oil change
    public static double yearlyService(double oilChangeFee) {
        return 100.0 + oilChangeFee;
    }

    // Standard service charge and oil change and tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return 100.0 + oilChangeFee + tireRotationFee;
    }

    // Standard service charge and oil change and tire rotation and coupon deduction
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        return (100.0 + oilChangeFee + tireRotationFee) - couponAmount;
    }

    public static void main(String[] args) {
        // Testing yearlyService() with no parameters
        System.out.println("Test 1: " + yearlyService());
        System.out.println("Test 2: " + yearlyService());

        // Testing yearlyService() with oil change fee
        System.out.println("Test 3: " + yearlyService(35.0));
        System.out.println("Test 4: " + yearlyService(40.0));

        // Testing yearlyService() with oil change and tire rotation
        System.out.println("Test 5: " + yearlyService(35.0, 20.0));
        System.out.println("Test 6: " + yearlyService(40.0, 25.0));

        // Testing yearlyService() with all fees and coupon
        System.out.println("Test 7: " + yearlyService(35.0, 20.0, 15.0));
        System.out.println("Test 8: " + yearlyService(40.0, 25.0, 20.0));
    }
}


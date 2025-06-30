import java.util.ArrayList;

public class Ckingmodule7 {

    public static class Ckingmodule6fan {
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Ckingmodule6fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6.0;
            this.color = "white";
        }

        public Ckingmodule6fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return this.speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return this.on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }


    public static void displayFan(Ckingmodule6fan fan) {
        System.out.println("Fan Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("-------------------------");
    }


    public static void displayFans(ArrayList<Ckingmodule6fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<Ckingmodule6fan> fanList = new ArrayList<>();


        fanList.add(new Ckingmodule6fan()); // Default
        fanList.add(new Ckingmodule6fan(Ckingmodule6fan.FAST, true, 10.5, "blue"));
        fanList.add(new Ckingmodule6fan(Ckingmodule6fan.SLOW, true, 7.0, "red"));
        fanList.add(new Ckingmodule6fan(Ckingmodule6fan.MEDIUM, false, 8.2, "gray"));


        displayFans(fanList);
    }
}

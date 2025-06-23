public class ckingmodule6 {
    public class Ckingmodule6fan {

        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;
    
        private int speed;
        private boolean on;
        private double radius;
        private String color;
    
        public Ckingmodule6fan(){
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6.0;
            this.color = "white";
        }
    
        public Ckingmodule6fan(int speed, boolean on, double radius, String color){
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
    
        public int getSpeed() {
            return speed;
        }
    
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    
        public boolean isOn() {
            return on;
        }
    
        public void setOn(boolean on) {
            this.on = on;
        }
    
        public double getRadius() {
            return radius;
        }
    
        public void setRadius(double radius) {
            this.radius = radius;
        }
    
        public String getColor() {
            return color;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public String toString() {
            if (on) {
                return "Fan is ON | Speed: " + speed + " | Color: " + color + " | Radius: " + radius;
            } else {
                return "Fan is OFF | Color: " + color + " | Radius: " + radius;
            }
        }
    
        }
        public static void main(String[] args) {
            Ckingmodule6fan defaultFan = new ckingmodule6().new Ckingmodule6fan();
            Ckingmodule6fan customFan = new ckingmodule6().new Ckingmodule6fan(Ckingmodule6fan.FAST, true, 10.5, "blue");
    
            System.out.println("Default Fan: " + defaultFan);
            System.out.println("Custom Fan: " + customFan);
    
            defaultFan.setOn(true);
            defaultFan.setSpeed(Ckingmodule6fan.MEDIUM);
            defaultFan.setColor("green");
    
            System.out.println("Updated Default Fan: " + defaultFan);
        }
    }

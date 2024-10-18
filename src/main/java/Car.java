public class Car {
    private int speed = 0;
    private String model = "";
    Car (int speed, String model) {
        this.speed = speed;
        this.model = model;
    }
    public int getSpeed() {
        return this.speed;
    }

    public String getModel() {
        return this.model;
    }
}

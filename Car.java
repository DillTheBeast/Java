public class Car {
    private String color;
    private int size;
    private int wheels;

    public Car(String color, int size, int wheels) {
        this.color = color;
        this.wheels = wheels;
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    } 
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String toString() {
        return "Color: " + this.color + ", Size: " + this.size + ", Wheels: " + this.wheels;
    }
}

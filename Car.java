public class Car {
    //Defining the variables going to be used
    private String color;
    private int size;
    private int wheels;

    public Car(String color, int size, int wheels) {
        //Turning the variables into an object
        this.color = color;
        this.wheels = wheels;
        this.size = size;
    }
    //Method takes the variable and gets what is put in for the variable
    public String getColor() {
        return color;
    }
    //Method sets the object to the variable
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
    //Method converts all of the variables into a String to be printed
    public String toString() {
        return "Color: " + this.color + ", Size: " + this.size + ", Wheels: " + this.wheels;
    }
}

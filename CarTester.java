import java.sql.SQLIntegrityConstraintViolationException;

public class CarTester {
    public static void main(String[] args) {
        //Defining the variables for each car
        Car myCar = new Car("Blue", 5, 4);
        Car yourCar = new Car("Red", 7, 6);
        Car hisCar = new Car("Black", 3, 4);
        Car herCar = new Car("White", 10, 8);
        //Printing the car using the method made to turn the variables into a string
        System.out.println(myCar.toString());
        System.out.println(yourCar.toString());
        System.out.println(hisCar.toString());
        System.out.println(herCar.toString());
        System.out.println(myCar.getColor());
    }
}

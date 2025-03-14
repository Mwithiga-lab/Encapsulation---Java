/*
Author:Kevin Mwithiga
Reg No:CT101/G/19870/23
Encapsulation
*/
class Car {
    // Private variables
    private String licensePlate;
    private boolean isRented;

    // Constructor to set the license plate when a car is created
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false;
    }

    // Public method to rent the car
    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with license plate " + licensePlate + " has been rented.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already rented.");
        }
    }

    // Public method to return the car
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with license plate " + licensePlate + " has been returned.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already available.");
        }
    }

    // Getter method to check if the car is rented
    public boolean isCarRented() {
        return isRented;
    }

    // Getter method to retrieve the license plate
    public String getLicensePlate() {
        return licensePlate;
    }
}


public class MainCar {
    public static void main(String[] args) {
        // Create a car object with a license plate
        Car car1 = new Car("KDK 238H");

        // Try to rent the car
        car1.rentCar();
        System.out.println("Is car rented? " + car1.isCarRented());

        // Try to rent the car again (should fail)
        car1.rentCar();

        // Return the car
        car1.returnCar();
        System.out.println("Is car rented? " + car1.isCarRented());

        // Try to return the car again (should fail)
        car1.returnCar();
    }
}

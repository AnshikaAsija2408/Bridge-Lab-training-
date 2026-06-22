abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // setters
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract void CalculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("VehicleId: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

interface IGPS {
    public void getCurrentLocation();

    public void updateLocation();
}

class Car extends Vehicle implements IGPS {
    @Override
    public void CalculateFare(double distance) {
        double fare = distance * getRatePerKm();
        System.out.println(fare);
    }

    public void getCurrentLocation() {
        System.out.println("Current location of the car is: ");
    }

    public void updateLocation() {
        System.out.println("Location of the car is updated");
    }
}

class Bike extends Vehicle implements IGPS {
    @Override
    public void CalculateFare(double distance) {
        double fare = distance * getRatePerKm();
        System.out.println(fare);
    }

    public void getCurrentLocation() {
        System.out.println("Current location of the car is: ");
    }

    public void updateLocation() {
        System.out.println("Location of the car is updated");
    }
}

class Auto extends Vehicle implements IGPS {
    @Override
    public void CalculateFare(double distance) {
        double fare = distance * getRatePerKm();
        System.out.println(fare);
    }

    public void getCurrentLocation() {
        System.out.println("Current location of the car is: ");
    }

    public void updateLocation() {
        System.out.println("Location of the car is updated");
    }
}

public class Main {

    public static void processVehicle(Vehicle v) {
        v.getVehicleDetails();
        v.CalculateFare(10);
        System.out.println();
    }

    public static void main(String[] args) {

        // Car Object
        Car c = new Car();
        c.setVehicleId(101);
        c.setDriverName("Rahul");
        c.setRatePerKm(15);

        // Bike Object
        Bike b = new Bike();
        b.setVehicleId(102);
        b.setDriverName("Aman");
        b.setRatePerKm(10);

        // Auto Object
        Auto a = new Auto();
        a.setVehicleId(103);
        a.setDriverName("Rohit");
        a.setRatePerKm(8);

        // Polymorphism
        processVehicle(c);
        processVehicle(b);
        processVehicle(a);

        // GPS Methods
        c.getCurrentLocation();
        c.updateLocation();
    }
}
// made multiple public classes in one file and was accessing the value
// of rateperkm without get

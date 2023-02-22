package is.hi.hbv202g.ass6;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Beetle");
        CarOwner carOwner =new CarOwner("John Doe", car);
        System.out.println("Name of car owner: "+ carOwner.getName());
        System.out.println("Name of owned car: "+ carOwner.theOwnedCar.getName());
    }
}

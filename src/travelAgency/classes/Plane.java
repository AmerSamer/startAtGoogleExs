package travelAgency.classes;

public class Plane implements Vehicle {
    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName() + " has successful transport Plane");
    }
}

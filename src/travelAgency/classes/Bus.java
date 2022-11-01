package travelAgency.classes;

public class Bus implements Vehicle {
    @Override
    public void transport(Passenger passenger) {
        System.out.println(passenger.getName() + " has successful transport Bus");
    }
}

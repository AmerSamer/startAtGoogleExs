package travelAgency;

import travelAgency.classes.Agency;
import travelAgency.classes.Passenger;
import travelAgency.classes.Vehicle;

public class Main {
    public static void main(String[] args) {
        Agency.getInstance();

        Passenger passenger = new Passenger("ramos", Agency.VehicleType.PLANE);
        Vehicle vehicle = Agency.createVehicle(passenger.getFavoriteVehicle());
        vehicle.transport(passenger);

        Passenger passenger1 = new Passenger("modric", Agency.VehicleType.BUS);
        Vehicle vehicle1 = Agency.createVehicle(passenger1.getFavoriteVehicle());
        vehicle1.transport(passenger1);

        Passenger passenger2 = new Passenger("kross", Agency.VehicleType.PLANE);
        Vehicle vehicle2 = Agency.createVehicle(passenger2.getFavoriteVehicle());
        vehicle2.transport(passenger2);

        Passenger passenger3 = new Passenger("tibo", Agency.VehicleType.TAXI);
        Vehicle vehicle3 = Agency.createVehicle(passenger3.getFavoriteVehicle());
        vehicle3.transport(passenger3);

        Passenger passenger4 = new Passenger("vini", Agency.VehicleType.TAXI);
        Vehicle vehicle4 = Agency.createVehicle(passenger4.getFavoriteVehicle());
        vehicle4.transport(passenger4);

    }
}

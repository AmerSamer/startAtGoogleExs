package travelAgency.classes;

public class Passenger {
    private String name;
    private Agency.VehicleType favoriteVehicle;

    public Passenger(String name, Agency.VehicleType favoriteVehicle) {
        this.name = name;
        this.favoriteVehicle = favoriteVehicle;
    }

    public String getName() {
        return name;
    }

    public Agency.VehicleType getFavoriteVehicle() {
        return favoriteVehicle;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", favoriteVehicle=" + favoriteVehicle +
                '}';
    }
}

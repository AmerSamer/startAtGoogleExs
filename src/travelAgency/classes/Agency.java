package travelAgency.classes;

public class Agency {
    private static Agency single_instance = null;
    private static int planeType = 1;
    private static int taxiType = 8;
    private static int busType = 4;
    private static int boatType = 3;

    public static Agency getInstance() {
        if (single_instance == null)
            single_instance = new Agency();
        return single_instance;
    }

    public enum VehicleType {PLANE, TAXI, BUS, BOAT}

    public static Vehicle createVehicle(VehicleType type) {
        switch (type) {
            case PLANE:
                if (planeType > 0) {
                    planeType--;
                    return new Plane();
                }
                System.out.print("Invalid Plane - ");
            case TAXI:
                if (taxiType > 0) {
                    taxiType--;
                    return new Taxi();
                }
                System.out.print("Invalid Taxi - ");
            case BUS:
                if (busType > 0) {
                    busType--;
                    return new Bus();
                }
                System.out.print("Invalid Bus - ");
            case BOAT:
                if (boatType > 0) {
                    boatType--;
                    return new Boat();
                }
                System.out.print("Invalid Boat - ");
            default:
                throw new IllegalArgumentException(String.format("not supported: %s", type));
        }
    }
}

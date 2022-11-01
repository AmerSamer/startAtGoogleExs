package visitor.classes;

public class Asset implements App {
    private int serialNumber;
    private String owner;
    private double rating;

    public Asset(int serialNumber, String owner, double rating) {
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "serialNumber=" + serialNumber +
                ", owner='" + owner + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

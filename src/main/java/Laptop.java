public class Laptop {
    private String brand;
    private double storage;
    private int Ram;

    public Laptop( String brand, double storage, int ram ) {
        this.brand = brand;
        this.storage = storage;
        Ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public double getStorage() {
        return storage;
    }

    public int getRam() {
        return Ram;
    }
}

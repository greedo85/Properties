public class Laptop {
    private String name;
    private double storage;
    private int Ram;

    public Laptop( String name, double storage, int ram ) {
        this.name = name;
        this.storage = storage;
        Ram = ram;
    }

    public String getName() {
        return name;
    }

    public double getStorage() {
        return storage;
    }

    public int getRam() {
        return Ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", storage=" + storage +
                ", Ram=" + Ram +
                '}';
    }
}

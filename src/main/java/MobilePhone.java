public class MobilePhone {
    private String name;
    private int storage;

    public MobilePhone( String name, int storage ) {
        this.name = name;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                ", storage=" + storage +
                '}';
    }
}

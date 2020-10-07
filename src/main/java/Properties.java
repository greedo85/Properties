public class Properties {

    Property[] propertiesArray;
    private int iterator = 0;

    public Properties() {
        propertiesArray = new Property[10];
    }

    public void addProperties( Property property ) {
        propertiesArray[iterator++] = property;
    }
}

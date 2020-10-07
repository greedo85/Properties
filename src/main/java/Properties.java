public class Properties {

    Property [] properties;
    private int iterator=0;
    public Properties()
    {
        properties=new Property[10];
    }

    public void addProperties(Property property)
    {
        properties[iterator++]=property;
    }
}

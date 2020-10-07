public class Properties {

    Property[] propertiesArray;
    private int iterator = 0;

    public Properties() {
        propertiesArray = new Property[10];
    }

    public void addProperties( Property property ) {
        propertiesArray[iterator++] = property;
    }
    public Property findByKey( String name)
    {
        for(int i=0;i<iterator;i++)
        {
            if(propertiesArray[i].getKey()==name)
            {
                System.out.println("Znalazłem: "+propertiesArray[i]);
                return propertiesArray[i];
            }
        }
        return null;
    }
}

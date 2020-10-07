import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyTest {

    @Test
    public void setPropertyTest1() {
        //given
        String key = "Password";
        String passwordValue = "Df67Xy3";
        Property property = new Property(key, passwordValue);
        Properties properties = new Properties();

        //when
        properties.addProperties(property);
        //then
        assertEquals(property, properties.propertiesArray[0]);
        assertEquals(key, properties.propertiesArray[0].getKey());
        assertEquals(passwordValue, properties.propertiesArray[0].getValue());
    }

    @Test
    public void setPropertyTest2() {
        //given
        String key = "Laptop";
        Laptop laptop = new Laptop("Lenovo", 500, 16);
        Property property = new Property(key, laptop);
        Properties properties = new Properties();
        //when
        properties.addProperties(property);
        //then
        assertEquals(laptop, properties.propertiesArray[0].getValue());
    }

    @Test
    public void modifyValue() {
        //given
        String key = "Phone";
        String value = "Samsung Galaxy";
        Property property = new Property(key, value);

        //when
        property.modifyValue("LG G4");

        //then
        assertEquals("LG G4", property.getValue());

    }
    @Test
    public void findByKey()
    {
        //given
        Laptop dell=new Laptop("Dell",500,8);
        Laptop lenovo=new Laptop("Lenovo",250,6);
        Laptop apple=new Laptop("Apple",1000,16);
        MobilePhone samsung=new MobilePhone("Samsung",32);
        MobilePhone motorola=new MobilePhone("Motorola",8);

        Properties properties = new Properties();

        properties.addProperties(new Property("laptop1",dell));
        properties.addProperties(new Property("laptop2",lenovo));
        properties.addProperties(new Property("laptop3",apple));
        properties.addProperties(new Property("telefon1",samsung));
        properties.addProperties(new Property("telefon2",motorola));

        //when


        //then
        assertEquals(properties.propertiesArray[2],properties.findByKey("Apple"));
    }
}

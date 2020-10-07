import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyTest {

    @Test
    public void setPropertyTest() {
        //given
        String key="Password";
        String passwordValue="Df67Xy3";
        Property property =new Property(key, passwordValue);
        Properties properties=new Properties();

        //when
        properties.addProperties(property);
        //then
        assertEquals(property, properties.properties[0]);
        assertEquals(key,properties.properties[0].getKey());
        assertEquals(passwordValue,properties.properties[0].getValue());
    }

}

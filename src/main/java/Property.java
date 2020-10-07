public class Property<T>{

    private String key;
    T value;

    public Property( String key, T value ) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void modifyValue( T value ) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}

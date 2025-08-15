package hw;
public class Person {
    String name;
    String address;

    public Person(String name,String address){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank");
        }
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString() {
        return name + "(" + address + ")";
    }
}

package Autowrite;

/**
 * Created by Subodh on 06/01/2022.
 */
public class Address {
private String name;

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    private String place;

    public Address() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}

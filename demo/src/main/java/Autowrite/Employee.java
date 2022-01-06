package Autowrite;

/**
 * Created by Subodh on 06/01/2022.
 */
public class Employee {
    private Address address;

    public Employee(Address address) {
        System.out.println("value fromn vcon");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }


    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        System.out.println("from setter getter");
        this.address = address;
    }
}

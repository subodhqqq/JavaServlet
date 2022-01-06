package Anotation;

import Autowrite.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Subodh on 06/01/2022.
 */
public class Employee {

    private Address address;
    @Autowired
    public Employee() {
        System.out.println("from con");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }

    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        System.out.println("FROM SETTEER");
        this.address = address;
    }
}

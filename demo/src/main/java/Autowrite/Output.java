package Autowrite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Subodh on 06/01/2022.
 */
public class Output {
    public static void main(String[] arg) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowrite.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

    }
}

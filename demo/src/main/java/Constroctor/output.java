package Constroctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Subodh on 05/01/2022.
 */
public class output {
    public static void main(String[] arg)
    {
        ApplicationContext applicationContextcontext=new ClassPathXmlApplicationContext("ConstructorAgrument.xml");
        Student student1=(Student)applicationContextcontext.getBean("student");
        System.out.print(student1);
    }
}

package ConstructorAmg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Subodh on 05/01/2022.
 */
public class output {

    public static void main(String [] arg){
        ApplicationContext context=new ClassPathXmlApplicationContext("Addition.xml");
        Addition addition= (Addition) context.getBean("addition");
        addition.doSum();
    }
}

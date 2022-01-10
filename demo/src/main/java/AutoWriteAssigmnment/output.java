package AutoWriteAssigmnment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Subodh on 07/01/2022.
 */
public class output {
    public static void main(String [] arg){
        ApplicationContext context=new ClassPathXmlApplicationContext("Hello.xml");
        CollectionAssignment collectionAssignment=(CollectionAssignment) context.getBean("student");
        System.out.println(collectionAssignment);
    }
}
